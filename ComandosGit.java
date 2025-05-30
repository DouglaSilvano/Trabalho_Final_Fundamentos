import java.util.Scanner;

public class ComandosGit {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int caso;
        System.out.println( "Olá, este é um programa inicial para que a gente entenda um pouco mais sobre Git e Github!" + "\n" +
                            "Escolha uma das opções:" + "\n"
        +                   "[1] git init" + "\n"
                +           "[2] git status" + "\n"
        +                   "[3] git add " + "\n"
                +           "[4] git commit -m " + "\n"
        +                   "[5] git log " + "\n"
        +                   "[6] git push " + "\n"
        +                   "[7] git pull " + "\n");
        caso = teclado.nextInt();
        //Atalho: ctrl + 9
        switch(caso){
            case 1:
                System.out.println("O comando 'git init' Inicia o Git na pasta atual (vira um repositório)." + "\n" +
                                   "Atalho do InteliJ: ctrl + k" );
                break;
            case 2:
                System.out.println("O comando 'git status' Mostra quais arquivos foram modificados ou adicionados.");
                break;
            case 3:
                System.out.println("O comando 'git add' Adiciona todos os arquivos modificados. ");
                break;
            case 4:
                System.out.println("O comando 'git commit -m' Cria uma nova versão do projeto com os arquivos adicionados." );
                break;
            case 5:
                System.out.println("O comando 'git log' Mostra todos os commits já feitos no projeto.");
                break;
            case 6:
                System.out.println("O comando 'git push origin main' Envia os commits para a branch main do repositório remoto.");
                break;
            case 7:
                System.out.println("O comando 'git pull origin main' Baixa e atualiza os arquivos com o que está no repositório remoto.");
                break;
            default:
                System.out.println("Ok.");
                break;
        }
    }
}
