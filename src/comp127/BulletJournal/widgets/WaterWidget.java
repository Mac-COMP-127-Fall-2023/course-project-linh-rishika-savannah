package widgets;

import edu.macalester.graphics.Image;
import java.awt.Color;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.ui.Button;
import java.util.*;

public class WaterWidget {

    private GraphicsGroup group;
    private GraphicsText label;
    private GraphicsText description;
    private Image icon;
    private double size;
    //private CanvasWindow canvas;
    private String[] images;
    private int counter;

    public WaterWidget(double size){
        this.size=size;
        group = new GraphicsGroup();
        icon = new Image(0, 0);
        icon.setMaxWidth(size);
        icon.setMaxHeight(size * 0.5);
        group.add(icon);
        counter = 0;
        label = new GraphicsText();
        label.setFont(FontStyle.BOLD, size * 0.05);
        group.add(label);

        description = new GraphicsText();
        description.setFont(FontStyle.PLAIN, size * 0.05);
        group.add(description);
        //canvas= new CanvasWindow("WATER", 600, 800);
        
        images= new String[6];
        images[0]="GlassImages/25p.jpg";
        images[1]="GlassImages/30p.jpg";
        images[2]="GlassImages/50p.jpg";
        images[3]="GlassImages/75p.jpg";
        images[4]="GlassImages/100p.jpg";
        
        //canvas.add(group);
        addButton();
        removeButton();

    }

    public void update(){
        String path = images[counter];
        icon.setImagePath(path);
        icon.setCenter(size * 0.5, size * 0.4);
        
    }

    public void addButton(){
        Button button= new Button("Add more!");
        button.setPosition(0,10);
        group.add(button);
        //canvas.add(group);
        button.onClick(() -> {++counter; update();
        if (counter >5){
            counter=5;
        }});
    }

    public void removeButton(){
        Button button= new Button("Remove!");
        button.setPosition(0,40);
        group.add(button);
        //canvas.add(group);
        button.onClick(() -> {--counter; update();
        if (counter <0){
            counter=0;
        }});
    }

    public GraphicsObject getGraphics() {
        return group;
    }

    // public static void main(String[] args) {
    //     new WaterWidget(600);
    // }

    
}
