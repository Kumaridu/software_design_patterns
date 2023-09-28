package Lab1Strategy.refactoring;


import java.awt.event.MouseEvent;

public interface Tool {

    void mousePressed(MouseEvent event);

    void mouseReleased(MouseEvent event);

    void mouseDragged(MouseEvent event);
}
