
/**
 * Escreva uma descrição da classe Condominio aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Terreno
{
    private int codigo;
    private double base;
    private double altura;
    private double valorMensal;
    private Proprietario proprietario;
    private boolean construcao;
    
    //construtor 1(default).
    public Terreno(){
        this.codigo = 0;
        this.base = 0;
        this.altura = 0;
        this.valorMensal = 0;
        this.proprietario = null;
        this.construcao = false;
    }
    
    //construtor 2 (atributos setados no construtor).
    public Terreno(int codigo, double base, double altura, double valorMensal, Proprietario proprietario, boolean construcao){
        this.codigo = codigo;
        this.base = base;
        this.altura = altura;
        this.valorMensal = valorMensal;
        this.proprietario = proprietario;
        this.construcao = construcao;
    }
    
    // métodos básicos da classe(getters e setters).
    public int getCodigo(){
        return this.codigo;
    }

    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setValorMensal(double valorMensal){
        this.valorMensal = valorMensal;
    }
    
    public double getValorMensal(){
        return this.valorMensal;
    }
    
    public void setProprietario(Proprietario prop){
        this.proprietario = prop;
    }
    
    public Proprietario getProprietario(){
        return this.proprietario;
    }
    
    public void setConstrucao(boolean construcao){
        this.construcao = construcao;
    }
    
    public boolean getConstrucao(){
        return this.construcao;
    }
    
    //método para calcular a área do terreno.
    public double CalcularArea(double base, double altura){
        return base*altura;
    }
}