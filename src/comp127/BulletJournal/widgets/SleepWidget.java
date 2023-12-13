package comp127.BulletJournal.widgets;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Rectangle;

public class SleepWidget {
    
GraphicsGroup sleepGroup;
CanvasWindow sleepCanvas;

private static final double BOX_WIDTH= 20;
private static final double BOX_HEIGHT= 20;



    public SleepWidget(){
        sleepGroup = new GraphicsGroup();
    }

    public void createBox(double x, double y, double width, double height){
        Rectangle newBox = new Rectangle(x, y, width, height);
        sleepGroup.add(newBox);
        System.out.println("box created");
    }


    public void createSleepBar(){
        double x = 50;
        double y= 100;
        for (int i=0; i<=8; i++){
            createBox(x, y, BOX_WIDTH, BOX_HEIGHT);
            x= x + BOX_WIDTH;
        }

    }

    public GraphicsObject getGraphics() {
        createSleepBar();
        System.out.println("got group");
        return sleepGroup;
    }
}
