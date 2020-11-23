/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javafx.animation.FadeTransition;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 * Esta clase se encarga de crear una tarjeta con todas sus propiedades.
 * @author Marco
 */
public class Tarjeta extends StackPane {
    private final Text text = new Text();
    
    // Se instancia la clase para acceder a los valores guardados.
    Partida partida = Partida.getInstace();    

    // Constructor de la clase.
    public Tarjeta(NumeroOrdinal value) {               
        Rectangle border = new Rectangle(100, 100);
        border.setFill(null);
        border.setStroke(Color.BLACK);
        text.setText(value.getValue());
        text.setId(value.getId());
        text.setFont(Font.font(20));

        setAlignment(Pos.CENTER);
        getChildren().addAll(border, text);
        setOnMouseClicked(this::handleMouseClick);
        cerrar();        
    }                

    // Metodó para manejar evento click de cada tarjeta.
    public void handleMouseClick(MouseEvent event) {
        if (esAbierto() || partida.getContadorDeClicks() == 0) {                
            return;
        }        
        
        partida.setContadorDeClicks(partida.getContadorDeClicks() - 1);
        
        if (partida.getTarjetaSeleccionada() == null) {                            
            partida.setTarjetaSeleccionada(this);
            abrir(() -> {});
        } else {
            abrir(() -> {                                        
                if (!tieneElMismoValor(partida.getTarjetaSeleccionada())) {
                    partida.getTarjetaSeleccionada().cerrar();
                    this.cerrar();
                }
                partida.setTarjetaSeleccionada(null);
                partida.setContadorDeClicks(2);                
            });
        }
    }

    // Meotodó para manejar el estado de opacidad de una tarjeta.
    public boolean esAbierto() {
        return text.getOpacity() == 1;
    }

    // Metodó para abir una tarjeta.
    public void abrir(Runnable action) {
        FadeTransition ft = new FadeTransition(Duration.seconds(0.5), text);
        ft.setToValue(1);
        ft.setOnFinished(e -> action.run());
        ft.play();
    }

    // Metodó para cerrar una tarjeta.
    public void cerrar() {
        FadeTransition ft = new FadeTransition(Duration.seconds(0.5), text);
        ft.setToValue(0);
        ft.play();
    }

    // Metodó para verificar que los ID's de las tarjetas coincidan con el fin de que se activen.
    public boolean tieneElMismoValor(Tarjeta other) {
        return text.getId().equals(other.text.getId());
    }
        
}
