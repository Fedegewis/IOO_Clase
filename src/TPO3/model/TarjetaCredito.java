package TPO3.model;

import java.util.Collection;

public class TarjetaCredito extends Tarjeta {

    private float interes;

    public TarjetaCredito(Cliente cliente, Collection consumos, String numeroTarjeta, String tipoTarjeta, float cargo) {
        super(cliente, consumos, numeroTarjeta, tipoTarjeta, cargo);
        this.interes = interes;
    }



    public float getInteres() {return interes;}

    public void setInteres(float interes) {this.interes = interes;}
}