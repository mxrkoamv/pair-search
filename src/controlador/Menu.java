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
import javafx.scene.layout.HBox;
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
        Label dificultad = new Label("Dificultad");
        Button botonFacil = new Button("Fácil");
        Button botonMedio = new Button("Medio");
        Button botonDificil = new Button("Difícil");
        Label nivel = new Label("Nivel");
        Button btnDiez = new Button("Diez");
        Button btnVeinte = new Button("Veinte");
        Button btnTreita = new Button("Treita");
        Button btnCuarenta = new Button("Cuarenta");
        Button btnCincuenta = new Button("Cincuenta");
        Button btnSesenta = new Button("Sesenta");
        Button btnSetenta = new Button("Setenta");
        Button btnOchenta = new Button("Ochenta");
        Button btnNoventa = new Button("Noventa");
        Button btnCien = new Button("Cien");


        Partida partida = Partida.getInstace();
        EmpezarJuego ini = new EmpezarJuego();

        // SET DIFICULT

        botonFacil.setOnAction((e) -> {
            partida.setTiempo(120);
            // partida.setNivel(1);
            // juego = new Scene(ini.crearContenido(), TAMANIO_EN_X, TAMANIO_EN_Y);
            // primaryStage.setScene(juego);
        });
        botonMedio.setOnAction((e) -> {
            partida.setTiempo(60);
            // partida.setNivel(1);
            // juego = new Scene(ini.crearContenido(), TAMANIO_EN_X, TAMANIO_EN_Y);
            // primaryStage.setScene(juego);
        });
        botonDificil.setOnAction((e) -> {
            partida.setTiempo(30);
            // partida.setNivel(1);
            // juego = new Scene(ini.crearContenido(), TAMANIO_EN_X, TAMANIO_EN_Y);
            // primaryStage.setScene(juego);
        });

        // SET LEVEL
        btnDiez.setOnAction((e) -> {
            partida.setNivel(1);
            launch(primaryStage, ini);
        });
        btnVeinte.setOnAction((e) -> {
            partida.setNivel(2);
            launch(primaryStage, ini);
        });
        btnTreita.setOnAction((e) -> {
            partida.setNivel(3);
            launch(primaryStage, ini);
        });
        btnCuarenta.setOnAction((e) -> {
            partida.setNivel(4);
            launch(primaryStage, ini);
        });
        btnCincuenta.setOnAction((e) -> {
            partida.setNivel(5);
            launch(primaryStage, ini);
        });
        btnSesenta.setOnAction((e) -> {
            partida.setNivel(6);
            launch(primaryStage, ini);
        });
        btnSetenta.setOnAction((e) -> {
            partida.setNivel(7);
            launch(primaryStage, ini);
        });
        btnOchenta.setOnAction((e) -> {
            partida.setNivel(8);
            launch(primaryStage, ini);
        });
        btnNoventa.setOnAction((e) -> {
            partida.setNivel(9);
            launch(primaryStage, ini);
        });
        btnCien.setOnAction((e) -> {
            partida.setNivel(10);
            launch(primaryStage, ini);
        });


        VBox layout = new VBox(25);
        HBox hbox = new HBox(10, botonFacil, botonMedio, botonDificil);
        hbox.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(titulo, dificultad, hbox, nivel, btnDiez, btnVeinte, btnTreita, btnCuarenta, btnCincuenta, btnSesenta, btnSetenta, btnOchenta, btnNoventa, btnCien);
        layout.setAlignment(Pos.CENTER);
        menu = new Scene(layout, TAMANIO_EN_X, 600);

        primaryStage.setScene(menu);
        primaryStage.show();
    }

    private void launch(Stage primaryStage, EmpezarJuego ini) {
        juego = new Scene(ini.crearContenido(), TAMANIO_EN_X, TAMANIO_EN_Y);
        primaryStage.setScene(juego);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
