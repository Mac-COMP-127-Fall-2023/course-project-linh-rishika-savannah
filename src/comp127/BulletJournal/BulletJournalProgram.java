package comp127.BulletJournal;

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
    private TaskWidget taskWidget;
    private SleepWidget sleepWidget;
    private MoodWidget moodWidget;
    private WaterWidget waterWidget;
    private double miniWidgetSize, largeWidgetSize;
    private List<BulletJournalWidget> miniWidgets, largeWidgets;
    private BulletJournalWidget displayedLargeWidget;
    private Rectangle selectionHighlight;

    public BulletJournalProgram(double size){
        this.largeWidgetSize = largeWidgetSize;
        largeWidgets = createWidgets(largeWidgetSize);

        miniWidgetSize = largeWidgetSize / largeWidgets.size();  // so they stack along one edge
        miniWidgets = createWidgets(miniWidgetSize);

        this.canvas= new CanvasWindow("Bullet Journal",
            (int) Math.round(largeWidgetSize + miniWidgetSize),
            (int) Math.round(largeWidgetSize));


        canvas.setBackground(new Color(255, 189, 223));
        waterWidget= new WaterWidget(600);
        // canvas.add(waterWidget.getGraphics());
        moodWidget= new MoodWidget(600);
        sleepWidget= new SleepWidget(canvas);
        canvas.add(sleepWidget.getGraphics());

        selectionHighlight = new Rectangle(0, 0, miniWidgetSize, miniWidgetSize);  // selectWidgetAtIndex() will position it
        selectionHighlight.setStroked(false);
        selectionHighlight.setFillColor(new Color(0x7FFFFFFF, true));
        canvas.add(selectionHighlight);


        double y = 0;
        for (BulletJournalWidget widget : miniWidgets) {
            canvas.add(widget.getGraphics(), largeWidgetSize, y);
            y += miniWidgetSize;
        }

        selectWidgetAtIndex(0);

        

        canvas.onClick(event -> {
            if (event.getPosition().getX() >= largeWidgetSize) {
                selectWidgetAtIndex(
                    (int) (event.getPosition().getY() / largeWidgetSize * miniWidgets.size()));
            }
        });

        canvas.draw();

        
    }

    private List<BulletJournalWidget> createWidgets(double size) {
        return List.of(
            new SleepWidget(canvas),
            new WaterWidget(size),  
            new MoodWidget(size));

    }

    private void selectWidgetAtIndex(int index) {

        if ( index <0 || index> largeWidgets.size()){
            return;
        }

        if(displayedLargeWidget!= null){
            canvas.remove(displayedLargeWidget.getGraphics());
        }
        displayedLargeWidget= largeWidgets.get(index);
       
        if (displayedLargeWidget!= null){
            canvas.add(displayedLargeWidget.getGraphics());
        }
        selectionHighlight.setPosition(largeWidgetSize, miniWidgetSize * index);
    }
    public static void main(String[] args) {
       new BulletJournalProgram(600);
    }





    
    
}
