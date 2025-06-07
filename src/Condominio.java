import java.util.Scanner;

/** 1- adicionarTerreno (insere um objeto terreno no vetor para isto, recebe o objeto terreno e retorna
    true se a inserção pode ser realizada ou false se a inserção não foi possível);
    
    3- buscarPosicao (recebe o terreno e retorna a posição do vetor em que ele está armazenado. Caso
    não esteja armazenado, retorna o valor -1);
    
    5- buscarTerrenoPorCodigo (recebe o código do terreno e retorna o terreno que contém o código do
    terreno recebido);
 */
public class Condominio
{
    private Terreno [] vetTerrenos;
    private int indice;
    
    //construtor que cria o vetor de terrenos.
    public Condominio (Terreno vetTerrenos[]){
        this.vetTerrenos = new Terreno [30];
        this.indice = 0;
    }
    
    //método para adicionar um terreno no vetor utilizando do atributo "indice". retornando true se há espaço e false se não houver.
    public boolean adicionarTerreno(Terreno novoTerreno){
        for(int i = 0; i < this.vetTerrenos.length; i++){
            if(i < this.indice){
                this.vetTerrenos[i] = novoTerreno;
                this.indice++;
                return true;
            }
        }
        return false;
    }
    
    //Método que recebe um Terreno e retorna o número inteiro referente a posição em que está posicionado no vetor.
    public int BuscarPosicao(Terreno TerrenoA){
        for(int i = 0; i < this.vetTerrenos.length; i++){
            if(TerrenoA == this.vetTerrenos[i]){
            return i;
            }
        }
        return -1;
    }
    
    //método que recebe um código e retorna o terreno referente ao código se houver ou returna nulo.
    public Terreno buscarTerrenoPorCodigo(int codTerreno){
        for(int i = 0; i < this.vetTerrenos.length; i++){
            if(codTerreno == this.vetTerrenos[i].getCodigo()){
                System.out.print("terreno de cod [" + codTerreno + "]: ");
                return vetTerrenos[i];
            }
        }
        System.out.print("Não existe terreno com o código informado");
        return null;
    }
}


