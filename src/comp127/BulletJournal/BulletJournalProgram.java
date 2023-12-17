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

/**
 * This class runs the main canvas that displays all of the widgets and their buttons.
 */
public class BulletJournalProgram {
    private CanvasWindow canvas;
    private TaskWidget taskWidget;
    private SleepWidget sleepWidget;
    private MoodWidget moodWidget;
    private WaterWidget waterWidget;
    private BulletJournalWidget displayedWidget;
    private Image sleepImage;
    private Image waterImage;
    private Image moodImage;
    private Image taskImage;
    private GraphicsText title;

    /**
     * Creates canvas for all of the widgets to be displayerd on.
     * Initializes all of the widgets and places them and their buttons
     * on the canvas.
     * Places images above each of the widget buttons. 
     * @param size
     */
    public BulletJournalProgram(double size){

        canvas= new CanvasWindow("Bullet Journal",900,800);
        sleepWidget=new SleepWidget(canvas);

        waterWidget=new WaterWidget(600);

        moodWidget= new MoodWidget(600);

        taskWidget = new TaskWidget(600, canvas);

        sleepImage= new Image("MainImages/MainImages.jpeg");
        sleepImage.setMaxWidth(120);
        sleepImage.setMaxHeight(120);
        sleepImage.setPosition(730,20);
        canvas.add(sleepImage);

        waterImage= new Image("MainImages/WaterImage.jpeg");
        waterImage.setMaxWidth(120);
        waterImage.setMaxHeight(120);
        waterImage.setPosition(730,170);
        canvas.add(waterImage);

        moodImage= new Image("MainImages/MoodImage.jpg");
        moodImage.setMaxWidth(120);
        moodImage.setMaxHeight(120);
        moodImage.setPosition(730,320);
        canvas.add(moodImage);

        taskImage= new Image("MainImages/TaskImage.jpeg");
        taskImage.setMaxWidth(120);
        taskImage.setMaxHeight(120);
        taskImage.setPosition(730,470);
        canvas.add(taskImage);

        title= new GraphicsText();
        title.setText("Bullet Journal your day!");

    
        canvas.setBackground(new Color(255, 189, 223, 100));
        addWidgetButtons();
    }

    /**
     * Creates and positions the buttons that correpsond to our widgets.
     * Sets the widget that is displayed on the large screen to the 
     * current displayed widget. 
     */
    private void addWidgetButtons(){
        Button sleepbutton= new Button("Sleep Widget");
        sleepbutton.setPosition(730, 140);
        canvas.add(sleepbutton);
        sleepbutton.onClick(()-> {
            if (displayedWidget!= sleepWidget){
                canvas.add(sleepWidget.getGraphics());
                selectWidgetAtIndex();
                displayedWidget= sleepWidget;  
            }
        });
        

        Button waterbutton= new Button("Water Widget");
        waterbutton.setPosition(730, 290);
        
        canvas.add(waterbutton);
        waterbutton.onClick(()-> {
            if (displayedWidget!= waterWidget){
            canvas.add(waterWidget.getGraphics());
            selectWidgetAtIndex();
            displayedWidget= waterWidget;
            }
        });

        Button moodbutton= new Button("Mood Widget");
        moodbutton.setPosition(730, 440);
        canvas.add(moodbutton);
        moodbutton.onClick(()-> {
            if (displayedWidget!= moodWidget){
            canvas.add(moodWidget.getGraphics());
            selectWidgetAtIndex();
            displayedWidget= moodWidget;
            }    
        });

        Button taskbutton= new Button("Task Widget");
        taskbutton.setPosition(730, 590);
        canvas.add(taskbutton);
        taskbutton.onClick(()-> {
            if (displayedWidget!= taskWidget){
            canvas.add(taskWidget.getGraphics());
            selectWidgetAtIndex();
            displayedWidget= taskWidget;
            }
        });

    }

    /**
     * Removes the previously displayed widget when
     * another button is clicked.
     */
    private void selectWidgetAtIndex() {
        if(displayedWidget!= null){
            canvas.remove(displayedWidget.getGraphics());
        }
    }
      
   
    /**
     * Initializes a new Bullet Journal Program. 
     * @param args
     */
    public static void main(String[] args) {
        BulletJournalProgram bjp = new BulletJournalProgram(600);
    }
    
}
