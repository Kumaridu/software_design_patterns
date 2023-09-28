package Lab0Observer.withJavaApi;


import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class RectFrame extends JFrame implements Observer {

    private int count;

    public RectFrame() {
        getContentPane().setLayout(null);
        setSize(300,200);
        setTitle("RectangleFrame");
        setCount(0);

        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
    }



    @Override
    public void update(Observable o, Object arg) {
        Counter counter = (Counter) o;
        count = counter.getStateCount();
        repaint();
    }


    class SymWindow extends java.awt.event.WindowAdapter
    {
        public void windowClosing(java.awt.event.WindowEvent event)
        {
            Object object = event.getSource();
            if (object == this)
                RectFrame_WindowClosing(event);
        }
    }

    void RectFrame_WindowClosing(java.awt.event.WindowEvent event)
    {
        dispose();		 // dispose of the Frame.
    }

    public void setCount (int cnt){
        count=cnt;
        repaint();
    }

    public  void  paint(  Graphics display  )
    {
        // clear display first
        Dimension sizes = getSize();
        display.clearRect(0,0,sizes.width,sizes.height);

        int x = 50;
        int y = 30;

        // Magnify value by 9 to get a bigger visual effect
        int height =  count*9;
        int width = count*9;

        display.setColor( Color.red );

        display.fillRect(x, y, Math.abs(width), Math.abs( height ) );
    }
}
