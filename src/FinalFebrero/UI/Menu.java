package FinalFebrero.UI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JPanel contentPane;


    public static void main(String [] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Menu menu=new Menu();
                    menu.setVisible(true);
                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        });
    }

    public Menu(){
        setTitle("Valor neto por cliente");
        setBounds(50,50,600,600);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUsuario=new JLabel("Usuario");
        lblUsuario.setBounds(10,11,81,14);
        contentPane.add(lblUsuario);

        JTextField txtUsuario=new JTextField();
        txtUsuario.setBounds(112,11,305,20);
        contentPane.add(txtUsuario);





    }

}
