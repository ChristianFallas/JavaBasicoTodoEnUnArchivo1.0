package com.christiandev.sentenciasdecontrol.bucle_for;

public class SentenciasDeBucleFor {
    public static void main(String[] args) {
        
        //Imprime 2000 veces Hola Mundo.

        for (int i=0; i<2000; i++){
            System.out.println("Hola Mundo " + i);
        }

        //Recorre un array con un bucle for.

        String[] nombres = {"Christian.","Luis.","Daniel.","Jason."};
        for (int i=0; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
}
