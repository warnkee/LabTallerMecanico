/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mecanicos;

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

    public HashSet<Mecanico> ListarMecanicos() {
        return mec;
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
    

