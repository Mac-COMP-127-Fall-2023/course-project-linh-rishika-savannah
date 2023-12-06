package comp127.BulletJournal.widgets;
import edu.macalester.graphics.*;
import edu.macalester.graphics.ui.TextField;
import java.awt.Color;
import java.util.function.Consumer;

import java.util.ArrayList;

public class TaskWidget extends GraphicsGroup {
    private CanvasWindow canvas;
    private final double size;
    private GraphicsGroup group;

    private ArrayList<String> taskList;
    private ArrayList<String> goalList;
    private ArrayList<String> reminderList;

    private GraphicsText taskLabel;
    private GraphicsText goalLabel;
    private GraphicsText reminderLabel;
    private TextField taskField, goalField, reminderField;

    private Image icon;

    private Image divider;

    public TaskWidget(double size) {
        this.size = size;

        group = new GraphicsGroup();

        taskLabel = new GraphicsText();
        taskLabel.setText("Today task");
        taskLabel.setFont(FontStyle.BOLD, size * 0.1); //TO DO: set positions to all the labels
        group.add(taskLabel);

        goalLabel = new GraphicsText();
        goalLabel.setText("Long-term goals");
        goalLabel.setFont(FontStyle.BOLD, size * 0.1);
        group.add(goalLabel);

        reminderLabel = new GraphicsText();
        reminderLabel.setText("Reminder");
        reminderLabel.setFont(FontStyle.BOLD, size * 0.1);
        group.add(reminderLabel);
    }

    private TextField addComponentField(String label, double x, double y) {

        GraphicsText labelGraphics = new GraphicsText(label);
        labelGraphics.setPosition(-labelGraphics.getWidth() - 5, y);
        add(labelGraphics);

        TextField field = new TextField();
        field.setPosition(0, y);
        add(field);

        labelGraphics.setCenter(labelGraphics.getCenter().getX(), field.getCenter().getY());
        return field;
    }

    // private void readIntField(TextField field, Consumer<String> updateAction) {
    //     try {
    //         updateAction.accept(
    //                 field.getText());
    //         field.setBackground(Color.WHITE);
    //     } catch () {
    //         field.setBackground(new Color(0xFFCCCC));
    //     }
    // }
}
