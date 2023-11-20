public class entregarArray7 {
    /*7. Crear un programa que lea por teclado una tabla de 5 números enteros y la desplace una posición hacia la
    derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. Igual que el
    anterior, pero desplazando N posiciones (N es un número introducido por el usuario). */
     /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }
     /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     *      */
    public static void pintarMatriz(int matriz[]) {
        for(int i=0; i<matriz.length; i++) {
                System.out.print(matriz[i] + " ");
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
        
        int tabla[] = new int [5];

        for (int i=0; i<tabla.length; i++){
            tabla[i]= generarNumero(1, 9);
        }
        pintarMatriz(tabla);
        
       
        int ultimo = tabla[tabla.length-1];
        for(int i=tabla.length-1; i>0; i--){
            tabla[i]=tabla[i-1] ;   
        }
        tabla[0]= ultimo;
        System.out.println();
     
        
        
    }
    
}
