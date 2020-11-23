package controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import modelo.NumeroOrdinal;

public class EmpezarJuego extends Application {

    private static final int CANTIDAD_TARJETAS_POR_FILA = 3;    
    private Tarjeta tarjetaSeleccionada = null;
    private int contadorDeClicks = 2;

    private Parent crearContenido() {        
        Pane root = new Pane();
        root.setPrefSize(600, 600);

        List<Tarjeta> tarjetas = new ArrayList<>();
             
        NumeroOrdinal vectorDeNumerosOrdinales[] = new NumeroOrdinal[6]; 
        vectorDeNumerosOrdinales[0] = new NumeroOrdinal("1", "First");
        vectorDeNumerosOrdinales[1] = new NumeroOrdinal("1", "Primero");
        vectorDeNumerosOrdinales[2] = new NumeroOrdinal("2", "Second");
        vectorDeNumerosOrdinales[3] = new NumeroOrdinal("2", "Segundo");                
        vectorDeNumerosOrdinales[4] = new NumeroOrdinal("3", "Third");
        vectorDeNumerosOrdinales[5] = new NumeroOrdinal("3", "Tercero");
                
        
        for (NumeroOrdinal vectorDeNumerosOrdinale : vectorDeNumerosOrdinales) {
            tarjetas.add(new Tarjeta(vectorDeNumerosOrdinale));           
        }

        Collections.shuffle(tarjetas);

        for (int i = 0; i < tarjetas.size(); i++) {
            Tarjeta tile = tarjetas.get(i);
            tile.setTranslateX(150 * (i % CANTIDAD_TARJETAS_POR_FILA));
            tile.setTranslateY(150 * (i / CANTIDAD_TARJETAS_POR_FILA));
            root.getChildren().add(tile);
        }
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(crearContenido()));
        primaryStage.show();
    }

    private final class Tarjeta extends StackPane {
        private final Text text = new Text();

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
    public static void main(String[] args) {
        launch(args);
    }
}