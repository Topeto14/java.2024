package SegundaEvaluacionProgramacion.Ejercicio_practicar_POO.Ejercio_1_Temperatura;

import java.util.Scanner;

public class TestTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Dime los grados Celsius para que te los pase a Farenheit ");
        double celsius = Integer.parseInt(sc.nextLine());
        System.out.println(celsius + " grados celsius son :" + new Temperatura().celsiusToFarenheit(celsius) + " Farenheit ");
        System.out.println(" Dime los grados Farenheit para que te los pase a Celsius ");
        double farenheit = Integer.parseInt(sc.nextLine());
        System.out.println(farenheit + " grados farenheit son :" + new Temperatura().farenheitToCelsius(farenheit) + " Celsius ");

    sc.close();

    }

}
