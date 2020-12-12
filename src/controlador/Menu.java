/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
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

public class Menu extends Application {
    private final int TAMANIO_EN_X = 520;
    private final int TAMANIO_EN_Y = 600;

    Scene menu, juego;

    @Override
    public void start(Stage primaryStage) {
        Label titulo = new Label("Menú");
        Button botonFacil = new Button("Fácil");
        Button botonMedio = new Button("Medio");
        Button botonDificil = new Button("Difícil");

        Partida partida = Partida.getInstace();
        EmpezarJuego ini = new EmpezarJuego();

        botonFacil.setOnAction((e) -> {
            partida.setTiempo(120);
            partida.setNivel(1);
            juego = new Scene(ini.crearContenido(), TAMANIO_EN_X, TAMANIO_EN_Y);
            primaryStage.setScene(juego);
        });
        botonMedio.setOnAction((e) -> {
            partida.setTiempo(60);
            partida.setNivel(1);
            juego = new Scene(ini.crearContenido(), TAMANIO_EN_X, TAMANIO_EN_Y);
            primaryStage.setScene(juego);
        });
        botonDificil.setOnAction((e) -> {
            partida.setTiempo(30);
            partida.setNivel(1);
            juego = new Scene(ini.crearContenido(), TAMANIO_EN_X, TAMANIO_EN_Y);
            primaryStage.setScene(juego);
        });

        VBox layout = new VBox(50);
        layout.getChildren().addAll(titulo, botonFacil, botonMedio, botonDificil);
        layout.setAlignment(Pos.CENTER);
        menu = new Scene(layout, TAMANIO_EN_X, 600);

        primaryStage.setScene(menu);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
