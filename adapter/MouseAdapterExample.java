
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterExample extends MouseAdapter {

    Frame f;
    int prevX, prevY;

    public MouseAdapterExample() {
        f = new Frame("Mouse Frame..");
        f.addMouseListener(this);
        f.addMouseMotionListener(this);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        prevX = e.getX();
        prevY = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);

        int x = e.getX();
        int y = e.getY();

        g.drawLine(prevX, prevY, x, y);

        prevX = x;
        prevY = y;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }

}
