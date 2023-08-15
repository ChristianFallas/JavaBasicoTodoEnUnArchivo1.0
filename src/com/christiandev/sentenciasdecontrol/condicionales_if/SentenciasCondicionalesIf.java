package com.christiandev.sentenciasdecontrol.condicionales_if;

public class SentenciasCondicionalesIf {
    public static void main(String[] args) {

        //if y else.
        int edad = 15;
        boolean comprovacionEdad = edad >= 18;

        if (comprovacionEdad) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        // if, else if.
        String dia = "Lunes";

        if (dia.equals("Lunes")) {  // Cando comparamos objetos o texto es recomendable usar equals en ves de ==.
            System.out.println("Hoy es Lunes.");
        } else if (dia.equals("Martes")) {
            System.out.println("Hoy es Martes.");
        } else if (dia.equals("Miercoles")) {
            System.out.println("Hoy es Miercoles.");
        } else if (dia.equals("Hoy es Jueves.")) {
            System.out.println("Hoy es Jueves.");
        } else if (dia.equals("Viernes")) {
            System.out.println("Hoy es Viernes y el cuerpo lo sabe.");
        } else if (dia.equals("Sabado")) {
            System.out.println("Hoy es sabadito alegre");
        } else if (dia.equals("Domingo")) {
            System.out.println("hoy es domingo.");
        } else {
            System.out.println("El dia no es valido.");
        }
    }
}
