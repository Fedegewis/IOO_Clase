package TPO3.model;

import java.util.Collection;

public class TarjetaCredito extends Tarjeta {



    public TarjetaCredito(Cliente cliente, Collection consumos, String numeroTarjeta, float interes) {
        super(cliente, consumos, numeroTarjeta);
        this.interes = interes;
    }

    private float interes;

    public float getInteres() {return interes;}

    public void setInteres(float interes) {this.interes = interes;}
}