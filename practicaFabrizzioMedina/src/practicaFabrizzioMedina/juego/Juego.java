package practicaFabrizzioMedina.juego;

import practicaFabrizzioMedina.modelo.jugador.Jugador;
import practicaFabrizzioMedina.mapa.Mapa;

import java.util.Scanner;

public class Juego {
    private Jugador jugador = new Jugador();// Objeto jugador que representa al jugador durante toda la partida
    private Mapa mapa;// Objeto mapa que contiene todas las zonas del juego

    /*
     * Constructor de la clase Juego
     * Recibe el Scanner para poder usarlo en las zonas
     */
    public Juego(Scanner sc) {
        mapa = new Mapa(sc);
    }

    public void iniciar() {

        System.out.println("────────────────────────────────────────────");
        System.out.println("  GOD OF WAR III LA DESTRUCCIÓN DEL OLIMPO  ");
        System.out.println("────────────────────────────────────────────");

        /*
         * Bucle principal , se continua mientras el jugador tenga vida y el juego no
         * este completado
         */
        while (jugador.estaVivo() && !mapa.juegoCompletado()) {

            /*
             * Muestra la rabia restante , muestra las zonas del mapa y permite al jugador
             * seleccionar la zona
             */
            System.out.println("\nRabia restante: " + jugador.getRabia());
            mapa.mostrarZonas();
            mapa.seleccionarZona(jugador);
        }

        /* Si el jugador se queda sin rabia pierde y si completa todas las zonas gana */
        if (!jugador.estaVivo())
            System.out.println("Has perdido toda tu rabia...");
        else
            System.out.println("¡Has derrotado a Zeus!");
    }
}
