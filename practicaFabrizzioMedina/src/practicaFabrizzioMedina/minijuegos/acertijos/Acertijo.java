package practicaFabrizzioMedina.minijuegos.acertijos;

import practicaFabrizzioMedina.minijuegos.Minijuego;

import java.util.*;

public class Acertijo implements Minijuego {

    private Map<String , String> acertijos = new HashMap<>();

    public Acertijo() {
        inicializarAcertijos();
    }

    private void inicializarAcertijos(){
        acertijos.put("Soy el Dios del trueno y del rayo, y mando en el Monte Olimpo.\n¿Quien soy?", "Zeus");
        acertijos.put("No habla, pero siempre responde.\nNo tiene boca, \npero siempre grita.\n¿Qué es?", "El eco");
        acertijos.put("Cuanto más lo quitas, más grande se vuelve.\nNace del frío y muere con el calor.\n¿Qué es?", "El agujero");
    }

    private String getAcertijoAleatorio() {
        List<String> preguntas = new ArrayList<>(acertijos.keySet());

        Random random = new Random();
        String preguntaAleatoria = preguntas.get(random.nextInt(preguntas.size()));
        return preguntaAleatoria;
    }

    private boolean esRespuestaCorrecta(String pregunta, String respuesta){
        return acertijos.get(pregunta).equalsIgnoreCase(respuesta);
    }


    @Override
    public boolean jugar() {
        Scanner entrada = new Scanner(System.in);

        String pregunta = getAcertijoAleatorio();
        System.out.println(pregunta);
        System.out.print(">: ");
        String respuesta = entrada.nextLine();

        if (esRespuestaCorrecta(pregunta, respuesta)) {
            System.out.println("Correcto!");
            return true;
        }

        System.out.println("Incorrecto.");
        return false;
    }
    }

