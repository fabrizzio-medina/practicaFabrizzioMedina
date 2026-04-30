package practicaFabrizzioMedina.modelo.zona;

import practicaFabrizzioMedina.modelo.jugador.Jugador;

import java.util.Random;
import java.util.Scanner;

public class EstadioOlimpo extends  Zona{


    public EstadioOlimpo(Scanner sc) {
        super("Estadio del Olimpo", false, sc);
    }

    @Override
    public boolean entrar(Jugador jugador) {

        System.out.println("============================================");
        System.out.println("    ── " + getNombre() + " ──");
        System.out.println("============================================");
        System.out.println("\r\n");
        System.out.println(
                "Kratos, después de ser ayudado por el espartano y recibir el código de ingreso al ‘Estadio Olimpo’\r\n"
                        + "donde se encontraba su medio hermano Hércules, hijo de Zeus, avanzó con determinación.\r\n"
                        + "Hércules le tenía envidia, y al encontrarse, entablaron una conversación.\r\n"
                        + "—Oh, hermano mío —dijo Hércules—. Creía que solo eran rumores que estabas eliminando a los dioses con tu poder mental\r\n"
                        + "pero déjame decirte que conmigo no podrás.\r\n" + "Kratos respondió:\r\n"
                        + "—Hércules, sigues siendo el mismo: un empleado de Zeus. Mientras que YO estoy llevando el final del Monte Olimpo.\r\n"
                        + "Hércules rió y exclamó:\r\n"
                        + "—¡Ja, ja! Sigue creyendo que conmigo podrás , te reto a un piedra , papel o tijera.\r\n"
                        + "si me ganas te dejo pasar al Jardín de mi madre ,y  si no, serás echado de mis tierras.\r\n"
                        + "—Ya lo verás —replicó Kratos.\n"
                        + "Hercules: tienes solo un intento y tienes que ganarme si o si , si empatamos te echare igual de mis tierras");
        System.out.println("\r\n");

        String[] opciones = { "piedra", "papel", "tijera" };

        System.out.println("Elige piedra, papel o tijera:");
        String usuario = sc.nextLine().toLowerCase();

        String hercules = opciones[new Random().nextInt(3)];
        System.out.println("Hércules eligió: " + hercules);

        if (usuario.equals(hercules)) {
            System.out.println("Hemos empatado espartano , por lo tanto no podras pasar");
            jugador.restarRabia();
            return false;
        }

        if ((usuario.equals("piedra") && hercules.equals("tijera")) ||
                (usuario.equals("tijera") && hercules.equals("papel")) ||
                (usuario.equals("papel") && hercules.equals("piedra"))) {

            marcarComoCompletada();
            return true;
        }

        jugador.restarRabia();
        return false;
    }
}
