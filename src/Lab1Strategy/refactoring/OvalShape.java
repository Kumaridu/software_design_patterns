package Lab1Strategy.refactoring;

import java.awt.*;

public class OvalShape implements TwoEndsShape {

    public ScribbleCanvas canvas;
    public int xStart, yStart;
    public Graphics onscreen, offscreen;

    public OvalShape(ScribbleCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void drawShape(Point p) {
        canvas.mouseButtonDown = false;
        onscreen.setPaintMode();
        offscreen = canvas.getOffScreenGraphics();
        offscreen.drawOval(xStart, yStart, p.x-xStart+1, p.y-yStart+1);
        canvas.repaint();
    }

    @Override
    public void drawOutline(Point p) {
        if (canvas.mouseButtonDown) {
            onscreen.drawOval(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1);
            onscreen.drawOval(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);
        }
        canvas.x = p.x;
        canvas.y = p.y;
    }
}
