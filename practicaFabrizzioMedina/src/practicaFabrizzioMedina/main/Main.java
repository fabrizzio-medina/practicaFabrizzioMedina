package practicaFabrizzioMedina.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Se crea un objeto Scanner para leer
        // la entrada del usuario desde la consola
        Scanner sc = new Scanner(System.in);

        // Se crea el objeto Juego y se le pasa el Scanner
        // para que todas las clases del juego puedan leer datos del usuario

        Juego juego = new Juego(sc);
        juego.iniciar();

        sc.close();
    }
}
