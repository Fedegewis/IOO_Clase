package TPO3.model;


import java.util.Collection;

public class TarjetaDebito extends Tarjeta {


    public TarjetaDebito(Cliente cliente, Collection consumos, String numeroTarjeta, float devIVA) {
        super(cliente, consumos, numeroTarjeta);
        this.devIVA = devIVA;
    }

    private float devIVA;

    public float getDevIVA() {return devIVA;}

    public void setDevIVA(float devIVA) {this.devIVA = devIVA;}
}