public class entregarArray15 {
    /*15. Crear dos matrices 3x3 de números enteros (generadas aleatoriamente), pintarlas, sumarlas y mostrar su suma. El 
    resultado será también una matriz (suma) donde cada elemento será la suma de los elementos de las otras 
    matrices en la misma posición. */
    public static int generarNumeros (int min, int max){
        return (int) ((Math.random()*(max - min +1)+min));
    }
    public static void pintarMatriz(int matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumaFila(int numero, int tabla[][]){
        int total = 0 ;
        for (int j = 0; j < tabla[0].length; j++) {
            total+= tabla[numero][j];          
        }
        return total;
    }

     public static int sumaColumna(int numero, int tabla[][]){
        int total = 0 ;
        for (int i = 0; i < tabla.length; i++) {
            total+= tabla[i][numero];          
        }
        return total;
    }
    public static int sumaTabla(int[][] tabla){
        int resultado = 0 ;
        for(int i = 0; i< tabla.length; i++){
            for (int j = 0; j < tabla.length; j++) {
                resultado += tabla[i][j];
            }
        
        }
        return resultado;

    }
    public static void main(String[] args) {
        int tabla1 [][] = new int[3][3];
        int tabla2 [][] = new int[3][3];
        int suma [][] = new int[6][6];

        for (int i = 0; i < tabla1.length; i++) {
            for (int j = 0; j < tabla1[i].length; j++) {
                tabla1[i][j]= generarNumeros(1, 9);
            }
        }

           for (int i = 0; i < tabla2.length; i++) {
            for (int j = 0; j < tabla2[i].length; j++) {
                tabla2[i][j]= generarNumeros(1, 9);
            }
        }
        pintarMatriz(tabla1);
        System.out.println();
        pintarMatriz(tabla2);
        System.out.println();
        System.out.println(" La suma de las filas :");
        System.out.println(" Suma de la tabla 1 es " + sumaFila(0, tabla1) + " Sumas de la tabla 2 es : " + sumaFila(0, tabla2));
        System.out.println(" Suma de la tabla 1 es " + sumaFila(1, tabla1) + " Sumas de la tabla 2 es : " + sumaFila(1, tabla2));
        System.out.println(" Suma de la tabla 1 es " + sumaFila(2, tabla1) + " Sumas de la tabla 2 es : " + sumaFila(2, tabla2));
        System.out.println(" La suma de las columnas :");
        System.out.println(" Suma de la tabla 1 es " + sumaColumna(0, tabla1) + " Sumas de la tabla 2 es : " + sumaColumna(0, tabla2));
        System.out.println(" Suma de la tabla 1 es " + sumaColumna(1, tabla1) + " Sumas de la tabla 2 es : " + sumaColumna(1, tabla2));
        System.out.println(" Suma de la tabla 1 es " + sumaColumna(2, tabla1) + " Sumas de la tabla 2 es : " + sumaColumna(2, tabla2));

        System.out.println(" La suma de la tabla 1 es :" + sumaTabla(tabla1));
        System.out.println(" La suma de la tabla 2 es : " + sumaTabla(tabla2) );

    }
}
