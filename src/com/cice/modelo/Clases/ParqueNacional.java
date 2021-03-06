package com.cice.modelo.Clases;

import com.cice.modelo.Enums.EnumVisitable;
import com.cice.modelo.Interfaces.IParque;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */

public abstract class ParqueNacional implements IParque {
    private float extension;
    private int numeroEspecies;
    private String nombre;
    private boolean visitado;
    private EnumVisitable visitable;

    public ParqueNacional(float extension, int numeroEspecies, String nombre, EnumVisitable enumVisitable) {
        this.extension = extension;
        this.numeroEspecies = numeroEspecies;
        this.nombre = nombre;
        this.visitado = false;
        this.visitable = enumVisitable;
    }

    public ParqueNacional() {
    }

    public float getExtension() {
        return extension;
    }

    public void setExtension(float extension) {
        this.extension = extension;
    }

    public int getNumeroEspecies() {
        return numeroEspecies;
    }

    public void setNumeroEspecies(int numeroEspecies) {
        this.numeroEspecies = numeroEspecies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }


    public EnumVisitable getVisitable() {
        return visitable;
    }

    public void setVisitable(EnumVisitable visitable) {
        this.visitable = visitable;
    }

    @Override
    public String mostrarInformacion() {
        return "ParqueNacional{" +
                "extension=" + extension +
                ", numeroEspecies=" + numeroEspecies +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    @Override
    public String mostrarNombre() {
        return "Parque Nacional --> Nombre: +" + this.getNombre();
    }

    @Override
    public void visitarParque() {
        this.visitado = true;
    }

    @Override
    public boolean comprobarNombre(String nombre) {
        if (this.getNombre().equals(nombre))
            return true;
        return false;
    }
}
