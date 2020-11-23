package controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modelo.NumeroOrdinal;
import modelo.Tarjeta;

public class EmpezarJuego extends Application {

    private static final int CANTIDAD_TARJETAS_POR_FILA = 3;    
    
    public Parent crearContenido() {            
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
}
