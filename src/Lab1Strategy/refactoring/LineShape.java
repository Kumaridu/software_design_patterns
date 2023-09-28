package Lab1Strategy.refactoring;

import java.awt.*;

public class LineShape implements TwoEndsShape {

    public ScribbleCanvas canvas;
    public int xStart, yStart;
    public Graphics onscreen, offscreen;

    public LineShape(ScribbleCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void drawShape(Point p) {
        canvas.mouseButtonDown = false;
        onscreen.setPaintMode();
        offscreen = canvas.getOffScreenGraphics();
        offscreen.drawLine(xStart, yStart, p.x, p.y);
        canvas.repaint();
    }

    @Override
    public void drawOutline(Point p) {
        if (canvas.mouseButtonDown) {
            onscreen.drawLine(xStart, yStart, canvas.x, canvas.y);
            onscreen.drawLine(xStart, yStart, p.x, p.y);
        }
        canvas.x = p.x;
        canvas.y = p.y;
    }
}
