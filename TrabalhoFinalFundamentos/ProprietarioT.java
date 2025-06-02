
/**
 * Escreva uma descrição da classe Morador aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ProprietarioT {
    private String nome;
    private int qtdemoradores;
    public ProprietarioT(String nome, int qtdeMoradores) {
        this.nome = nome;
        this.qtdemoradores = qtdeMoradores;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setqtdemoradores(int qtdMoradores){
        this.qtdemoradores = qtdemoradores;
    }
    
    public int getqtdemoradores(){
        return this.qtdemoradores;
    }
    
    public String toString(){
        return "nome:" + this.nome +
               "\nquantidade de moradores: " + this.qtdemoradores; 
    }
}