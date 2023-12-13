package widgets;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Rectangle;

public class SleepWidget {
    
GraphicsGroup sleepGroup;
CanvasWindow sleepCanvas;


    public SleepWidget(){
        sleepGroup = new GraphicsGroup();

    }

    public void createBox(double x, double y, double width, double height){
        Rectangle newBox = new Rectangle(x, y, width, height);
        sleepGroup.add(newBox);

    }


    // public void createSleepBar(){
    //     for ( int i=0; i<=8; i++){
    //         createBox(, i, i, i);

    //     }
    }
