package practicaFabrizzioMedina.dao.impl;

import practicaFabrizzioMedina.dao.ScoreDAO;
import practicaFabrizzioMedina.dao.utilidad.Archivo;

import java.util.List;
import java.util.Map;

public class ScoreDAOArchivoImpl implements ScoreDAO {

    private static final String NOMBRE_ARCHIVO = "score.txt";

    public ScoreDAOArchivoImpl(){

    }

    @Override
    public void guardarArchivo(Map<Integer, List<String>> mapaScore) {
        Archivo.guardarScoreArchivoBufferStream(NOMBRE_ARCHIVO, mapaScore);
    }

    @Override
    public Map<Integer, List<String>> leerDataArchivo() {
        Map<Integer, List<String>> mapaResultado = Archivo.leerDataTxtBufferStream(NOMBRE_ARCHIVO);

        /*mapaResultado.forEach((k, v) -> {
            System.out.println(k);
            v.stream().forEach(System.out::println);
        });*/
        return mapaResultado;
    }
}
