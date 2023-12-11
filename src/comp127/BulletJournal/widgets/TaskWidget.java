package comp127.BulletJournal.widgets;
import edu.macalester.graphics.*;
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

    private Image icon;

    private Image divider;

    public TaskWidget(double size) {
        this.size = size;

        group = new GraphicsGroup();

        dailyLabel = new GraphicsText();
        dailyLabel.setText("Today task");
        dailyLabel.setFont(FontStyle.BOLD, size * 0.1); //TO DO: set positions to all the labels
        group.add(dailyLabel);

        goalLabel = new GraphicsText();
        goalLabel.setText("Long-term goals");
        goalLabel.setFont(FontStyle.BOLD, size * 0.1);
        group.add(goalLabel);

        weeklyLabel = new GraphicsText();
        weeklyLabel.setText("Reminder");
        weeklyLabel.setFont(FontStyle.BOLD, size * 0.1);
        group.add(weeklyLabel);
    }

    public void inputToList(ArrayList<String> list, TextField field) {
        //To do: 
    }
}
