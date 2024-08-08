/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class Reparacion {
      private int id;
    private String vehiculo;
    private String mecanico;
    private LocalDate fecha;
    private String descripcion;
    private String estado;

    // Constructor
    public Reparacion(int id, String vehiculo, String mecanico, LocalDate fecha, String descripcion, String estado) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.mecanico = mecanico;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMecanico() {
        return mecanico;
    }

    public void setMecanico(String mecanico) {
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
