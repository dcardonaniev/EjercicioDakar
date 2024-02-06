package me.davidlake.savetheropa;

import java.util.ArrayList;

public class Carrera {
    private static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;
    private double distancia;
    private int premioEnDolares;
    private int cantidadVehiculosPermitidos;
    private String nombre;

    public Carrera(double distancia, int premioEnDolares, int cantidadVehiculosPermitidos, String nombre) {
        this.socorristaAuto = new SocorristaAuto();
        this.socorristaMoto = new SocorristaMoto();
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
        this.nombre = nombre;
    }

    public void darDeAltaAuto(
            double velocidad,
            double aceleracion,
            double anguloDeGiro,
            String patente
    ) {
        if(listaVehiculos.size() >= cantidadVehiculosPermitidos) {
            return;
        }

        Auto auto = new Auto(
                velocidad,
                aceleracion,
                anguloDeGiro,
                patente
        );

        listaVehiculos.add(auto);
    }

    public void darDeAltaMoto(
            double velocidad,
            double aceleracion,
            double anguloDeGiro,
            String patente
    ) {
        if(listaVehiculos.size() >= cantidadVehiculosPermitidos) {
            return;
        }

        Moto moto = new Moto(
                velocidad,
                aceleracion,
                anguloDeGiro,
                patente
        );

        listaVehiculos.add(moto);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculo(String patente) {
        listaVehiculos
                .stream()
                .filter(x -> x.getPatente().equals(patente))
                .findFirst()
                .ifPresent(vehiculo -> listaVehiculos.remove(vehiculo));
    }

    public void socorrerAuto(String patente) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPatente().equals(patente) && vehiculo instanceof Auto) {
                socorristaAuto.socorrer((Auto) vehiculo);
                return;
            }
        }

        System.out.println("No hay un auto inscrito con la patente indicada");
    }

    public void socorrerMoto(String patente) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPatente().equals(patente) && vehiculo instanceof Moto) {
                socorristaMoto.socorrer((Moto) vehiculo);
                return;
            }
        }

        System.out.println("No hay una moto inscrita con la patente indicada");
    }
}