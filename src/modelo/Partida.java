/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Esta clase es la encargada de persistir inforamción de la partida, esta
 * creada con el patrón singleton ya que solo debe haber una instancía de ella.
 * @authors 
 * Sebastián Rodríguez
 * Saul Bohorquez
 * Giovanny Sandova
 * Juan Antonio Peleiz
 * Marco Antonio Marin
 */

public class Partida {
    
    private static Partida juego;    
    int tiempo;
    
    private Partida() { }

    public static Partida getInstace() {
        if(juego == null) {
            juego = new Partida();
        }
        return juego;   
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }            
}
