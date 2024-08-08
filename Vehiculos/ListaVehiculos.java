
package Vehiculos;

import java.util.ArrayList;


public class ListaVehiculos {
     private ArrayList<Vehiculo> listaVehiculos;

    public ListaVehiculos() {
        this.listaVehiculos = new ArrayList<>();
    }
     
     public void addVehiculo(Vehiculo vehiculo){
         listaVehiculos.add(vehiculo);
     }
     
     public void eliminarVehiculo(String matricula){
         listaVehiculos.removeIf(Vehiculo-> Vehiculo.getMatricula().equals(matricula));
     }
     
       public Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }
       
  
           public String listarVehiculos() {
    StringBuilder sb = new StringBuilder(); 
    for (Vehiculo vehiculo : listaVehiculos) {
        sb.append(vehiculo.toString()).append("\n");  
    }
    return sb.toString();  
           }
}
