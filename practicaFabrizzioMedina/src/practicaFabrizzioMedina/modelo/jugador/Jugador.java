package practicaFabrizzioMedina.modelo.jugador;

public class Jugador {

    // representa a la rabia maxima del jugador
    private int rabia = 14;

    // Devuelve la cantidad de rabia que le queda
    public int getRabia() {
        return rabia;
    }

    // resta rabia si pierde
    public void restarRabia() {
        rabia--;
    }

    // Comprueba si sigue vivo
    public boolean estaVivo() {
        return rabia > 0;
    }

}
