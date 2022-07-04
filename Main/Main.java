package Main;

public class Main {
    public static void main(String[] args) {
        Aluno alunox = new Aluno("alunox");

        alunox.addProva("1ª prov", 10,5);
        alunox.addProva("2ª prov", 10,5);
        alunox.addProva("3ª prov", 10,5);

        System.out.println(alunox.medFinal());

    }
}