/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class Usuario {
    private String user;
    private String contra;
    private ArrayList <Vuelo> vuelosReservados = new ArrayList<>();
    public void setUser(String u){
        user = u;
    }
    public String getUser(){
        return user;
    }
    public void setContra(String c){
        contra = c;
    }
    
}
