package comp127.BulletJournal.widgets;
import java.awt.Color;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.ui.Button;

public class MoodWidget implements BulletJournalWidget{

    private GraphicsGroup group;
    private GraphicsText label;
    private GraphicsText description;
    private double size;
    private String[] texts;

    public MoodWidget(double size){
        this.size=size;
        group = new GraphicsGroup();
        label= new GraphicsText();
        label.setText("How are you feeling today?");
        label.setFont(FontStyle.BOLD, size * 0.05);
        label.setPosition(size*0.15,size*0.20);
        group.add(label);
        createEmojis();

        description= new GraphicsText();
        description.setFont(FontStyle.ITALIC, size*0.04);
        description.setFillColor(Color.RED);

        texts= new String[6];
        texts[0]= "Life is happy and content";
        texts[1]= "Sorry you feel nauseous :(";
        texts[2]= "You won't always be sad ! ";
        texts[3]= "Yay! You had a good day";
        texts[4]= "ooooh you feel mischevious";
        texts[5]= "boring uneventful day";

        createButton();


    }

    public void createEmojis(){
        GraphicsObject emoji1= EmojiHelper.createContentedFace(100);
        emoji1.setPosition(size * 0.1, size * 0.35);
        group.add(emoji1);

        GraphicsObject emoji2= EmojiHelper.createNauseousFace(100);
        emoji2.setPosition(size * 0.4, size * 0.35);
        group.add(emoji2);

        GraphicsObject emoji3= EmojiHelper.createFrownyFace(100);
        emoji3.setPosition(size * 0.7, size * 0.35);
        group.add(emoji3);

        GraphicsObject emoji4= EmojiHelper.createSmileyFace(100);
        emoji4.setPosition(size * 0.1, size * 0.65);
        group.add(emoji4);

        GraphicsObject emoji5= EmojiHelper.createWinkingFace(100);
        emoji5.setPosition(size * 0.4, size * 0.65);
        group.add(emoji5);

        GraphicsObject emoji6= EmojiHelper.createBoredFace(100);
        emoji6.setPosition(size * 0.7, size * 0.65);
        group.add(emoji6);
        
    }

    public void createButton(){
        Button button1= new Button("Content");
        button1.setPosition(size * 0.1, size * 0.55);
        group.add(button1);
        
        button1.onClick(() -> {
            description.setText(texts[0]);
            description.setPosition(size * 0.2, size);
            group.add(description);

    
        });

        Button button2= new Button("Nauseous");
        button2.setPosition(size * 0.4, size * 0.55);
        group.add(button2);
        
        button2.onClick(() -> {
            description.setText(texts[1]);
            description.setPosition(size * 0.2, size);
            group.add(description);
        });

        Button button3= new Button("Sad");
        button3.setPosition(size * 0.7, size * 0.55);
        group.add(button3);
        
        button3.onClick(() -> {
            description.setText(texts[2]);
            description.setPosition(size * 0.2, size);
            group.add(description);
        });

        Button button4= new Button("Sad");
        button4.setPosition(size * 0.1, size * 0.85);
        group.add(button4);
        
        button4.onClick(() -> {
            description.setText(texts[3]);
            description.setPosition(size * 0.2, size);
            group.add(description);
        });

        Button button5= new Button("Mischevious");
        button5.setPosition(size * 0.4, size * 0.85);
        group.add(button5);
        
        button5.onClick(() -> {
            description.setText(texts[4]);
            description.setPosition(size * 0.2, size);
            group.add(description);
        });

        Button button6= new Button("Bored");
        button6.setPosition(size * 0.7, size * 0.85);
        group.add(button6);
        
        button6.onClick(() -> {
            description.setText(texts[5]);
            description.setPosition(size * 0.2, size);
            group.add(description);
        });
        

    }
    public GraphicsObject getGraphics() {
        return group;
    }

    

    





    
    
}
