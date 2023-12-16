package comp127.BulletJournal.widgets;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Point;
import edu.macalester.graphics.Rectangle;


import java.awt.Color;
import java.awt.Label;
import java.util.HashMap;

import org.w3c.dom.css.Rect; 

public class SleepWidget implements BulletJournalWidget {
    
GraphicsGroup sleepGroup;
CanvasWindow sleepCanvas;

HashMap<Rectangle, Integer> boxNums;
HashMap<Integer, Color> colorNums;

private static final double BOX_WIDTH= 2;
private static final double BOX_HEIGHT= 2;
private double size;
private GraphicsText question;

private Color colorOne;
private Color colorTwo;
private Color colorThree;
private Color colorFour;
private Color colorFive;
private Color colorSix;
private Color colorSeven;
private Color colorEight;


    public SleepWidget(CanvasWindow canvas){
        sleepGroup = new GraphicsGroup();
        size = 10;
        question = new GraphicsText("How many hours of sleep did you get last night?");
        question.setPosition(15*size, 45*size);
        sleepGroup.add(question);
        boxNums = new HashMap<Rectangle, Integer>();
        colorNums = new HashMap<Integer, Color>();

        colorOne= new Color(255, 0, 0);
        colorNums.put(1, colorOne);

        colorTwo= new Color(255, 63, 0);
        colorNums.put(2, colorTwo);

        colorThree= new Color(255, 126, 0);
        colorNums.put(3, colorThree);

        colorFour= new Color(255, 192, 0);
        colorNums.put(4, colorFour);

        colorFive= new Color(255, 255, 0);
        colorNums.put(5, colorFive);

        colorSix= new Color(170, 255, 0);
        colorNums.put(6, colorSix);
        
        colorSeven= new Color(85, 255, 0);
        colorNums.put(7, colorSeven);

        colorEight= new Color(0, 255, 0);
        colorNums.put(8, colorEight);

        createSleepBar();
        canvas.onClick((event) -> clickBox(event.getPosition()));
    }

    public Rectangle createButton(double x, double y, double width, double height){
        Rectangle newBox = new Rectangle(x*size, y*size, width*size, height*size);
        System.out.println(height*size);
        System.out.println(y*size);
        System.out.println(x*size);
        sleepGroup.add(newBox);
        return newBox;

    }


    public void createSleepBar(){
        double x = 20;
        double y= 50;
        Integer boxCount = 1;
        for (int i=0; i<8; i++){
            GraphicsText nums = new GraphicsText(boxCount.toString(), x*size, y*size +40);
            sleepGroup.add(nums);
            Rectangle newBox= createButton(x, y, BOX_WIDTH, BOX_HEIGHT);
            x= x + (BOX_WIDTH);
            boxCount = boxCount +1;
            boxNums.put(newBox, boxCount);
        }
    }



    public Rectangle getBoxAt(Point location){
        if (sleepGroup.getElementAt(location) instanceof Rectangle){
            return (Rectangle) sleepGroup.getElementAt(location);
        }
        return null;
    }



    public void clickBox(Point location){
        System.out.println(getBoxAt(location));
        if (getBoxAt(location)!= null){

            Integer num= boxNums.get(getBoxAt(location));

            Color color = colorNums.get(num-1);
            //System.out.println("color number = "+ color);

            getBoxAt(location).setFillColor(color);
            //System.out.println("box clicked");

        }
    }

    public GraphicsObject getGraphics() {
        return sleepGroup;
    }



}
