package TPO3.ui;


import TPO3.controller.TarjetaController;
import TPO3.dto.ClienteDTO;
import TPO3.dto.TarjetaDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class VerTarjetasUI extends JFrame {
    private JPanel topPanel;
    private  JTable table;
    private JScrollPane scrollPane;
    private  String [] columns = new String[2];
    private String [][] data= new String[3][3];
    JButton button = new JButton();
    TarjetaController tarjetaController = null;

    public VerTarjetasUI(){
        setTitle("Ver Tarjetas");
        setSize(300,300);
        topPanel=new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);
        columns=new String[] {"DNI","NroTarjeta","Tipo Tarjeta","Cargo"};
        tarjetaController=TarjetaController.getInstance();
        data=convertDtoToData(tarjetaController.buscarTodasLasTarjetas());
        DefaultTableModel model= new DefaultTableModel(data,columns);
        table = new JTable();
        table.setModel(model);
        scrollPane=new JScrollPane(table);
        topPanel.add(scrollPane,BorderLayout.CENTER);
    }




    public String [] [] convertDtoToData(Collection<TarjetaDTO> dtos){
        List<TarjetaDTO> dtosList = new ArrayList<>(dtos);
        String [] [] data = new String[dtos.size()][4];
        for(int i=0;i<dtosList.size();i++){
            data[i][0]=dtosList.get(i).getClienteDTO().getDniCliente();
            data[i][1]=dtosList.get(i).getNroTarjeta();
            data[i][2]=dtosList.get(i).getTipoTarjeta();
            data[i][3]=dtosList.get(i).getCargo();
        }
        return data;
    }


    public static void main(String[] args) throws Exception{
        VerTarjetasUI tabla=new VerTarjetasUI();
        tabla.setVisible(true);
    }
}


