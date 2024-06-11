package TPO3.ui;

import TPO3.controller.ClienteController;
import TPO3.dto.ClienteDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class VerClienteUI extends JFrame {
        private JPanel topPanel;
        private  JTable table;
        private JScrollPane scrollPane;
        private  String [] columns = new String[2];
        private String [][] data= new String[3][3];
        JButton button = new JButton();
        ClienteController clienteController = null;

        public VerClienteUI(){
            setTitle("Ver clientes");
            setSize(300,300);
            topPanel=new JPanel();
            topPanel.setLayout(new BorderLayout());
            getContentPane().add(topPanel);
            columns=new String[] {"Nombre","DNI"};
            clienteController=ClienteController.getInstance();
            data=convertDtoToData(clienteController.buscarTodosLosClientes());
            DefaultTableModel model= new DefaultTableModel(data,columns);
            table = new JTable();
            table.setModel(model);
            scrollPane=new JScrollPane(table);
            topPanel.add(scrollPane,BorderLayout.CENTER);
        }





        public String [] [] convertDtoToData(Collection<ClienteDTO> dtos){
            List<ClienteDTO> dtosList = new ArrayList<>(dtos);
            String [] [] data = new String[dtos.size()][2];
            for(int i=0;i<dtosList.size();i++){
                data[i][0]=dtosList.get(i).getNombreCliente();
                data[i][1]=dtosList.get(i).getDniCliente();
            }
            return data;
        }


        public static void main(String args []) throws Exception{
            VerClienteUI tabla=new VerClienteUI();
            tabla.setVisible(true);
        }
}
