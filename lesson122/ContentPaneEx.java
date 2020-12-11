package lesson122;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("제목이다 이마리야");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("2020E8534"));
        contentPane.add(new JButton("추민석"));
        contentPane.add(new JButton("OK"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
