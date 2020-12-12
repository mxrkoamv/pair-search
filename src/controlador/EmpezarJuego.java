package controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    Timer timer = new Timer();
    GridPane root = new GridPane();        
    Label titulo = new Label(); 
    
    public Parent crearContenido() {
        root.setPadding(new Insets(50, 0, 0, 10));
        titulo.setPadding(new Insets(-150, 0, 0, 0));        
        root.getChildren().add(titulo);            
        
        Partida pardita = Partida.getInstace();
        contadorDeTiempo = pardita.getTiempo();
        timer.scheduleAtFixedRate(this.timerTask, 0, 1000);

        List<Tarjeta> tarjetas = new ArrayList<>();

        NumeroOrdinal vectorDeNumerosOrdinales[] = new NumeroOrdinal[20];
        vectorDeNumerosOrdinales[0] = new NumeroOrdinal("1", "First");
        vectorDeNumerosOrdinales[1] = new NumeroOrdinal("1", "Primero");
        vectorDeNumerosOrdinales[2] = new NumeroOrdinal("2", "Second");
        vectorDeNumerosOrdinales[3] = new NumeroOrdinal("2", "Segundo");
        vectorDeNumerosOrdinales[4] = new NumeroOrdinal("3", "Third");
        vectorDeNumerosOrdinales[5] = new NumeroOrdinal("3", "Tercero");
        vectorDeNumerosOrdinales[6] = new NumeroOrdinal("4", "Fourth");
        vectorDeNumerosOrdinales[7] = new NumeroOrdinal("4", "Cuarto");
        vectorDeNumerosOrdinales[8] = new NumeroOrdinal("5", "Fifth");
        vectorDeNumerosOrdinales[9] = new NumeroOrdinal("5", "Quinto");
        vectorDeNumerosOrdinales[10] = new NumeroOrdinal("6", "Sixth");
        vectorDeNumerosOrdinales[11] = new NumeroOrdinal("6", "Sexto");
        vectorDeNumerosOrdinales[12] = new NumeroOrdinal("7", "Seventh");
        vectorDeNumerosOrdinales[13] = new NumeroOrdinal("7", "Septimo");
        vectorDeNumerosOrdinales[14] = new NumeroOrdinal("8", "Eighth");
        vectorDeNumerosOrdinales[15] = new NumeroOrdinal("8", "Octavo");
        vectorDeNumerosOrdinales[16] = new NumeroOrdinal("9", "Ninth");
        vectorDeNumerosOrdinales[17] = new NumeroOrdinal("9", "Noveno");
        vectorDeNumerosOrdinales[18] = new NumeroOrdinal("10", "Tenth");
        vectorDeNumerosOrdinales[19] = new NumeroOrdinal("10", "Decimo");
        

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
            Platform.runLater(() -> titulo.setText("Tiempo:" + " " + Integer.toString(contadorDeTiempo)));            
            contadorDeTiempo--;
            if (contadorDeTiempo == 0) {
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
