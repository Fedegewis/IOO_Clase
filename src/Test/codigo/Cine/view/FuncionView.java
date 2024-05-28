package view;

import java.util.*;

public class FuncionView {
    private Date fecha;
    private int funcionID;
    private String horario;



    public FuncionView(Date fecha,int funcionID,String horario){
        this.fecha=fecha;
        this.funcionID=funcionID;
        this.horario=horario;

    }
    public Date getFecha(){
        return fecha;
    }
    public int getFuncionID(){
        return funcionID;
    }
    public String getHorario(){
        return horario;
    }
    public void setFecha(Date fecha){
        this.fecha=fecha;
    }
    public void setFuncionID(int funcionID){
        this.funcionID=funcionID;
    }
    public void setHorario(String horario){
        this.horario=horario;
    }
    public String toString(){
        return ("Fecha: "+fecha+" , Funcion N°: "+funcionID+", Horario: "+horario);
    }










}

