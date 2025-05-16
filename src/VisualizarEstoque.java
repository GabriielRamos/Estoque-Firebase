import java.util.List;

public class VisualizarEstoque {
    public void mostrarProdutos ( List<ProdutoEstoque> produtos ) {
        if ( produtos.isEmpty()) {
            System.out.println ("===|Estoque Vazio|===\n");
        } else {
            System.out.println ("Produtos em Estoque.\n");
            // Para cada produto, mostra as informações
            for ( ProdutoEstoque prod : produtos ) {
                System.out.println ("|Nome: " + prod.getNome() +
                        " | Quantidade: " + prod.getQuantidade() +
                        " | Preço: R$" + prod.getValor() +
                        " | Valor em Estoque: R$" + prod.getValorEmEstoque() +
                        " |");
            }
        }
    }
}