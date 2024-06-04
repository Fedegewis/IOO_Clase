package TPO3.model;


public class Consumo {

    private int codigo;
    private int mes;
    private int año;
    private String nombreEstablecimiento;
    private float monto;


    public Consumo(int codigo, int mes, int año, String nombreEstablecimiento, float monto) {
        this.codigo = codigo;
        this.mes = mes;
        this.año = año;
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.monto = monto;
    }

    public int getAño() {return año;}

    public void setAño(int año) {this.año = año;}

    public int getCodigo() {return codigo;}

    public void setCodigo(int codigo) {this.codigo = codigo;}

    public int getMes() {return mes;}

    public void setMes(int mes) {this.mes = mes;}

    public String getNombreEstablecimiento() {return nombreEstablecimiento;}

    public void setNombreEstablecimiento(String nombreEstablecimiento) {this.nombreEstablecimiento = nombreEstablecimiento;}

    public float getMonto() {return monto;}

    public void setMonto(float monto) {this.monto = monto;}
}