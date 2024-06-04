package TPO3.model;

import java.util.Collection;

public class TarjetaCredito extends Tarjeta {



    public TarjetaCredito(int dni, Collection consumos, String numeroTarjeta, float interes) {
        super(dni, consumos, numeroTarjeta);
        this.interes = interes;
    }

    private float interes;

    public float getInteres() {return interes;}

    public void setInteres(float interes) {this.interes = interes;}
}