/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ListaCliente {
    
    private ArrayList<Cliente> clientes;

    public ListaCliente() {
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public boolean AddClientes(Cliente c){
        for(Cliente cl:clientes){
        if(cl.getId().equals(c.getId())){
             System.out.println("no se agrego");
            return false;
             
        }
        }
        clientes.add(c);
        System.out.println("Agregado");
        return true;
        
    }
    
    
    public Cliente buscarCliente(String id){
        for(Cliente c:clientes){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
    
    public boolean EliminarCliente(String id){
        for(Cliente c:clientes){
            if(c.getId().equals(id)){
                clientes.remove(c);
                return true;
            }
        } 
        return false;
    }
    
        public String listarClientes() {
    StringBuilder sb = new StringBuilder(); 
    for (Cliente Rep : clientes) {
        sb.append(Rep.toString()).append("\n");  
    }
    return sb.toString();  
           }
}
