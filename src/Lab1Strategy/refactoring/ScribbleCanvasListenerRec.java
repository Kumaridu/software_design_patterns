package Lab1Strategy.refactoring;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ScribbleCanvasListenerRec
        implements MouseListener, MouseMotionListener {

  protected Lab1 drawframe;
  protected ScribbleCanvas canvas;

  public ScribbleCanvasListenerRec(ScribbleCanvas canvas, Lab1 drawframe) {
    this.canvas = canvas;
    this.drawframe=drawframe;
  }

  public void mousePressed(MouseEvent e) {
    Point p = e.getPoint();
    drawframe.getCurrentTool().mouseDragged(e);
  } 

  public void mouseReleased(MouseEvent e) {
    Point p = e.getPoint();
    drawframe.getCurrentTool().mouseReleased(e);
  }    

  public void mouseDragged(MouseEvent e) {
    Point p = e.getPoint(); 
    drawframe.getCurrentTool().mouseDragged(e);
  }

  public void mouseClicked(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}  
  public void mouseExited(MouseEvent e) {}
  public void mouseMoved(MouseEvent e) {}


}

