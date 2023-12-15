package comp127.BulletJournal;

import comp127.BulletJournal.widgets.*;
import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Rectangle;
import edu.macalester.graphics.ui.Button;

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

        canvas= new CanvasWindow("Bullet Journal",900,800);
        sleepWidget=new SleepWidget(canvas);
        

        canvas.setBackground(new Color(255, 189, 223));
        addWidgetButtons();
    }

    private void addWidgetButtons(){
        Button sleepbutton= new Button("Sleep Widget");
        sleepbutton.setPosition(80, 110);
        canvas.add(sleepbutton);
        sleepbutton.onClick(()-> canvas.add(sleepWidget.getGraphics()));

        Button waterbutton= new Button("Sleep Widget");
        waterbutton.setPosition(80, 140);
        canvas.add(sleepbutton);
        sleepbutton.onClick(()-> canvas.add(waterWidget.getGraphics()));

        




        
        
    }
      
        
        

   
    public static void main(String[] args) {
        BulletJournalProgram bjp = new BulletJournalProgram(600);
    }
    
}
