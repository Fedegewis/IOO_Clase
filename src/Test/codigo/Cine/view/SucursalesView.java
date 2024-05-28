package view;

public class SucursalesView {
    private String denominacion;
    private int sucursalID;
    private String direccion;

    

    public SucursalesView(int sucursalID,String denominacion,String direccion){
        this.sucursalID=sucursalID;
        this.denominacion=denominacion;
        this.direccion=direccion;
    }

    public int getSucursalID(){
        return sucursalID;
    }
    public String getDenominacion(){
        return denominacion;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setSucursalID(int sucursalID){
        this.sucursalID=sucursalID;
    }
    public void setDenominacion(String denominacion){
        this.denominacion=denominacion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String toString(){
        return("Sucursal N°: "+sucursalID+", Barrio: "+ denominacion+" , Direccion "+direccion);
    }
}
