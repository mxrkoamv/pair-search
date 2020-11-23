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
    
    
    
}
