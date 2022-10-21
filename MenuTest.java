package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MenuTest {
    @Test
    public void calcularImporte(){
        //Given (los datos dados)
       // Menu infantil= new Infantil(950,2);
        Menu vegetariano= new Vegetariano(1200,1,1);

        //When (cuando pase esos datos tendré una respuesta)
       double resultado= vegetariano.calcularPrecio();
       double esperado= 1214.0;

        //Then (verificar)
        Assertions.assertEquals(esperado, resultado);

    }




}
