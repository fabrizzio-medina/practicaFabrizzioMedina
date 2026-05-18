package practicaFabrizzioMedina.score;

import practicaFabrizzioMedina.modelo.jugador.Jugador;

import java.util.HashMap;
import java.util.Map;

public class Score {

    private Map<Jugador, Integer> top = new HashMap<>();

    public void add(Jugador jugador, Integer valor)
    {
        top.put(jugador, valor);
    }
}
