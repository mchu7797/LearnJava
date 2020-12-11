package lesson122;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx() {
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);

        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130, 50);
        la.setSize(200, 20);
        container.add(la);

        JLabel la2 = new JLabel("2020E8534 추민석");
        la2.setLocation(130, 70);
        la2.setSize(200, 20);
        container.add(la2);

        for (int i = 1; i <= 9; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i * 15, i * 15);
            b.setSize(50, 20);
            container.add(b);
        }
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}
