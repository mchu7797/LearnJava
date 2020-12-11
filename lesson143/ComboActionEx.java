package lesson143;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
    private String [] fruits = {"game1", "game2", "game3"};
    private ImageIcon [] images = { new ImageIcon("D:\\one.png"),
            new ImageIcon("D:\\two.png"),
            new ImageIcon("D:\\three.png")};
    private JLabel imgLabel = new JLabel(images[0]);
    private JComboBox<String> strCombo = new JComboBox<String>(fruits);

    public ComboActionEx() {
        setTitle("콤보박스 활용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(strCombo);
        c.add(imgLabel);

        strCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> cb = (JComboBox<String>)e.getSource();
                int index = cb.getSelectedIndex();
                imgLabel.setIcon(images[index]);
            }
        });
        setSize(300,250);
        setVisible(true);
    }
    public static void main(String [] args) {
        new ComboActionEx();
    }
}
