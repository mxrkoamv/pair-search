/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Esta clase es la encargada de persistir inforamción de la partida, esta
 * creada con el patrón singleton ya que solo debe haber una instancía de ella.
 * @author Marco
 */
public class Partida {
    
    private static Partida juego;
    private Tarjeta tarjetaSeleccionada;
    private int contadorDeClicks = 2;
    int tiempo;
    private int nivel;
    private int currentCorrects = 0;

    private Partida() { }

    public static Partida getInstace() {
        if(juego == null) {
            juego = new Partida();
        }
        return juego;   
    }

    public Tarjeta getTarjetaSeleccionada() {
        return tarjetaSeleccionada;
    }

    public void setTarjetaSeleccionada(Tarjeta tarjetaSeleccionada) {
        this.tarjetaSeleccionada = tarjetaSeleccionada;
    }

    public int getContadorDeClicks() {
        return contadorDeClicks;
    }

    public void setContadorDeClicks(int contadorDeClicks) {
        this.contadorDeClicks = contadorDeClicks;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCurrentCorrects() {
        return currentCorrects;
    }

    public void setCurrentCorrects(int currentCorrects) {
        this.currentCorrects = currentCorrects;
    }

    public boolean getIfAllTurned() {
        return this.currentCorrects == 2;
    }
}
