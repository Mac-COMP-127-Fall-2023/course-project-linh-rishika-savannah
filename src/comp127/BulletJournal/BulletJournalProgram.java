package comp127.BulletJournal;

import comp127.BulletJournal.widgets.*;
import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
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
    private BulletJournalWidget displayedWidget;
    private BulletJournalWidget currentWidget;
    private Image sleepImage;
    private Image waterImage;
    private Image moodImage;
    private GraphicsText title;

    public BulletJournalProgram(double size){

        canvas= new CanvasWindow("Bullet Journal",900,800);
        sleepWidget=new SleepWidget(canvas);

        waterWidget=new WaterWidget(600);

        moodWidget= new MoodWidget(600);

        //taskWidget = new TaskWidget(600, canvas);

        sleepImage= new Image("MainImages/MainImages.jpeg");
        sleepImage.setMaxWidth(150);
        sleepImage.setMaxHeight(150);
        sleepImage.setPosition(700,100);
        canvas.add(sleepImage);

        waterImage= new Image("MainImages/WaterImage.jpeg");
        waterImage.setMaxWidth(150);
        waterImage.setMaxHeight(150);
        waterImage.setPosition(700,350);
        canvas.add(waterImage);

        moodImage= new Image("MainImages/MoodImage.jpg");
        moodImage.setMaxWidth(150);
        moodImage.setMaxHeight(150);
        moodImage.setPosition(700,600);
        canvas.add(moodImage);

        title= new GraphicsText();
        title.setText("Bullet Journal your day!");

        

        canvas.setBackground(new Color(255, 189, 223));
        addWidgetButtons();
    }

    private void addWidgetButtons(){
        Button sleepbutton= new Button("Sleep Widget");
        sleepbutton.setPosition(700, 300);
        canvas.add(sleepbutton);
        sleepbutton.onClick(()-> {
            if (displayedWidget!= sleepWidget){
                if (displayedWidget == taskWidget) {
                    canvas.remove(taskWidget.getGraphics());}
                canvas.add(sleepWidget.getGraphics());
                selectWidgetAtIndex();
                displayedWidget= sleepWidget; 
                
            }
        });
        

        Button waterbutton= new Button("Water Widget");
        waterbutton.setPosition(700, 500);
        
        canvas.add(waterbutton);
        waterbutton.onClick(()-> {
            if (displayedWidget!= waterWidget){
            canvas.add(waterWidget.getGraphics());
            selectWidgetAtIndex();
            displayedWidget= waterWidget;
            }
        });

        Button moodbutton= new Button("Mood Widget");
        moodbutton.setPosition(700, 750);
        canvas.add(moodbutton);
        moodbutton.onClick(()-> {
            if (displayedWidget!= moodWidget){
            canvas.add(moodWidget.getGraphics());
            selectWidgetAtIndex();
            displayedWidget= moodWidget;
            }    
        });

        // Button taskbutton= new Button("Task Widget");
        // taskbutton.setPosition(750, 290);
        // canvas.add(taskbutton);
        // taskbutton.onClick(()-> {
        //     if (displayedWidget!= taskWidget){
        //     canvas.add(taskWidget.getGraphics());
        //     selectWidgetAtIndex();
        //     displayedWidget= taskWidget;
        //     }
        // });
    }

    private void selectWidgetAtIndex() {
        if(displayedWidget!= null){
            System.out.println("we removed something");
            canvas.remove(displayedWidget.getGraphics());
        }
    }
      
   
    public static void main(String[] args) {
        BulletJournalProgram bjp = new BulletJournalProgram(600);
    }
    
}
