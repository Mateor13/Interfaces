package Java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {

    private JButton btnOK;
    public JPanel mainPanel;
    private javax.swing.JLabel JLabel;
    private JButton borrarButton;

    public Form1() {
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel.setText("Hola a todos, yo soy Mateo Torres");
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel.setText("");
            }
        });
    }

}
