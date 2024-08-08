/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mecanicos;

import Vehiculos.Vehiculo;
import java.util.HashSet;

/**
 *
 * @author ASUS
 */
public class ListaMecanicos {
     private  HashSet<Mecanico> mec;

    public ListaMecanicos() {
        mec = new HashSet<>();
    }

    public String listarMecanicos() {
       StringBuilder sb = new StringBuilder();
    
        for (Mecanico mecanico : mec) {
        sb.append(mecanico).append("\n");
    }
    
    return sb.toString();
}

    
    public void AgregarMecanico(Mecanico mecanico){
        mec.add(mecanico);
    }
    
    public Mecanico BuscarMecanico(String id){
                for (Mecanico mecanico : mec) {
            if (mecanico.getId().equals(id)) {
                return mecanico;
            }
        }
        return null;

    }
            
    public void EliminarMecanico(String id){
        mec.removeIf(Mecanico -> Mecanico.getId().equals(id));
    }
}
    

