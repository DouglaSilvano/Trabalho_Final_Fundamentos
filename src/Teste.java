import java.util.Scanner;

/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Teste
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Proprietario proprietarios[] = new Proprietario[1];
        System.out.println("insira o nome do morador");
        String nome = teclado.next();
        proprietarios[0] = new Proprietario(4,nome);
        System.out.println(proprietarios[0].getNome());
    }
}
