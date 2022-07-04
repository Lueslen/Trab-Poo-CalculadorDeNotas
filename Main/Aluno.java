package Main;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    Notas nota = new Notas();

    public Aluno(String nome){
        this.nome = nome;
    }

    public void addProva(String nome, double nota, double peso){
        this.nota.addProva(nome,nota,peso);
    }

    public ArrayList<Prova> getProvas(){
        return nota.getProva();
    }

    public double medFinal(){
        return nota.Media() / nota.Peso();
    }
}