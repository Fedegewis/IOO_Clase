package Simulacro.UI;

import Simulacro.Controller.EmpresaElectricaController;
import Simulacro.DTO.UsuarioDTO;
import Simulacro.Model.Usuario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        empresa=EmpresaElectricaController.getInstance();
        setTitle("Usuarios totales");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        topPanel=new JPanel();
        topPanel.setLayout(new FlowLayout());
        getContentPane().add(topPanel);
        JTextField txtBusqueda=new JTextField(20);
        topPanel.add(txtBusqueda);
        JButton btnBuscar=new JButton("Buscar");
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model= (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                String usuario=txtBusqueda.getText();
                List<UsuarioDTO> dto=new ArrayList<UsuarioDTO>();
                dto.add(empresa.buscarUsuariodTO(Integer.parseInt(usuario)));
                data=convertDtoToData(dto);
                model.setDataVector(data,columns);
                table.setModel(model);
            }
        });
        topPanel.add(btnBuscar,BorderLayout.NORTH);
        columns=new String[]{"NroUsuario","Localidad","Provincia"};
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
