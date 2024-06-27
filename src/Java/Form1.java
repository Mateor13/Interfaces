package Java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {

    private JButton rest;
    public JPanel mainPanel;
    private JLabel respuesta1;
    private JButton div;
    private JTextField num1;
    private JButton sum;
    private JTextField num2;
    private JButton multi;
    private JButton raiz;
    private JButton potencia;
    private JLabel respuesta2;
    private JButton seno;
    private JButton coseno;

    public Form1() {
        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Form1.this.num1.getText());
                double num2 = Double.parseDouble(Form1.this.num2.getText());
                double suma = num1 + num2;
                respuesta1.setText("Respuesta: "+ String.format("%.2f", suma));
                respuesta2.setText("");
            }
        });
        rest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Form1.this.num1.getText());
                double num2 = Double.parseDouble(Form1.this.num2.getText());
                double resta = num1 - num2;
                respuesta1.setText("Respuesta: "+ String.format("%.2f", resta));
                respuesta2.setText("");
            }
        });
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Form1.this.num1.getText());
                double num2 = Double.parseDouble(Form1.this.num2.getText());
                double mul = num1 * num2;
                respuesta1.setText("Respuesta: "+ String.format("%.2f", mul));
                respuesta2.setText("");
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Form1.this.num1.getText());
                double num2 = Double.parseDouble(Form1.this.num2.getText());
                double divi;
                if(num2==0){
                    respuesta1.setText("No se puede dividir para cero");
                }else{
                    divi = num1/num2;
                    respuesta1.setText("Respuesta: "+ String.format("%.2f", divi));
                    respuesta2.setText("");
                }
            }
        });

        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado1 = (float) Math.sqrt(numero1);
                float resultado2 = (float) Math.sqrt(numero2);
                respuesta1.setText("Respuesta(del primer numero): "+ String.format("%.2f", resultado1));
                respuesta2.setText("Respuesta(del segundo numero): "+ String.format("%.2f", resultado2));
            }
        });
        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = (float) Math.pow(numero1,numero2);
                respuesta1.setText("Respuesta: "+ String.format("%.2f", resultado));
                respuesta2.setText("");
            }
        });
        //Integracion de los botones y funciones del seno y coseno
        seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado1 = (float) Math.sin(numero1);
                float resultado2 = (float) Math.sin(numero2);
                respuesta1.setText("Respuesta(del primer numero): "+ String.format("%.2f", resultado1));
                respuesta2.setText("Respuesta(del segundo numero): "+ String.format("%.2f", resultado2));
            }
        });
        coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado1 = (float) Math.cos(numero1);
                float resultado2 = (float) Math.cos(numero2);
                respuesta1.setText("Respuesta(del primer numero): "+ String.format("%.2f", resultado1));
                respuesta2.setText("Respuesta(del segundo numero): "+ String.format("%.2f", resultado2));
            }
        });
    }

}
