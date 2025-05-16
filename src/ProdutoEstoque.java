public class ProdutoEstoque {

        private String nome;
        private int quantidade;
        private double valor;

        // Construtor com parâmetros
        public ProdutoEstoque ( String nome, int quantidade, double valor ) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.valor = valor;
        }

        // Calcula o valor total em estoque
        public double getValorEmEstoque () {
            return quantidade * valor;
        }

        // Getters para acessar os atributos
        public String getNome () {
            return nome;
        }

        public int getQuantidade () {
            return quantidade;
        }

        public double getValor () {
            return valor;
        }
}