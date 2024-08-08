/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import Vehiculos.Vehiculo;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



/**
 *
 * @author ASUS
 */
public class VehiculosdeClientes {
    private HashMap<Cliente, Vehiculo> vehiculosdeclientes;
    
    public VehiculosdeClientes(){
        this.vehiculosdeclientes= new HashMap<>();
    
}
    
    public void AgregarVehiculosaClientes(Cliente cliente,Vehiculo vehiculo){
        vehiculosdeclientes.put(cliente, vehiculo);
        
    }
    
    public void EliminarVehiculosdeClientes(Cliente cliente){
            vehiculosdeclientes.remove(cliente);
    }
    
    public String BuscarVehiculosdeClientes(Cliente cliente){
         return vehiculosdeclientes.get(cliente).toString();
    }
     public String listarVehiculosdeClientes() {
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<Cliente, Vehiculo>> entradas = vehiculosdeclientes.entrySet();
        
        for (Map.Entry<Cliente, Vehiculo> entrada : entradas) {
            sb.append(entrada.getKey()).append(" - ").append(entrada.getValue()).append("\n");
        }
        
        return sb.toString();
    }
}

