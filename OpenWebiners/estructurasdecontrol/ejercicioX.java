package OpenWebiners.estructurasdecontrol;

import java.util.Scanner;

/**
9. Escribe un programa en Java que compruebe si un carácter es una vocal o no.
 
12. Escribe un programa en Java que pinte una pirámide con asteriscos. El número de pisos debe introducido a través del teclado.
 
13. Escribe un programa en Java que permita calcular el n-ésimo término de la sucesión de Fibonacci. En dicha sucesión se da que:
- f(0) = 0;
- f(1) = 1;
- f(n) = f(n-1) + f(n-2), con n>=2.
 
14. Implementa un programa en Java que determine si un número introducido por teclado es primo o no. Recuerda que:
- Un número es primo cuando sus únicos divisores son 1 y él mismo.
- Para un número primo `p`, hay que buscar divisores que sean menores o iguales que `p/2`.
 
15. Aunque no lo parezca, siguen existiendo locutorios para realizar llamadas telefónicas internacionales. El coste cuando se realiza una llamada es el siguiente:
- Como base, se cobran 0.50€ si el otro usuario coge el teléfono.
- Los primeros 3 minutos cuestan 0.75€ por minuto.
- Los siguientes 4 minutos, cuestan 0.65€ por minuto.
- A partir del 8º minuto, cuestan 0.50€ por minuto.
- Si la llamada se realiza por la noche (22:00 - 7:59), tiene un recargo de un 5% sobre el precio.
- Si la llamada se realiza en domingo, tiene un recargo del 3%
Implementar un programa en Java que pida por teclado todos los datos necesarios e implemente el algoritmo de cálculo del precio final de una llamada.*/


public class ejercicioX {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un carácter: ");
        String letra = sc.next();
        if (letra.length() != 1) {
            System.out.println("Por favor, introduce solo un carácter.");
        } else {
            char ch = letra.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " es una vocal.");
            } else {
                System.out.println(ch + " no es una vocal.");
            }
        }
        sc.close();
    }
   
}
    

