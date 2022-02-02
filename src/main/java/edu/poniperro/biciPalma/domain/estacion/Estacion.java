package edu.poniperro.biciPalma.domain.estacion;

import edu.poniperro.biciPalma.domain.tarjetausuario.Autenticacion;

public class Estacion{
    private final int id;
    private final String direccion;

    public Estacion(int id, String direccion){
        this.id = id;
        this.direccion = direccion;
    }
    private int getId(){
        return id;
    }
    private String getDireccion(){
        return direccion;
    }
    @Override
    public String toString(){
        return direccion; // PREGUNTAR
    }
    //ME PIERDO

}

