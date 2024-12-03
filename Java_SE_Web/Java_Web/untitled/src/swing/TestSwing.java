package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TestSwing {

    public static void main(String[] args) {
        String title = "My first swing program";
        JFrame frame = new JFrame(title);
        JDialog dialog = new JDialog(frame,"session");

        Container jcontainer = dialog.getContentPane();
        Container fcontainer = frame.getContentPane();
        jcontainer.setBackground(Color.green);
        fcontainer.setBackground(Color.pink);

        JButton button = new JButton("Open new session");
        JLabel label = new JLabel("Hello world!");

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
                dialog.setBounds(410,410,300,100);
            }
        });

        fcontainer.add(button);
        jcontainer.add(label);
        //container.add(new JLabel("上文老弟"));


        frame.setVisible(true);
        frame.setBounds(400,400,400,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
