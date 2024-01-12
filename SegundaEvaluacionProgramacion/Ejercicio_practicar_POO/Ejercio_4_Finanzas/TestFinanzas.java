package SegundaEvaluacionProgramacion.Ejercicio_practicar_POO.Ejercio_4_Finanzas;

import java.util.Scanner;

public class TestFinanzas {
    public static void main(String[] args) {
        Finanzas f1 = new Finanzas();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Dime cuantos Dolares quieres que te convierta en Euros ");
        double dolar = Integer.parseInt(sc.nextLine());
        System.out.println(f1.dolaresToEuros(dolar));
        System.out.println(" Dime cuantos Euros quieres que te convierta en Dolares ");
        double euros = Integer.parseInt(sc.nextLine());
        System.out.println(f1.eurosToDolares(euros));

        sc.close();
    }
}
