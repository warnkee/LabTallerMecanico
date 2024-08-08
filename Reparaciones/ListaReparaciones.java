/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import java.util.Stack;

public class ListaReparaciones {
      Stack<Reparacion> Reparaciones;

    public ListaReparaciones() {
        Reparaciones = new Stack<>();
    }

    public Stack<Reparacion> getReparaciones() {
        return Reparaciones;
    }
      
    public void AddReparaciones(Reparacion reparacion){
        Reparaciones.add(reparacion);
    }
    
    public Reparacion BuscarReparacion(String id){
        for(Reparacion rep:this.Reparaciones){
            if(rep.getId().equals(id)){
                return rep;
            }
        }
        return null;
    }
           public String listarReparacionesCompletadas() {
    StringBuilder sb = new StringBuilder(); 
    for (Reparacion Rep : Reparaciones) {
        sb.append(Rep.toString()).append("\n");  
    }
    return sb.toString();  
           }
}
