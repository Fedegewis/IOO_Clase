package Clase21deMayo.src.model;

import java.util.Objects;

public class Direccion {

    private String calle;

    private int numero;

    public Direccion(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }


    public int getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return numero == direccion.numero && Objects.equals(calle, direccion.calle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calle, numero);
    }
}
