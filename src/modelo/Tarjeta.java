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
 *
 * @author Marco
 */
public class Tarjeta extends StackPane {
    private final Text text = new Text();
    
    Partida partida = Partida.getInstace();    

    public Tarjeta(NumeroOrdinal value) {       
        
        Rectangle border = new Rectangle(150, 150);
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

    public boolean esAbierto() {
        return text.getOpacity() == 1;
    }

    public void abrir(Runnable action) {
        FadeTransition ft = new FadeTransition(Duration.seconds(0.5), text);
        ft.setToValue(1);
        ft.setOnFinished(e -> action.run());
        ft.play();
    }

    public void cerrar() {
        FadeTransition ft = new FadeTransition(Duration.seconds(0.5), text);
        ft.setToValue(0);
        ft.play();
    }

    public boolean tieneElMismoValor(Tarjeta other) {
        return text.getId().equals(other.text.getId());
    }
        
}
