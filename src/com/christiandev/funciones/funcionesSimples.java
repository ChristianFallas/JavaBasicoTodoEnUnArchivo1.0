package com.christiandev.funciones;

public class funcionesSimples {
    public static void main(String[] args) {

        // Invocación de una función.
        suma(15, 15);
        imprimeSaludo();
    }

    // Función que recibe parámetros.
    public static int suma (int a, int b){
        return a + b;
    }

    // Función que no recibe parámetros.
    public static void imprimeSaludo(){
        System.out.println("Hola mundo");
    }
}
