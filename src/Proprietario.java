package src;

public class Proprietario {
    private String nome;
    private int qtdeMoradores;

    //construtor 1:
    public Proprietario(){
        this.qtdeMoradores = 0;
        this.nome = "";
    }
    //construtor 2:
    public Proprietario(int qtdeMoradores, String nome){
        this.qtdeMoradores = qtdeMoradores;
        this.nome = nome;
    }
    //getters:
    public double getQtdeMoradores(){
        return this.qtdeMoradores;
    }
    public String getNome(){
        return this.nome;
    }

    //setters:
    public void setQtdeMoradores(int qtdeMoradores){
        this.qtdeMoradores = qtdeMoradores;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String toString(int qtdeMoradores, String nome){
        return this.qtdeMoradores + "" + this.nome;
    }
}









