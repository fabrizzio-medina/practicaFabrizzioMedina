package practicaFabrizzioMedina.minijuegos.acertijos;

import practicaFabrizzioMedina.modelo.jugador.Jugador;
import practicaFabrizzioMedina.modelo.zona.TemploPoseidon;
import practicaFabrizzioMedina.modelo.zona.Zona;

import java.util.Scanner;

public class TestAcertijo {

    static void main(String[] args) {
        Zona poseidon = new TemploPoseidon(new Scanner(System.in));
        poseidon.entrar(new Jugador());
    }
}
