/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github1;

/**
 *
 * @author Carlos
 */
public class Persona {
    NIF nif;
    Nombre_completo nombre;
    Fecha fecha;

    public Persona(NIF nif, Nombre_completo nombre, Fecha fecha) {
        this.nif = nif;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Persona() {
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    public Nombre_completo getNombre() {
        return nombre;
    }

    public void setNombre(Nombre_completo nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona{" + "nif=" + nif + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
