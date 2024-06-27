import javax.swing.*;
import Java.*;

public class Main {
    public static void main(String[] args) {
    JFrame frame = new JFrame("Mi aplicación");
    frame.setContentPane(new Form1().mainPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    }
}