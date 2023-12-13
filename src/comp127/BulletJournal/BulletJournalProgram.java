package comp127.BulletJournal;

import comp127.BulletJournal.widgets.*;
import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Rectangle;

import java.awt.Color;
import java.util.List;

public class BulletJournalProgram {
    private CanvasWindow canvas;
    private double size;
    private TaskWidget taskWidget;
    private SleepWidget sleepWidget;
    private MoodWidget moodWidget;
    private WaterWidget waterWidget;

    public BulletJournalProgram(double size){
        canvas= new CanvasWindow("Bullet Journal", 600, 800);
        // waterWidget= new WaterWidget(600);
        // canvas.add(waterWidget.getGraphics());

        // sleepWidget = new SleepWidget();
        // canvas.add(sleepWidget.getGraphics());

        taskWidget = new TaskWidget(600);
        canvas.add(taskWidget.getGraphics());
    }
    public static void main(String[] args) {
        BulletJournalProgram bjp = new BulletJournalProgram(600);
    }


    
    
}
