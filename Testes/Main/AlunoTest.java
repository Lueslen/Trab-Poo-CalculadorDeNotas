package Main;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @org.junit.jupiter.api.Test
    void addProva() {
        Aluno xyuki = new Aluno("Yuki");
        xyuki.addProva("1ª prova",10,5);
        assertEquals("1ª prova",xyuki.getProvas().get(0).nome);
        assertEquals(10,xyuki.getProvas().get(0).nota);
        assertEquals(5,xyuki.getProvas().get(0).peso);
    }

    @org.junit.jupiter.api.Test
    void medFinal() {
        Aluno xyuki = new Aluno("Yuki");
        xyuki.addProva("1ª prov", 10,5);
        xyuki.addProva("2ª prov", 10,5);
        xyuki.addProva("3ª prov", 10,5);
        assertEquals(7.5,xyuki.medFinal());
    }
}