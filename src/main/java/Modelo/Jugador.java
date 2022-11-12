package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julda
 */
public class Jugador {
    
    private String nombre;
    private int vidas;
    private int puntos;
    
    public Jugador(){
        nombre = "";
    }
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getVidas(){
        return vidas;
    }
    
    public void setVidas(int vidas){
        this.vidas = vidas;
    }
    
    public void perderVidas(){
        vidas--;
    }
    
    public int getPuntos(){
        return puntos;
    }
    
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    
    public void ganarPuntos(){
        int ganoPuntos = puntos + 100;
    }
}
