package Lab1Strategy.refactoring;


import java.awt.*;
import java.awt.event.MouseEvent;

public class ScribbleTool implements Tool {

    protected ScribbleCanvas canvas;

    public ScribbleTool(ScribbleCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void mousePressed(MouseEvent event) {
        Point p = event.getPoint();
        canvas.mouseButtonDown = true;
        canvas.x = p.x;
        canvas.y = p.y;
    }

    @Override
    public void mouseReleased(MouseEvent event) {
        canvas.mouseButtonDown = false;
    }

    @Override
    public void mouseDragged(MouseEvent event) {
        Point p = event.getPoint();
        if (canvas.mouseButtonDown) {
            canvas.getOffScreenGraphics().drawLine(canvas.x, canvas.y, p.x, p.y);
            int xs = Math.min(canvas.x, p.x);
            int ys = Math.min(canvas.y, p.y);
            int dx = Math.abs(p.x-canvas.x) +1;
            int dy = Math.abs(p.y-canvas.y) +1;
            canvas.repaint(xs, ys, dx, dy);
            canvas.x = p.x;
            canvas.y = p.y;
        }
    }
}
