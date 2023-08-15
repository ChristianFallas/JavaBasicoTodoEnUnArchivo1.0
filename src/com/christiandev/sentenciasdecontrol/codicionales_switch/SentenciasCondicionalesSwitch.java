package com.christiandev.sentenciasdecontrol.codicionales_switch;

public class SentenciasCondicionalesSwitch {
    public static void main(String[] args) {
        
        String diaDeLaSemana = "Sabado";

        switch (diaDeLaSemana) {
            case "Lunes":
            System.out.println("Hoy es Lunes.");
            break;
            case "Martes":
            System.out.println("Hoy es Martes.");
            break;
            case "Miercoles":
            System.out.println("Hoy es Miércoles.");
            break;
            case "Jueves":
            System.out.println("Hoy es Jueves.");
            break;
            case "Viernes":
            System.out.println("Hoy es Viernes.");
            break;
            case "Sábado":
            System.out.println("Hoy es Sábado.");
            break;
            case "Domingo":
            System.out.println("Hoy es Domingo.");
            break;
            default:
            System.out.println("El dia no es valido.");
            break;
        }
    }
}
