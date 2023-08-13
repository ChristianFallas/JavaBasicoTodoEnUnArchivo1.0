package com.christiandev.sentenciasdecontrol;

public class SentenciasDeBucleForEach {
    public static void main(String[] args) {

        //Recorrer un array con un for each.
        String[] nombres = {"Christian","Christina","Cindy","Ruben"};
        /* 
        int[] numeros = new int[4];
        numeros[0] = 9;
        numeros[1] = 2;
        numeros[2] = 7;
        numeros[3] = 5;
        */
        int[] numeros = {9,2,7,5};

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    
}
