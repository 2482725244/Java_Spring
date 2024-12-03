package swing;

import javax.swing.*;
import java.awt.*;

public class TestCheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Container container = frame.getContentPane();
        container.setBackground(Color.pink);
        container.setLayout(null);

        JCheckBox checkBox1 = new JCheckBox("Java");
        JCheckBox checkBox2 = new JCheckBox("python");
        JCheckBox checkBox3 = new JCheckBox("c++");

        checkBox1.setBounds(10,10,180,20);
        checkBox2.setBounds(80,80,180,20);
        checkBox3.setBounds(150,150,180,20);

        container.add(checkBox1);
        container.add(checkBox2);
        container.add(checkBox3);

//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(checkBox1);
//        buttonGroup.add(checkBox2);
//        buttonGroup.add(checkBox3);

        frame.setBounds(100,100,500,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
