package Lab1Strategy.refactoring;

import java.awt.*;

public class RectShape implements TwoEndsShape {


    public ScribbleCanvas canvas;
    public int xStart, yStart;
    public Graphics onscreen, offscreen;

    public RectShape(ScribbleCanvas canvas) {
        this.canvas = canvas;
    }


    @Override
    public void drawShape(Point p) {
        canvas.mouseButtonDown = false;
        onscreen.setPaintMode();
        offscreen = canvas.getOffScreenGraphics();
        offscreen.drawRect(xStart, yStart, p.x-xStart+1, p.y-yStart+1);
        canvas.repaint();
    }

    @Override
    public void drawOutline(Point p) {
        if (canvas.mouseButtonDown) {
            onscreen.drawRect(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1);
            onscreen.drawRect(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);
        }
        canvas.x = p.x;
        canvas.y = p.y;
    }
}
