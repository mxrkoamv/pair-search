/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modelo.Partida;
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
public class PartidaTest {
    
    public PartidaTest() {
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
   @Test
   public void testPartida() {       
       Partida primerInstancia = Partida.getInstace();
       Partida segundaInstancia = Partida.getInstace();
       assertEquals(true, primerInstancia == segundaInstancia);
   }
}
