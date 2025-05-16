# 📦 Sistema de Estoque com Firebase (Java)
Este projeto é um sistema de gerenciamento de estoque simples, feito em Java, com integração ao Firebase Realtime Database via requisições HTTP. É ideal para quem está aprendendo a usar o Firebase com Java de forma prática e funcional.

# ✅ Funcionalidades:
- Adicionar produtos ao estoque.

- Visualizar todos os produtos cadastrados.

- Cálculo automático do valor total em estoque.

- Envio automático dos dados ao Firebase.

# 🛠️ Tecnologias e Ferramentas:
- Java 24.

- Firebase Realtime Database.

- HttpURLConnection para comunicação HTTP.

- Interface de texto via console.

# 📋 Pré-requisitos:
Antes de rodar este projeto, você precisa ter:

- Java JDK 17 ou superior instalado.

- Git instalado para clonar o repositório.

- Uma conta no Firebase com um projeto criado.

- A URL do seu Realtime Database (ex: https://SEU-PROJETO.firebaseio.com/).

# 🚀 Como rodar o projeto:

- 1. Clone o repositório:
    git clone https://github.com/GabriielRamos/Estoque-Firebase
    cd Estoque-Firebase

- 2. Abra o projeto em uma IDE de sua preferência (Eclipse, IntelliJ, VS Code).

- 3. Edite a URL do Firebase em FirebaseService.java:
    private static final String FIREBASE_URL = "https://SEU-PROJETO.firebaseio.com/";

- 4. Compile e execute SistemaEstoque.java.

# 💡 Exemplo de uso:

  Estoque | Selecione uma opção:
  [1] Adicionar
  [2] Visualizar
  [3] Fechar
  Digite aqui: 1
  
  Nome do Produto: Teclado
  Quantidade de Produtos: 10
  Preço do Produtos: 120
  
  Produto adicionado com sucesso!
  Produto salvo no Firebase!

# 🧠 Estrutura do Projeto:

  ├── SistemaEstoque.java          # Classe principal
  ├── MenuEstoque.java             # Interface de menu
  ├── AdicionarProduto.java        # Entrada de dados via Scanner
  ├── ProdutoEstoque.java          # Classe modelo
  ├── VisualizarEstoque.java       # Exibição no console
  ├── FirebaseService.java         # Integração com Firebase

# 🧰 Boas práticas:

- Trate exceções de entrada (InputMismatchException).

- Valide dados antes de enviar para o Firebase.

- Modularize o código (como neste projeto).

- Nunca exponha a chave do seu Firebase em projetos públicos.

# 🛠️ Solução de problemas comuns:

  | Problema                              | Solução                                                                                          |
  | ------------------------------------- | ------------------------------------------------------------------------------------------------ |
  | `java.net.UnknownHostException`       | Verifique sua conexão com a internet e a URL do Firebase                                         |
  | `403 Forbidden` ou `401 Unauthorized` | Verifique as regras do Realtime Database no Firebase                                             |
  | Dados não aparecem no Firebase        | Certifique-se de que o método `POST` está correto e que você está usando `.json` no final da URL |

# 📚 Referências e Links úteis:
  https://firebase.google.com/docs/database
  https://firebase.google.com/docs/web/setup
  https://docs.oracle.com/javase/8/docs/api/java/net/HttpURLConnection.html
