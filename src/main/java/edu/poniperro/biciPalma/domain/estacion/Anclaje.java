package edu.poniperro.biciPalma.domain.estacion;

import edu.poniperro.biciPalma.domain.bicicleta.Movil;

public class Anclaje {
    private boolean ocupado = false;
    private Movil bici;

    public Anclaje(boolean ocupado, Movil bici){
        this.ocupado = ocupado;
        this.bici = bici;
    }
}