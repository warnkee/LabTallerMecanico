/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import Mecanicos.Mecanico;
import Vehiculos.Vehiculo;
import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class Reparacion {
      private String id;
    private Vehiculo vehiculo;
    private Mecanico mecanico;
    private LocalDate fecha;
    private String descripcion;
    private String estado;

    // Constructor
    public Reparacion(String id, Vehiculo vehiculo, Mecanico mecanico, String descripcion) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.mecanico = mecanico;
        this.fecha = LocalDate.now();
        this.descripcion = descripcion;
        this.estado = "Pendiente";
    }

    

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Reparacion{" +
                "id=" + id +
                ", vehiculo='" + vehiculo + '\'' +
                ", mecanico='" + mecanico + '\'' +
                ", fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
