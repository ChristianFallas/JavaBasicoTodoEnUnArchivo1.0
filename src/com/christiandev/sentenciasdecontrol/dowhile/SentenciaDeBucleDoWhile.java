package com.christiandev.sentenciasdecontrol.dowhile;

public class SentenciaDeBucleDoWhile {
    public static void main(String[] args) {
        int contador = 10;

        //El bucle do while se ejecutara al menos una vez ya que do no evalúa solo ejecuta código y while sera la que evaluará si continuamos o no.
        do {
            contador ++;
            System.out.println("El valor de contador es: " + contador);
        } while (contador < 10);
    }
}
