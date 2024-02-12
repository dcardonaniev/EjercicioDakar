package me.davidlake.dakar;

public class Auto extends Vehiculo {
    public static final Double PESO = 1000.0;
    public static final Integer CANTIDAD_RUEDAS = 4;

    public Auto(
            double velocidad,
            double aceleracion,
            double anguloDeGiro,
            String patente
    ) {
        super(velocidad, aceleracion, anguloDeGiro, PESO, CANTIDAD_RUEDAS, patente);
    }

    @Override
    public String toString() {
        return "Auto{} " + super.toString();
    }
}
