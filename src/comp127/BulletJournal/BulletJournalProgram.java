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
    private TaskWidget taskwidget;
    private SleepWidget sleepWidget;
    private MoodWidget moodWidget;
    private WaterWidget waterWidget;

    public BulletJournalProgram(double size){
        canvas= new CanvasWindow("Bullet Journal", 600, 800);
        canvas.add(waterWidget.getGraphics());





    }
    public static void main(String[] args) {
        new BulletJournalProgram(600);
    }


    
    
}
