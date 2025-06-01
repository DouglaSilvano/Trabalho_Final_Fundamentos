package src; /**
 * 1) Seu programa deve executar enquanto a opção de saída (opção 10) não for informada.
 * 2) As opções 1 e 2 (Adicionar/Remover terreno) deve mostrar mensagem informando se a
 * inserção/remoção foi feita com sucesso ou se a inserção/remoção não pode ser efetuada.
 * 3) A opção 1 (Adicionar terreno) não pode permitir inserir um terreno se o código já estiver
 * cadastrado.
 * 4) A inserção do valor da construção no terreno (atributo construção) deve fornecer ao usuário as
 * opções -> Informe o tipo de ocupação: 1-construção 2-baldio. Se o usuário informar a opção 1,
 * inserir true, se o usuário informar a opção 2, inserir false. Se o usuário informar um valor
 * diferente, mostrar mensagem adequada.
 * 5) As opções 5 e 6 mostra os dados do terreno, conforme a funcionalidade. Caso o terreno
 * informado não exista, mostrar mensagem adequada.
 * 6) As opções 7 e 8 (Alterar proprietário/status de construção) só poderá executar as ações se o
 * código do terreno existir no condomínio.
 */

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        String opcao1;
        int opcao0 = 0;
        int contadorCase1 = 0;
        int contadorCase2 = 0;
        int contadorCase3 = 0;
        int contadorCase4 = 0;
        int contadorCase5 = 0;
        int contadorCase6 = 0;
        int contadorCase7 = 0;
        int contadorCase8 = 0;
        int contadorCase9 = 0;
        Scanner teclado = new Scanner(System.in);
//        System.out.println("Informe como deseja começar:+" + "\n" +
//                           "[1] Incluir terreno " + "\n" +
//                           "[2] Remover terreno" + "\n" +
//                           "[3] Mostrar terrenos" + "\n" +
//                           "[4] Pesquisar e mostrar terreno por nome de proprietário" + "\n" +
//                           "[5] Mostrar terreno com menor área do condomínio" + "\n" +
//                           "[6] Mostrar terreno com a maior família" + "\n" +
//                           "[7] Alterar proprietário de terreno" + "\n" +
//                           "[8] Alterar status de construção do terreno" + "\n" +
//                           "[9] Mostrar a arrecadação mensal do condomínio" + "\n" +
//                           "[10] Sair do programa" + "\n");
//        opcao0 = teclado.nextInt();

        // tentei com while e não consegui while(opcao1!=(1||2||3||4||5||6||7||8||9||10)){}
        while(opcao0!=10){
            System.out.println("Informe como deseja começar:" + "\n" +
                    "[1] Incluir terreno " + "\n" +
                    "[2] Remover terreno" + "\n" +
                    "[3] Mostrar terrenos" + "\n" +
                    "[4] Pesquisar e mostrar terreno por nome de proprietário" + "\n" +
                    "[5] Mostrar terreno com menor área do condomínio" + "\n" +
                    "[6] Mostrar terreno com a maior família" + "\n" +
                    "[7] Alterar proprietário de terreno" + "\n" +
                    "[8] Alterar status de construção do terreno" + "\n" +
                    "[9] Mostrar a arrecadação mensal do condomínio" + "\n" +
                    "[10] Sair do programa" + "\n");
            opcao0 = teclado.nextInt();
            switch(opcao0) {

                case 1:
                    System.out.println("Voce selecionou a opcao 1.");
                    contadorCase1 = contadorCase1 + 1;
                    //Tentei fazer uma criação de objeto, mas acredito que tem que ser feito uma criação de array, porém como vamos fazer um array infinito?
                    String proprietarioCase1 =  "proprietario"+ contadorCase1;
//                    Proprietario proprietarioCase1 = new Proprietario();
                    System.out.println("Insira o nome do terreno: ");
                    opcao1 = teclado.nextLine();
                    opcao1 = teclado.nextLine();
                    break;
                case 2:
                    System.out.println("Voce selecionou a opcao 2.");
                    break;
                case 3:
                    System.out.println("Voce selecionou a opcao 3.");
                    break;
                case 4:
                    System.out.println("Voce selecionou a opcao 4.");
                    break;
                case 5:
                    System.out.println("Voce selecionou a opcao 5.");
                    break;
                case 6:
                    System.out.println("Voce selecionou a opcao 6.");
                    break;
                case 7:
                    System.out.println("Voce selecionou a opcao 7.");
                    break;
                case 8:
                    System.out.println("Voce selecionou a opcao 8.");
                    break;
                case 9:
                    System.out.println("Voce selecionou a opcao 9.");
                    break;
                case 10:
                    System.out.println("Voce selecionou a opcao 10.");
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    //Será necessário voltar isso aqui pro começo, estudar (consegui fazer voltar com o while).
                    //1) Seu programa deve executar enquanto a opção de saída (opção 10) não for informada (concluído).
                    System.out.println("Informe uma opcao1 valida.");
                    break;
            }
        }


    }
}
