package practicaFabrizzioMedina.dao;

import practicaFabrizzioMedina.modelo.jugador.Jugador;

import java.util.List;

public interface JugadorDAO {
    Jugador guardar(Jugador jugador);

    Jugador buscar(Integer id);

    boolean actualizar(Jugador jugador);
    List<Jugador> getLista();
}
