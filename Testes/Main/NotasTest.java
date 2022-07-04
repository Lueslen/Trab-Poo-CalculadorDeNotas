package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotasTest {

    @Test
    void media() {
        Notas resultado = new Notas();
        resultado.addProva("prova",10,5);
        assertEquals(50,resultado.Media());
    }

    @Test
    void peso() {
        Notas resultado = new Notas();
        resultado.addProva("prova",10,5);
        assertEquals(5,resultado.Peso());
    }
}