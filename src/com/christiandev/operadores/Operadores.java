package com.christiandev.operadores;

public class Operadores {
    public static void main(String[] args) {

        // Operadores aritméticos.

        int numero1 = 20;
        int numero2 = 30;
        int resultadoSuma = numero1 + numero2;
        int resultadoResta = numero1 - numero2;
        int resultadoMultiplicacion = numero1 * numero2;
        int resultadoDivision = numero1 / numero2;
        int resultadoResto = numero1 % numero2;
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
        System.out.println("El resultado de la division es: " + resultadoDivision);
        System.out.println("El resultado del resto o modulo es: " + resultadoResto);


        // Operadores de asignación.

        String saludo = "Hola ";
        String saludoManana = "buenos días";
        String saludoTarde = "buenas tardes";
        String saludoCompleto = saludo + saludoManana;
        System.out.println("Un saludo completo para la manana seria: " + saludoCompleto);
        System.out.println("Un saludo completo para la tarde seria: " + saludo + saludoTarde);

        numero1 += 10;
        numero2 -= 10;
        System.out.println(numero1);
        System.out.println(numero2);


        //Operadores de comparación;

        boolean comparador1 = numero1 > numero2; // true
        boolean comparador2 = numero1 < numero2; // false
        System.out.println(comparador1);
        System.out.println(comparador2);

        
        //Operadores lógicos.

        boolean logica1 = numero1 >= numero2 && numero1 <= numero2; // false
        System.out.println("Logica1: " + logica1);


        //Operadores de incremento-decremento.
        numero1++;
        numero2--;
        System.out.println(numero1);
        System.out.println(numero2);
    }
}
