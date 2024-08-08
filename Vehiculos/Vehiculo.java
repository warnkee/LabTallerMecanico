
package Vehiculos;

public class Vehiculo {
    private String matricula;
   private String modelo;
    private String marca;
    private int annioFabricacion;

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnnioFabricacion() {
        return annioFabricacion;
    }

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String modelo, String marca, int annioFabricacion) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.annioFabricacion = annioFabricacion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", annioFabricacion=" + annioFabricacion + '}';
    }
    
    
    
}
