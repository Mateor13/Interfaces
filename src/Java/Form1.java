package Java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {

    private JButton rest;
    public JPanel mainPanel;
    private JLabel LabelOK;
    private JButton div;
    private JTextField prim;
    private JButton sum;
    private JTextField seg;
    private JLabel Resultado;
    private JButton multi;

    public Form1() {
        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(prim.getText());
                double num2 = Double.parseDouble(seg.getText());
                double suma = num1 + num2;
                Resultado.setText(String.valueOf(suma));
            }
        });
        rest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(prim.getText());
                double num2 = Double.parseDouble(seg.getText());
                double suma = num1 - num2;
                Resultado.setText(String.valueOf(suma));
            }
        });
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(prim.getText());
                double num2 = Double.parseDouble(seg.getText());
                double mul = num1 * num2;
                Resultado.setText(String.valueOf(mul));
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(prim.getText());
                double num2 = Double.parseDouble(seg.getText());
                double divi;
                if(num2==0){
                    Resultado.setText("No se puede dividir para cero");
                }else{
                    divi = num1/num2;
                Resultado.setText(String.valueOf(divi));}
            }
        });

    }

}
