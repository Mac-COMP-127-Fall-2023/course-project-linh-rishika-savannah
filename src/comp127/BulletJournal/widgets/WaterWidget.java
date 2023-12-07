package comp127.BulletJournal.widgets;

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
    private String[] images;
    private int counter;
    private String[] texts;

    public WaterWidget(double size){
        this.size=size;
        counter = 0;

        group = new GraphicsGroup();

        icon = new Image(0, 0);
        icon.setMaxWidth(size);
        icon.setMaxHeight(size * 0.5);
        icon.setImagePath("GlassImages/0p.jpg");
        icon.setCenter(size * 0.5, size * 0.55);
        group.add(icon);

        
        label = new GraphicsText();
        label.setText("How much water did you drink today?");
        label.setFillColor(Color.blue);
        label.setFont(FontStyle.BOLD, size * 0.05);
        label.setPosition(size*0.05,size*0.20);
        group.add(label);

        description = new GraphicsText();
        description.setFont(FontStyle.BOLD_ITALIC , size * 0.05);
        description.setText("Hmm you're dehydrated :( ");
        description.setCenter(size * 0.5, size * 0.9);
        group.add(description);
        
        images= new String[6];
        images[0]="GlassImages/0p.jpg";
        images[1]="GlassImages/25p.jpg";
        images[2]="GlassImages/30p.jpg";
        images[3]="GlassImages/50p.jpg";
        images[4]="GlassImages/75p.jpg";
        images[5]="GlassImages/100p.jpg";

        texts= new String[6];
        texts[0]="Hmm you're dehydrated :( ";
        texts[1]="You're still pretty dehydrated";
        texts[2]="You've had a little water";
        texts[3]="That's much better";
        texts[4]="Your body is getting enough water!";
        texts[5]="Hydrated queen";


        
        
        addButton();
        removeButton();

    }

    public void update(){
        String path = images[counter];
        icon.setImagePath(path);
        icon.setCenter(size * 0.5, size * 0.55);
        String text= texts[counter];
        description.setText(text);
        description.setCenter(size * 0.5, size * 0.9);
        
        
    }

    public void addButton(){
        Button button= new Button("More Water!");
        button.setPosition(size*0.5,size);
        group.add(button);
        
        button.onClick(() -> {
            ++counter;
            if (counter > 5){
            counter=5;
            } update();
        });
    }

    public void removeButton(){
        Button button= new Button("Less Water!");
        button.setPosition(size*0.2,size);
        group.add(button);
        
        button.onClick(() -> {
            --counter;
            if (counter < 0){
            counter=0;
            } update();
         });
    }

    public GraphicsObject getGraphics() {
        return group;
    }

    
}
