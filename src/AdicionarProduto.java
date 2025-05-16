import java.util.InputMismatchException;
import java.util.Scanner;

public class AdicionarProduto {

    Scanner entrada = new Scanner(System.in);
    String nomeProduto;
    int quantidadeProduto;
    double valorProduto;

    public ProdutoEstoque produto () {
        // Lê o nome
        System.out.print ("Nome do Produto: ");
        nomeProduto = entrada.nextLine();

        // Lê a quantidade, com tratamento de erro
        while (true) {
            System.out.print ("Quantidade de Produtos: ");

            try {
                quantidadeProduto = entrada.nextInt();
                entrada.nextLine();
                break;
            } catch ( InputMismatchException error) {
                System.out.println ("\nDigíte um valor inteiro!\n");
                entrada.nextLine();
            }
        }

        // Lê o valor, com tratamento de erro
        while (true) {
            System.out.print ("Preço do Produtos: ");

            try {
                valorProduto = entrada.nextDouble();
                entrada.nextLine();
                break;
            } catch ( InputMismatchException error) {
                System.out.println ("\nDigíte um valor decimal valido! (Use , ao invés de .)\n");
                entrada.nextLine();
            }
        }

        // Mensagem de sucesso
        System.out.println ("Produto adicionado com sucesso!\n");

        // Retorna um novo objeto ProdutoEstoque
        return new ProdutoEstoque ( nomeProduto, quantidadeProduto, valorProduto );
    }
}