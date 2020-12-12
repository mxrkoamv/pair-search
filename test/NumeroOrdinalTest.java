/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modelo.NumeroOrdinal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @authors 
 * Sebastián Rodríguez
 * Saul Bohorquez
 * Giovanny Sandova
 * Juan Antonio Peleiz
 * Marco Antonio Marin
 */

public class NumeroOrdinalTest {
    
    public NumeroOrdinalTest() {
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    @Test
    public void testGetId() throws NoSuchFieldException, IllegalAccessException {
        final NumeroOrdinal numeroOrdinal = new NumeroOrdinal("1", "first");
                
        final String resultado = numeroOrdinal.getId();
        assertEquals("1", resultado);
    }
    
    @Test
    public void testGetValue() throws NoSuchFieldException, IllegalAccessException {
        final NumeroOrdinal numeroOrdinal = new NumeroOrdinal("2", "Segundo");
                
        final String resultado = numeroOrdinal.getValue();
        assertEquals("Segundo", resultado);
    }
}
