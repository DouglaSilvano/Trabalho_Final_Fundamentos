import java.util.Scanner;
import java.util.Arrays;
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

    //Método que recebe o codigo do terreno e, caso ele exista, remove o terreno do condomínio,
    //reorganiza os objetos e retorna true se a remoção foi realizada com sucesso ou false se a remoção
    //não foi possível);
    public boolean removerTerreno(int codTerreno) {
        int posicao = 0;
        for (int i = 0; i < this.indice; i++) {
            if (codTerreno == this.vetTerrenos[i].getCodigo()) {
                System.out.print("Terreno de cod [" + this.vetTerrenos[i] + "] está sendo removido.");
                posicao = i;
            }
        }
        for (int j = posicao; j < this.indice - 1; j++) {
            this.vetTerrenos[j] = this.vetTerrenos[j + 1];
        }
            this.vetTerrenos[this.indice - 1] = null;
            this.indice--;
            //int posicao= localizaPessoa(p1);
            // for(int i = posicao; i < this.index-1; i++){
//                this.vetorPessoas[i] = this.vetorPessoas[i+1];
//            }
//            this.vetorPessoas[this.index-1] = null;
//            this.indice-1;
            //Arrays.sort(this.vetTerrenos);
        if(posicao == 0){
            System.out.println("ERRO! Código do terreno não encontrado.");
            return false;
        }else{
            System.out.println("Terreno removido!");
            return true;
        }

    }

    //Método que recebe um Terreno e retorna o número inteiro referente a posição em que está posicionado no vetor.
    public int buscarPosicao(Terreno TerrenoA){
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
    //buscarTerrenoComMaiorFamilia (retorna o terreno que possui a maior família morando);
    public Terreno buscarTerrenoComMaiorFamilia(){
        int posicao = 0;
        double pessoasM = 0;
        for(int i=0;i<indice;i++){
            if(pessoasM< this.vetTerrenos[i].getProprietario().getQtdeMoradores()){
                pessoasM = this.vetTerrenos[i].getProprietario().getQtdeMoradores();
                posicao = i;
            }
        }
        return vetTerrenos[posicao];
    }
    //arrecadacaoMensal (retorna o valor que o condomínio arrecada a partir do valorMensal que cada
    //terreno paga);
    public double arrecadacaoMensal(){
        double totalArrec = 0.0;
        for(int i = 0; i<this.indice;i++){
            totalArrec = totalArrec + this.vetTerrenos[i].getValorMensal();
        }
        return totalArrec;
    }
}


