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
import modelo.Tarjeta;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import modelo.Partida;

public class EmpezarJuego extends Application {

    private static final int CANTIDAD_TARJETAS_POR_COLUMNA = 4;
    int contadorDeTiempo;
    int currentCorrects;

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

    @Override
    public void start(Stage primaryStage) throws Exception {        
        primaryStage.setScene(new Scene(crearContenido()));
        primaryStage.show();
    }
}
