package SegundaEvaluacionProgramacion.Ejercicio_practicar_POO.Ejercio_2_Coche;

public class Coche {
    // --Atributo--
    private int velocidad ;
    private int mas ;
    private int menos ;


    //-- METODOS --

    public int getVelocidad() {
        return velocidad;
    }
    public int acelera(int mas ){
        return velocidad += mas;
    }
    public void frena( int menos ){
        this.velocidad -= menos;
    }
}
