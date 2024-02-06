package me.davidlake.savetheropa;

public class Moto extends Vehiculo {
    public static final Double PESO = 300.0;
    public static final Integer CANTIDAD_RUEDAS = 2;


    public Moto(
            double velocidad,
            double aceleracion,
            double anguloDeGiro,
            String patente
    ) {
        super(velocidad, aceleracion, anguloDeGiro, PESO, CANTIDAD_RUEDAS, patente);
    }

    @Override
    public String toString() {
        return "Moto{} " + super.toString();
    }
}
