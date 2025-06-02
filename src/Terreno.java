
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
    private ProprietarioT proprietario;
    private boolean construcao;
    public Terreno(int codigo, double base, double altura){
        this.codigo = codigo;
        this.base = base;
        this.altura = altura;
        this.valorMensal = 0;
        this.proprietario = null;
        this.construcao = false;
    }
    
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
    
    public void setProprietario(ProprietarioT prop){
        this.proprietario = prop;
    }
    
    public ProprietarioT getProprietario(){
        return this.proprietario;
    }
    
    public void setConstrucao(boolean construcao){
        this.construcao = construcao;
    }
    
    public boolean getConstrucao(){
        return this.construcao;
    }
    
    public double CalcularArea(double base, double altura){
        return base*altura;
    }
}