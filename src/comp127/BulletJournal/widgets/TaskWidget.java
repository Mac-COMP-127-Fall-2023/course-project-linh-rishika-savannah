package comp127.BulletJournal.widgets;
import edu.macalester.graphics.*;
import edu.macalester.graphics.ui.Button;
import edu.macalester.graphics.ui.TextField;
import java.awt.Color;
import java.awt.List;
import java.util.function.Consumer;

import java.util.ArrayList;

public class TaskWidget extends GraphicsGroup {
    private final double size;
    private GraphicsGroup group;

    private ArrayList<String> dailyList;
    private ArrayList<String> goalList;
    private ArrayList<String> weeklyList;

    private GraphicsText dailyLabel;
    private GraphicsText goalLabel;
    private GraphicsText weeklyLabel;
    private TextField dailyField, goalField, weeklyField;
    private Button dailyButton, goalButton, weeklyButton;

    private Image icon;
    private Image divider;

    public TaskWidget(double size) {
        this.size = size;

        group = new GraphicsGroup();

        dailyLabel = new GraphicsText();
        dailyLabel.setText("Today task");
        dailyLabel.setFont(FontStyle.BOLD, size * 0.1); //TO DO: set positions to all the labels
        dailyLabel.setPosition(size*0.2, size*0.2);
        dailyField.setPosition(dailyLabel.getX() + 15, dailyLabel.getY());
        group.add(dailyLabel);
        group.add(dailyField);

        goalLabel = new GraphicsText();
        goalLabel.setText("Long-term goals");
        goalLabel.setFont(FontStyle.BOLD, size * 0.1);
        goalLabel.setPosition(size*0.7, size*0.2);
        goalField.setPosition(goalLabel.getX() + 15, goalLabel.getY());
        group.add(goalLabel);
        group.add(goalField);

        weeklyLabel = new GraphicsText();
        weeklyLabel.setText("Weekly tasks");
        weeklyLabel.setFont(FontStyle.BOLD, size * 0.1);
        weeklyLabel.setPosition(size*0.7, size*0.7);
        weeklyField.setPosition(goalLabel.getX() + 15, goalLabel.getY());
        group.add(weeklyLabel);
        group.add(weeklyField);
    }

    public void inputToList(ArrayList<String> list, TextField field) {
        //To do: 
        list.add(field.getText());

    }

    public GraphicsGroup getGraphics() {
        return group;
    }

    public void addButton(TextField field,ArrayList<String> list){
        Button button= new Button("Add");
        button.setPosition(field.getX()+10,field.getY());
        group.add(button);
        
        button.onClick(() -> {
            field.getText();
            list.add(field.getText());
        });
        for (String i : list) {
            GraphicsText newgoal = new GraphicsText(i);
            newgoal.setFont(FontStyle.ITALIC, size * 0.07);
            newgoal.setPosition(field.getX() - 5,list.indexOf(i)*1.5 + field.getY());
            group.add(newgoal);
        }
    }
}
