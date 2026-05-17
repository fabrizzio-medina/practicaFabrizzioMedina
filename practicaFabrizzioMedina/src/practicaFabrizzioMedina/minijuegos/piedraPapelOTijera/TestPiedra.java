package practicaFabrizzioMedina.minijuegos.piedraPapelOTijera;

import practicaFabrizzioMedina.modelo.jugador.Jugador;
import practicaFabrizzioMedina.modelo.zona.EstadioOlimpo;
import practicaFabrizzioMedina.modelo.zona.Zona;

import java.util.Scanner;

public class TestPiedra {
    static void main(String[] args) {

        Zona estioOlimpo = new EstadioOlimpo(new Scanner(System.in));
        estioOlimpo.entrar(new Jugador());
    }
}
