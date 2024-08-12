/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import java.util.LinkedList;
import java.util.Queue;


public class GestionarReparaciones {
    private Queue<Reparacion> colaReparaciones ;
    private ListaReparaciones list = new ListaReparaciones();
    public GestionarReparaciones() {
       colaReparaciones = new LinkedList<>();
    }

    public Queue<Reparacion> getColaReparaciones() {
        
        return colaReparaciones;
    }
    
    public void AddReparacion(Reparacion rep){
        
        colaReparaciones.add(rep);
    }
    
  public void cambiarEstado(String estado){
      Reparacion rep = colaReparaciones.poll();
      rep.setEstado(estado);
      this.list.AddReparaciones(rep);
  }  
        public String listarReparacionesPendientes() {
    StringBuilder sb = new StringBuilder(); 
    for (Reparacion Rep : colaReparaciones) {
        sb.append(Rep.toString()).append("\n");  
    }
    return sb.toString();  
   
           }
        
      
        }

