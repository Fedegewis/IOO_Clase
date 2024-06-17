package Simulacro.UI;

import Simulacro.Controller.EmpresaElectricaController;
import Simulacro.DTO.UsuarioIndustrialDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TablaUsuariosIndustrial extends JFrame {

    private JPanel topPanel;
    private JTable table;
    private JScrollPane scrollPane;
    private String[] columns= new String[3];
    private String [] [] data=new String[3][3];
    EmpresaElectricaController empresa=null;


    public TablaUsuariosIndustrial(){
        setTitle("Usuarios Industriales");
        setSize(400,400);
        topPanel=new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);
        columns=new String[]{"Razon Social","Cuit","Condicion Fiscal"};
        empresa=EmpresaElectricaController.getInstance();
        data=convertDtoToData(empresa.buscarUsuariosIndustrial());
        DefaultTableModel model = new DefaultTableModel(data,columns);
        table=new JTable();
        table.setModel(model);
        scrollPane=new JScrollPane(table);
        topPanel.add(scrollPane,BorderLayout.CENTER);
    }


    public String[][] convertDtoToData (Collection<UsuarioIndustrialDTO> dtos){
        List<UsuarioIndustrialDTO>dtoList=new ArrayList<>(dtos);
        String[] [] data=new String[dtos.size()][3];
        for (int i=0;i<dtoList.size();i++){
            data[i][0]=dtoList.get(i).getRazonSocial();
            data[i][1]=dtoList.get(i).getCuit();
            data[i][2]=dtoList.get(i).getCondicionFiscal();
        }
        return data;
    }

    public static void main(String args [])throws Exception{
        TablaUsuariosIndustrial tabla=new TablaUsuariosIndustrial();
        tabla.setVisible(true);
    }
}
