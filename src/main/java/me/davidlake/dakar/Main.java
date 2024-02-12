package me.davidlake.dakar;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(
                100.0,
                100.0,
                45.0,
                "KDA-258"
        );

        Carrera carrera1 = new Carrera(
                250.0,
                10000,
                15,
                "Carrera de Dakar"
        );

        carrera1.darDeAltaAuto(150.0, 120.0, 45.0, "TES-T21");
        carrera1.darDeAltaAuto(130.0, 120.0, 90.0, "PAD-T22");

        carrera1.darDeAltaMoto(210.0, 140.0, 75.0, "PAW-W14");
        carrera1.darDeAltaMoto(150.0, 95.0, 90.0, "KUT-211");

        carrera1.socorrerAuto("TES-T21");
        carrera1.socorrerMoto("KUT-211");

        carrera1.eliminarVehiculo("KUT-211");
        carrera1.socorrerMoto("KUT-211");
    }
}