package com.christiandev.sentenciasdecontrol.bucle_while;

public class SentenciaDeBucleWhile {
    public static void main(String[] args) {
        int contador = 0;

        //bucle while.
        while(contador < 10){
            contador ++;

            //Para cortar el flujo de ciclo while podemos usar un break.
            if (contador == 5) { 
                break;
            }

            System.out.println("El valor de contador es: " + contador);
        }

        while (contador < 10) {
            contador ++;

            /*Para saltar una iteración podemos usar continue, que lo que hace es continuar a la
            siguiente iteración. */
            if (contador == 5) {
                continue;
            }
            System.out.println("El valor de contador es: " + contador);
        }
    }
}
