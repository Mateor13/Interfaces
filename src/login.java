import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    public JPanel main;
    private JTextField contarsenia;
    private JTextField usuario;
    private JButton borrarButton;
    private JButton okButton;
    private JLabel Validacion;
    String str1 = "java", str2 = "java";

    public login() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(str1.equals(usuario.getText())&& str2.equals(contarsenia.getText())) {
                        Validacion. setText("Credenciales Correctas");
                }else{
                    Validacion. setText("Credenciales Incorrectas");
                }
            }
        });
    }
}
