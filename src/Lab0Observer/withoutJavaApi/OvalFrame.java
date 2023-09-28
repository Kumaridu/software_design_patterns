package Lab0Observer.withoutJavaApi;



import javax.swing.*;
import java.awt.*;

public class OvalFrame extends JFrame implements Observer{

    private int count;
    private Subject subject;

	public OvalFrame() {
            getContentPane().setLayout(null);
            setSize(300,200);
            setTitle("OvalFrame");
            setCount(0);

            SymWindow aSymWindow = new SymWindow();
            this.addWindowListener(aSymWindow);

    }

    @Override
    public void update() {
        Counter counterSubject = (Counter) subject;
        count = counterSubject.getStateCount();
        repaint();
    }

    @Override
    public void setSubject(Subject sub) {
        this.subject = sub;
    }


    class SymWindow extends java.awt.event.WindowAdapter {
            public void windowClosing(java.awt.event.WindowEvent event) {
                Object object = event.getSource();
                if (object == this)
                    OvalFrame_WindowClosing(event);
            }
        }

        void OvalFrame_WindowClosing(java.awt.event.WindowEvent event) {
            dispose();		 // dispose of the Frame.
        }


        public void setCount (int cnt) {
            count=cnt;
            repaint();
        }

        public  void  paint(Graphics display) {
            // clear display first
            Dimension dims = getSize();
            display.clearRect(0,0,dims.width,dims.height);

            int x = 50;
            int y = 30;

            // Magnify value by 9 to get a bigger visual effect
            int height =  count*9;
            int width   = count*9;

            display.setColor( Color.red );

            display.fillOval(x, y, Math.abs(width), Math.abs( height ) );
        }

}

