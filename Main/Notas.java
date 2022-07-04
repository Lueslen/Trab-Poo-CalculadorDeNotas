package Main;

import java.util.ArrayList;

public class Notas{
    protected ArrayList<Prova> prova = new ArrayList<Prova>();
    
    public void addProva(String nome, double nota, double peso){
        Prova avaliacao = new Prova(nome,nota, peso);
        prova.add(avaliacao);
    }

    public ArrayList<Prova> getProva() {
        return prova;
    }

    public double Media(){
        double mediaprova = 0;

        for (int i = 0; i < prova.size(); i++){
            mediaprova += prova.get(i).nota * prova.get(i).peso;
        }

        return mediaprova;
    }

    public double Peso(){
        double mediaprova = 0;

        if (prova.size() > 1){
            for (int i = 0; i < prova.size() - 1; i++){
                mediaprova += prova.get(i).peso + prova.get(i+1).peso;
            }
        }
        
        else{
            mediaprova = prova.get(0).peso;
        }

        return mediaprova;
    }
}