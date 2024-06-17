package Simulacro.UI;

import Simulacro.Controller.EmpresaElectricaController;
import Simulacro.DTO.UsuarioDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TablaUsuarios extends JFrame {

    private JPanel topPanel;
    private JTable table;
    private JScrollPane scrollPane;
    private String[] columns = new String[3];
    private String [][] data= new String[3][3];
    JButton button=new JButton();
    EmpresaElectricaController empresa=null;

    public TablaUsuarios(){
        setTitle("Usuarios totales");
        setSize(300,300);
        topPanel=new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);
        columns=new String[]{"NroUsuario","Localidad","Provincia"};
        empresa=EmpresaElectricaController.getInstance();
        data=convertDtoToData(empresa.buscarUsuarios());
        DefaultTableModel model=new DefaultTableModel(data,columns);
        table=new JTable();
        table.setModel(model);
        scrollPane=new JScrollPane(table);
        topPanel.add(scrollPane,BorderLayout.CENTER);

    }






    public String[][] convertDtoToData (Collection<UsuarioDTO>dtos){
        List<UsuarioDTO> dtoList=new ArrayList<>(dtos);
        String[] [] data=new String[dtos.size()][3];
        for(int i=0;i<dtoList.size();i++){
            data[i][0]=dtoList.get(i).getNroUsuario();
            data[i][1]=dtoList.get(i).getLocalidad();
            data[i][2]=dtoList.get(i).getProvincia();
        }
        return data;
    }



    public static void main(String args [])throws Exception {
        TablaUsuarios tabla = new TablaUsuarios();
        tabla.setVisible(true);
    }
}
