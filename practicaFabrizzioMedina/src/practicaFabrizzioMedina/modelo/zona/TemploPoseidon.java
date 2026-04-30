package practicaFabrizzioMedina.modelo.zona;

import practicaFabrizzioMedina.modelo.jugador.Jugador;

import java.util.Scanner;

public class TemploPoseidon extends Zona{


    public TemploPoseidon(Scanner sc) {
        super("Templo de Poseidón", true, sc);
    }

    @Override
    public boolean entrar(Jugador jugador) {

        System.out.println("============================================");
        System.out.println("    ── Entrada a " + getNombre() + " ──");
        System.out.println("============================================");
        System.out.println("\r\n");

        System.out.println("Kratos ingresó al templo de Poseidón.\n"
                + "Luego de caminar, encontró un pasadizo que conducía al siguiente lugar\n"
                + "pero para pasar debía resolver una adivinanza puesta por el dios Poseidón.");
        System.out.println("\n");
        System.out.println("Soy el Dios del trueno y del rayo, y mando en el Monte Olimpo. ¿Quien soy?");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("zeus")) {
            System.out.println("Correcto!");
            marcarComoCompletada();
            return true;
        }

        jugador.restarRabia();
        System.out.println("Incorrecto.");
        return false;
    }

}
