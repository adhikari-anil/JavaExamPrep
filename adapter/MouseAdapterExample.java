
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterExample extends MouseAdapter {

    Frame f;

    public MouseAdapterExample() {
        f = new Frame("Mouse Frame..");
        f.addMouseListener(this);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);
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
