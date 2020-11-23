/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javafx.application.Application;;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Marco
 */
public class Menu extends Application {
 
    Scene menu, juego;
        
    @Override
    public void start(Stage primaryStage) {     
        Label label1 = new Label("MENU");
        Button botonFacil = new Button("Fácil");
        Button botonMedio = new Button("Medio");
                       
        botonFacil.setOnAction((e) -> {                    
            primaryStage.setScene(juego);
        });
        botonMedio.setOnAction((e) -> {                        
            primaryStage.setScene(juego);
        });
        
        VBox layout1 = new VBox(50);
        layout1.getChildren().addAll(label1, botonFacil, botonMedio);
        menu = new Scene(layout1, 600, 600);
       
        
        Button boton2 = new Button("xddd");
        boton2.setOnAction(e -> primaryStage.setScene(menu));
        
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(boton2);
        EmpezarJuego ini = new EmpezarJuego();        
        juego = new Scene(ini.crearContenido(), 600, 600);
        
        primaryStage.setScene(menu);
        primaryStage.show();
    }
 
     public static void main(String[] args) {
        launch(args);
    }
    
}

