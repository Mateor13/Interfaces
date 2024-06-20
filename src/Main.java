import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String primerNumero = JOptionPane.showInputDialog("Introduzca el primer numero");
        String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo numero");

        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);
    }
}