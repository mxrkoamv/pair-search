/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @authors 
 * Sebastián Rodríguez
 * Saul Bohorquez
 * Giovanny Sandova
 * Juan Antonio Peleiz
 * Marco Antonio Marin
 */

public class NumeroOrdinal {
    String id;
    String value;

    public NumeroOrdinal(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }       
    
}
