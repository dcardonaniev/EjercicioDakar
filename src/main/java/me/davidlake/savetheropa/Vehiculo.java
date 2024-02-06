package me.davidlake.savetheropa;

public class Vehiculo {
    private double velocidad;
    private double aceleracion;
    private double anguloDeGiro;
    private double peso;
    private int ruedas;
    private String patente;

    public Vehiculo(
            double velocidad,
            double aceleracion,
            double anguloDeGiro,
            double peso,
            int ruedas,
            String patente
    ) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.peso = peso;
        this.ruedas = ruedas;
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }
}
