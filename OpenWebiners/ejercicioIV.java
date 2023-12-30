package OpenWebiners;

import java.util.Scanner;

public class ejercicioIV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area = 0 ;
        double perimetro = 0 ;
        double PI = 3.14 ;
        double radio = 0 ;
        System.out.println(" Te voy a calcular el area y el perimetro de un circulo ");
        System.out.println(" Dime el radio del circulo ");
        radio = Integer.parseInt(sc.nextLine());

        area = PI * (radio*radio) ; 
        perimetro = 2 * PI * radio ; 

        System.out.println(" El area del circulo es : " + area ) ;
        System.out.println(" El perimetro del circulo es : " + perimetro );

        sc.close();
    }
    
}
