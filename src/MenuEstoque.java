import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuEstoque {
    Scanner entrada = new Scanner(System.in); // Para leitura do teclado
    AdicionarProduto adicionar = new AdicionarProduto(); // Instância para adicionar produto
    VisualizarEstoque visualizar = new VisualizarEstoque(); // Instância para visualizar
    List<ProdutoEstoque> produtos = new ArrayList<>(); // Lista local de produtos
    FirebaseService firebase = new FirebaseService(); // Serviço de comunicação com Firebase

    public void exibirMenu () {
        int escolha = 0;
        do {
            // Exibe as opções do menu
            System.out.println ("Estoque | Selecione uma opção:");
            System.out.println ("[1] Adicionar");
            System.out.println ("[2] Visualizar");
            System.out.println ("[3] Fechar");
            System.out.print ("Digite aqui: ");

            try {
                escolha = entrada.nextInt();
                entrada.nextLine(); // Limpa o buffer

                if ( escolha == 1 ) {
                    // Adiciona um novo produto
                    System.out.println ("\nAdicionando Produto.\n");
                    ProdutoEstoque novoProduto = adicionar.produto(); // Coleta os dados
                    produtos.add(novoProduto); // Adiciona à lista
                    firebase.salvarProduto(novoProduto); // Envia para o Firebase
                } else if ( escolha == 2 ) {
                    // Exibe os produtos cadastrados
                    System.out.println ("\nVisualizando Estoque.");
                    visualizar.mostrarProdutos(produtos);
                } else if ( escolha == 3 ) {
                    // Encerra o programa
                    System.out.println ("\nFechando Programa.\n");
                } else {
                    System.out.println ("\nOpção Invalida.\n");
                }

            } catch ( InputMismatchException error ) {
                // Trata erro de entrada não numérica
                System.out.println ("\nDigite um valor numérico valido!\n");
                entrada.nextLine();
            }
        } while ( escolha != 3 );
    }
}