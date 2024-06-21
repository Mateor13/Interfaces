import javax.swing.*;
import Java.*;

public class Main {
    public static void main(String[] args) {
        /*String primerNumero = JOptionPane.showInputDialog("Introduzca el primer numero");
        String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo numero");

        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int suma = numero1 + numero2;
        int resto = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        if (numero2 == 0) {
            String division = "No se puede dividir para cero";
        } else {
            int division = numero1 / numero2;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma + "\nLa resta es: " + resto + "\nLa multiplicación es " + multiplicacion + "\nLa división es: " + division, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);*/
    JFrame frame = new JFrame("Mi aplicación");
    frame.setContentPane(new Form1().mainPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    }
}