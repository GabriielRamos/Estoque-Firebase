import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;

public class FirebaseService {
    // URL base do banco de dados do Firebase
    private static final String FIREBASE_URL = "https://estoquelojatech-default-rtdb.firebaseio.com/";

    public void salvarProduto(ProdutoEstoque produto) {
        try {
            // Cria a URL com endpoint 'produtos'
            URL url = new URL(FIREBASE_URL + "produtos.json");

            // Abre a conexão
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("POST"); // Método POST
            conexao.setRequestProperty("Content-Type", "application/json"); // Tipo de conteúdo
            conexao.setDoOutput(true); // Permite envio de dados

            // Formata os dados do produto como JSON
            String json = String.format(Locale.US, "{\"nome\":\"%s\", \"quantidade\":%d, \"valor\":%.2f}",
                    produto.getNome(), produto.getQuantidade(), produto.getValor());

            // Mostra o JSON gerado
            System.out.println("Enviando JSON: " + json);

            // Envia os dados para o Firebase
            try (OutputStream os = conexao.getOutputStream()) {
                os.write(json.getBytes());
                os.flush();
            }

            // Lê o código de resposta da requisição
            int resposta = conexao.getResponseCode();
            if (resposta == 200) {
                System.out.println("Produto salvo no Firebase!\n");
            } else {
                System.out.println("Erro ao salvar no Firebase: " + resposta);
            }

            // Encerra a conexão
            conexao.disconnect();
        } catch (Exception e) {
            System.out.println("Erro ao conectar com Firebase: " + e.getMessage());
        }
    }
}