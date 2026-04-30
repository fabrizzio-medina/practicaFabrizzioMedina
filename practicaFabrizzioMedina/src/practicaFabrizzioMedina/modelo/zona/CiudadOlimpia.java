package practicaFabrizzioMedina.modelo.zona;

import practicaFabrizzioMedina.modelo.jugador.Jugador;

import java.util.Scanner;

public class CiudadOlimpia extends Zona{

    public CiudadOlimpia(Scanner sc) {
        super("Ciudad de Olimpia", false, sc);
    }

    @Override
    public boolean entrar(Jugador jugador) {

        System.out.println("============================================");
        System.out.println("    ── Entrada a " + getNombre() + " ──");
        System.out.println("============================================");
        System.out.println("\r\n");

        System.out.println("Gracias a tu ayuda, Kratos logró avanzar al siguiente lugar, que es “Lugar de Olimpia”.\r\n"
                + "Avanzando por el lugar, Kratos encontró una puerta con una palabra codificada "
                + "puesta por el dios Helios; la dejó allí para hacer doler los ojos.\r\n"
                + "Tu misión es ayudar a Kratos a poner la palabra correcta.");
        System.out.println("Descifra: L4 luz br1ll4nt3 d3l 4m4n3c3r");
        String correcta = "la luz brillante del amanecer";
        String intento = sc.nextLine().toLowerCase();

        if (intento.equalsIgnoreCase(correcta)) {
            marcarComoCompletada();
            return true;
        } else {
            jugador.restarRabia();
            return false;
        }
    }
}
