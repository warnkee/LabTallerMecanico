/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mecanicos;

/**
 *
 * @author ASUS
 */
public class Mecanico {

    private String id;
    private String nombre;
    private String especialidad;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Mecanico(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public Mecanico() {
    }

    public Mecanico(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mecanico: " + " id: " + id + ", nombre: " + nombre + ", especialidad: " + especialidad ;
    }
    
 
    
}
