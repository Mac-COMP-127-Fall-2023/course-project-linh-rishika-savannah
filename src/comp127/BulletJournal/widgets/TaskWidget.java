package comp127.BulletJournal.widgets;
import edu.macalester.graphics.*;
import edu.macalester.graphics.ui.Button;
import edu.macalester.graphics.ui.TextField;
import java.awt.Color;
import java.awt.List;
import java.util.function.Consumer;

import java.util.ArrayList;

public class TaskWidget{
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
    private GraphicsText newgoal;
    private Image divider;

    public static final Color PASTEL_PINK = new Color(201, 150, 216, 100);

    public TaskWidget(double size) {
        this.size = size;

        group = new GraphicsGroup();
        dailyList = new ArrayList<>();
        goalList = new ArrayList<>();
        weeklyList = new ArrayList<>();


        dailyLabel = new GraphicsText();
        dailyLabel.setText("Today task");
        dailyLabel.setFont(FontStyle.BOLD, size * 0.05); 
        dailyLabel.setFillColor(PASTEL_PINK);
        dailyLabel.setPosition(size*0.1, size*0.1);

        dailyField = new TextField();
        dailyField.setPosition(dailyLabel.getX(), dailyLabel.getY()+5);
        addButton(dailyField, dailyList);

        group.add(dailyLabel);
        group.add(dailyField);

        goalLabel = new GraphicsText();
        goalLabel.setText("Long-term goals");
        goalLabel.setFont(FontStyle.BOLD, size * 0.05);
        goalLabel.setFillColor(PASTEL_PINK);
        goalLabel.setPosition(size*0.5, size*0.1);

        goalField = new TextField();
        goalField.setPosition(goalLabel.getX(), goalLabel.getY()+5);
        addButton(goalField, goalList);
        group.add(goalLabel);
        group.add(goalField);

        weeklyLabel = new GraphicsText();
        weeklyLabel.setText("Weekly tasks");
        weeklyLabel.setFont(FontStyle.BOLD, size * 0.05);
        weeklyLabel.setFillColor(PASTEL_PINK);
        weeklyLabel.setPosition(size*0.5, size*0.5);

        weeklyField = new TextField();
        weeklyField.setPosition(weeklyLabel.getX(), weeklyLabel.getY()+5);
        addButton(weeklyField, weeklyList);
        group.add(weeklyLabel);
        group.add(weeklyField);
    }

    // public void inputToList(ArrayList<String> list, TextField field) {
    //     //To do: 
    //     list.add(field.getText());

    // }

    public GraphicsGroup getGraphics() {
        return group;
    }

    public void addToCanvas(CanvasWindow canvas) {
        canvas.add(group);
    }

    public void addButton(TextField field,ArrayList<String> list){
        Button button= new Button("Add");
        button.setPosition(field.getX()+100,field.getY());
        group.add(button);
        
        button.onClick(() -> {
            field.getText();
            list.add(field.getText());
        });
        for (String i : list) {
            newgoal = new GraphicsText(i);
            newgoal.setFont(FontStyle.ITALIC, size * 0.07);
            newgoal.setPosition(field.getX() - 5,list.indexOf(i)*1.5 + field.getY());
            group.add(newgoal);
        }
    }
}
