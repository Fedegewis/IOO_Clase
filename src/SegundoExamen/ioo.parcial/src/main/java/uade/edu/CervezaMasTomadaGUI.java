package uade.edu;

import javax.swing.*;

public class CervezaMasTomadaGUI extends JFrame {

    private JPanel panelPrincipal;

    public CervezaMasTomadaGUI() {
        super("Cerveza Mas Tomada GUI");


        panelPrincipal = new JPanel();


        getContentPane().add(panelPrincipal);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CervezaMasTomadaGUI();
    }
}
