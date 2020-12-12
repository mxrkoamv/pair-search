package controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import data.Numbers;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.NumeroOrdinal;
import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import modelo.Partida;

/**
 *
 * @authors 
 * Sebastián Rodríguez
 * Saul Bohorquez
 * Giovanny Sandova
 * Juan Antonio Peleiz
 * Marco Antonio Marin
 */

public class EmpezarJuego {

    private static final int CANTIDAD_TARJETAS_POR_COLUMNA = 4;
    int contadorDeTiempo;
    int currentCorrects;
    
    private Tarjeta tarjetaSeleccionada = null;
    private int contadorDeClicks = 2;

    Timer timer = new Timer();
    GridPane root = new GridPane();
    Label titulo = new Label();

    
    public Parent crearContenido() {
        root.setPadding(new Insets(50, 0, 0, 10));
        titulo.setPadding(new Insets(-150, 0, 0, 0));
        /*counter.setPadding(new Insets(-50, 50, 100, 150));*/
        root.getChildren().add(titulo);

        Partida pardita = Partida.getInstace();
        contadorDeTiempo = pardita.getTiempo();
        timer.scheduleAtFixedRate(this.timerTask, 0, 1000);

        List<Tarjeta> tarjetas = new ArrayList<>();

        NumeroOrdinal vectorDeNumerosOrdinales[] = Numbers.numbersArray(pardita.getNivel());

        for (NumeroOrdinal vectorDeNumerosOrdinale : vectorDeNumerosOrdinales) {
            tarjetas.add(new Tarjeta(vectorDeNumerosOrdinale));
        }

        Collections.shuffle(tarjetas);

        for (int i = 0; i < tarjetas.size(); i++) {
            Tarjeta tile = tarjetas.get(i);
            tile.setTranslateX(100 * (i % CANTIDAD_TARJETAS_POR_COLUMNA));
            tile.setTranslateY(100 * (i / CANTIDAD_TARJETAS_POR_COLUMNA));
            root.getChildren().add(tile);
        }

        return root;
    }
    
    
    private class Tarjeta extends StackPane {
        private final Text text = new Text();

        // Se instancia la clase para acceder a los valores guardados.
        Partida partida = Partida.getInstace();    

        // Constructor de la clase.
        private Tarjeta(NumeroOrdinal value) {               
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
            if (esAbierto() || contadorDeClicks == 0) {                
                return;
            }        

            contadorDeClicks--;

            if (tarjetaSeleccionada == null) {                            
                tarjetaSeleccionada = this;
                abrir(() -> {});
            } else {
                abrir(() -> {                                        
                    if (!tieneElMismoValor(tarjetaSeleccionada)) {
                        tarjetaSeleccionada.cerrar();
                        this.cerrar();
                    }
                    tarjetaSeleccionada = null;
                    contadorDeClicks = 2;                
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
        
    // Metodó para manejar contador
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            Partida pardita = Partida.getInstace();
            String counter = Integer.toString(pardita.getCurrentCorrects());
            Platform.runLater(() -> titulo.setText("Tiempo:" + " " + Integer.toString(contadorDeTiempo)));
            contadorDeTiempo--;
            if (contadorDeTiempo == 0) {
                timer.cancel();
                root.setDisable(true);
            }
            if (pardita.getIfAllTurned()) {
                pardita.setNivel(pardita.getNivel() + 1);
                timer.cancel();
                root.setDisable(true);
            }
        }
    };

    /*
    @Override
    public void start(Stage primaryStage) throws Exception {        
        primaryStage.setScene(new Scene(crearContenido()));
        primaryStage.show();
    }
    */
}
