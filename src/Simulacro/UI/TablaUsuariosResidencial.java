package Simulacro.UI;

import Simulacro.Controller.EmpresaElectricaController;
import Simulacro.DTO.UsuarioResidencialDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TablaUsuariosResidencial extends JFrame {
    private JPanel topPanel;
    private JTable table;
    private JScrollPane scrollPane;
    private String [] columns=new String[2];
    private String [] [] data=new String[2][2];
    EmpresaElectricaController empresa=null;




    public TablaUsuariosResidencial(){
        setTitle("Usuarios Residenciales");
        setSize(300,300);
        topPanel=new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);
        columns=new String[]{"Nombre","Dni"};
        empresa=EmpresaElectricaController.getInstance();
        data=convertDtoToData(empresa.buscarUsuariosResidencial());
        DefaultTableModel model=new DefaultTableModel(data,columns);
        table=new JTable();
        table.setModel(model);
        scrollPane=new JScrollPane(table);
        topPanel.add(scrollPane,BorderLayout.CENTER);
    }





    public String[][] convertDtoToData(Collection<UsuarioResidencialDTO> dtos){
        List<UsuarioResidencialDTO> dtoList=new ArrayList<>(dtos);
        String [][] data=new String[dtos.size()][2];
        for(int i=0;i<dtoList.size();i++){
            data[i][0]=dtoList.get(i).getNombre();
            data[i][1]=dtoList.get(i).getDni();
        }
        return data;
    }


    public static void main(String args[])throws Exception{
        TablaUsuariosResidencial usuariosResidencial=new TablaUsuariosResidencial();
        usuariosResidencial.setVisible(true);

    }
}
