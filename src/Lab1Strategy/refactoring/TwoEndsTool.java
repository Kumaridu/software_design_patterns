package Lab1Strategy.refactoring;

import java.awt.*;
import java.awt.event.MouseEvent;

public class TwoEndsTool implements Tool {

    protected ScribbleCanvas canvas;
    protected int xStart, yStart;
    protected Graphics onscreen, offscreen;
    private TwoEndsShape shape;

    public TwoEndsTool(TwoEndsShape shape) {
        this.shape = shape;
    }

    @Override
    public void mousePressed(MouseEvent event) {
        Point p = event.getPoint();
        canvas.mouseButtonDown = true;
        xStart = canvas.x = p.x;
        yStart = canvas.y = p.y;
        onscreen = canvas.getGraphics();
        onscreen.setXORMode(Color.darkGray);
        onscreen.setColor(Color.lightGray);
    }

    @Override
    public void mouseReleased(MouseEvent event) {
        Point p = event.getPoint();
        shape.drawShape(p);
    }

    @Override
    public void mouseDragged(MouseEvent event) {
        Point p = event.getPoint();
        shape.drawOutline(p);
    }
}
