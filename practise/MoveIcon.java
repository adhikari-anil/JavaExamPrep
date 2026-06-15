
import java.awt.event.*;
import javax.swing.*;

public class MoveIcon extends JFrame implements KeyListener {

    JLabel lbl;
    int y = 150;
    int x = 150;

    public MoveIcon() {
        setLayout(null);

        ImageIcon icon = new ImageIcon("ATM.png");
        lbl = new JLabel(icon);
        lbl.setBounds(300, y, 300, 300);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                y -= 10;
                lbl.setBounds(300, y, 300, 300);
            }
        });

        add(lbl);

        setTitle("Move Icon");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= 10;
            lbl.setBounds(300, y, 300, 300);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y += 10;
            lbl.setBounds(300, y, 300, 300);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 10;
            lbl.setBounds(x, 300, 300, 300);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 10;
            lbl.setBounds(x, 300, 300, 300);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new MoveIcon();
    }
}
