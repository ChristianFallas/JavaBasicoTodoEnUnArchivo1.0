package com.christiandev.funciones;

public class SobreCargaDeFunciones {
    public static void main(String[] args) {
        sumas(15.5, 15.5);
        sumas(1000000, 1000000);
        sumas(25, 25);
    }

    // Aquí tenemos una función sumas sobre cargada tres veces.
    public static void sumas(int a, int b){
        int resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    public static void sumas(long a, long b){
        long resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    public static void sumas(double a, double b){
        double resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
