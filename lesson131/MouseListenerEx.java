package lesson131;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame {
    private JLabel label = new JLabel("Hello");

    public MouseListenerEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.addMouseListener(new MyMouseListener());

        container.setLayout(null);
        label.setSize(50, 20);
        label.setLocation(30, 30);
        container.add(label);

        setSize(250, 250);
        setVisible(true);

    }

    class MyMouseListener implements MouseListener {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            label.setLocation(x, y);
        }

        public void mouseReleased(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String [] args) {
        new MouseListenerEx();
    }

}
