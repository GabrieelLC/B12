package cdpo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cardapio {

    // Lista para armazenar os produtos, onde cada produto é representado por um
    // array de String
    private static final List<String[]> produtos = new ArrayList<>();
    private static final List<String[]> clientes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            telaInicial(sc);
        }
    }

    // Tela de navegação principal
    public static void telaInicial(Scanner sc) {
        System.out.println("Tela de Navegação");
        System.out.println();
        System.out.println("Cadastro de Produtos -> Digite '1' ");
        System.out.println("Cadastro de Clientes -> Digite '2' ");
        System.out.println("Cardápio -> Digite '3' ");
        System.out.println("Sair -> Digite '4' ");

        int resposta = sc.nextInt();

        switch (resposta) {
            case 1:
                telaCadastroProdutos(sc);
                break;
            case 2:
                telaCadastroClientes(sc); // Ainda a ser implementado
                break;
            case 3:
                visualizarCardapio();
                break;
            case 4:
                System.out.println("Saindo do sistema. Até logo!");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Opção inválida, tente novamente.");
        }
    }

    // Tela de cadastro de produtos com opção de voltar
    public static void telaCadastroProdutos(Scanner sc) {
        while (true) {
            System.out.println("Tela de Cadastro de Produtos");
            System.out.println();
            System.out.println("Cadastrar Produto -> Digite '1' ");
            System.out.println("Consultar Produto -> Digite '2' ");
            System.out.println("Excluir Produto -> Digite '3' ");
            System.out.println("Atualizar Produto -> Digite '4' ");
            System.out.println("Voltar para Tela de Navegação -> Digite '5' ");

            int resposta = sc.nextInt();

            switch (resposta) {
                case 1 -> telaCadastro(sc);
                case 2 -> consultarProduto(sc);
                case 3 -> excluirProduto(sc);
                case 4 -> atualizarProduto(sc);
                case 5 -> {
                    return; // Volta para a tela de navegação
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    // Método para cadastrar produtos
    public static void telaCadastro(Scanner sc) {
        System.out.println("Cadastro de Produtos: ");

        // Validação do código
        String codigo;
        while (true) {
            System.out.println("Digite o código do produto (6 caracteres alfanuméricos): ");
            codigo = sc.nextLine();
            if (codigo.matches("[a-zA-Z0-9]{6}")) {
                break;
            } else {
                System.out.println("Código inválido! O código deve conter exatamente 6 caracteres alfanuméricos.");
            }
        }

        // Validação do nome do produto
        String nomeProduto;
        while (true) {
            System.out.println("Digite o nome do produto (3 a 60 caracteres): ");
            nomeProduto = sc.nextLine().toUpperCase(); // Converte para caixa alta
            if (nomeProduto.matches("[a-zA-Z0-9 ]{3,60}")) {
                break;
            } else {
                System.out.println("Nome do produto inválido! Deve ter entre 3 e 60 caracteres alfanuméricos.");
            }
        }

        // Validação do preço
        String preco;
        while (true) {
            System.out.println("Digite o preço do produto (número positivo com duas casas decimais): ");
            preco = sc.nextLine();
            if (preco.matches("[0-9]+(\\.[0-9]{1,2})?") && Double.parseDouble(preco) > 0) {
                break;
            } else {
                System.out.println("Preço inválido! Deve ser um número positivo com duas casas decimais.");
            }
        }

        // Produto está ativo por padrão (True)
        String ativo = "True";

        // Adiciona o produto à lista de produtos
        String[] produto = { codigo, nomeProduto, preco, ativo };
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso.");
    }

    // Método para visualizar o cardápio
    public static void visualizarCardapio() {
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        System.out.println("CÓDIGO        PRODUTO                                                             VALOR");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");

        // Exibe apenas os produtos que estão ativos (ativo == "True")
        for (String[] produto : produtos) {
            if (produto[3].equals("True")) {
                System.out.printf("%-12s %-65s %.2f%n", produto[0], produto[1], Double.parseDouble(produto[2]));
            }
        }

        System.out.println(
                "-------------------------------------------------------------------------------------------------");
    }

    // Método para consultar produto
    public static void consultarProduto(Scanner sc) {
        System.out.println("Digite o código do produto para consultar: ");
        String codigo = sc.nextLine();

        for (String[] produto : produtos) {
            if (produto[0].equalsIgnoreCase(codigo)) {
                System.out.println("Produto encontrado:");
                System.out.println("Código: " + produto[0]);
                System.out.println("Nome: " + produto[1]);
                System.out.println("Preço: " + produto[2]);
                System.out.println("Ativo: " + produto[3]);
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    // Método para excluir produto
    public static void excluirProduto(Scanner sc) {
        System.out.println("Digite o código do produto que deseja excluir: ");
        String codigo = sc.nextLine();

        for (String[] produto : produtos) {
            if (produto[0].equalsIgnoreCase(codigo)) {
                produto[3] = "False"; // Marca o produto como excluido
                System.out.println("Produto excluído com sucesso.");
                return;
            }
        }

        System.out.println("Produto não existe no cadastro.");
    }

    // Método para atualizar produto
    public static void atualizarProduto(Scanner sc) {
        System.out.println("Digite o código do produto que deseja atualizar: ");
        String codigo = sc.nextLine();

        for (String[] produto : produtos) {
            if (produto[0].equalsIgnoreCase(codigo)) {
                System.out.println("Produto encontrado: ");
                System.out.println("Nome atual: " + produto[1]);
                System.out.println("Preço atual: " + produto[2]);

                // Atualizando nome do produto
                System.out.println("Digite o novo nome do produto (ou pressione ENTER para manter o atual): ");
                String novoNome = sc.nextLine().toUpperCase();
                if (!novoNome.isEmpty()) {
                    if (novoNome.matches("[a-zA-Z0-9 ]{3,60}")) {
                        produto[1] = novoNome;
                    } else {
                        System.out.println("Nome inválido! Mantendo o nome anterior.");
                    }
                }

                // Atualizando preço do produto
                System.out.println("Digite o novo preço do produto (ou pressione ENTER para manter o atual): ");
                String novoPreco = sc.nextLine();
                if (!novoPreco.isEmpty()) {
                    if (novoPreco.matches("[0-9]+(\\.[0-9]{1,2})?") && Double.parseDouble(novoPreco) > 0) {
                        produto[2] = novoPreco;
                    } else {
                        System.out.println("Preço inválido! Mantendo o preço anterior.");
                    }
                }

                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }

        System.out.println("Produto não existe no cadastro.");
    }

    public static void telaCadastroClientes(Scanner sc) {
        while (true) {
            System.out.println("Tela de Cadastro de Clientes");
            System.out.println();
            System.out.println("Cadastrar Cliente -> Digite '1' ");
            System.out.println("Consultar Cliente -> Digite '2' ");
            System.out.println("Excluir Cliente -> Digite '3' ");
            System.out.println("Atualizar Cliente -> Digite '4' ");
            System.out.println("Voltar para Tela de Navegação -> Digite '5' ");

            int resposta = sc.nextInt();

            switch (resposta) {
                case 1 -> cadastrarCliente(sc);
                case 2 -> consultarCliente(sc);
                case 3 -> excluirCliente(sc);
                case 4 -> atualizarCliente(sc);
                case 5 -> {
                    return;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    // Método para cadastrar clientes
    public static void cadastrarCliente(Scanner sc) {
        System.out.println("Cadastro de Clientes: ");

        // Nome
        String nomeCliente;
        while (true) {
            System.out.println("Digite o nome completo do cliente (mínimo 6 caracteres alfabéticos e máximo 60): ");
            nomeCliente = sc.nextLine().toUpperCase();
            if (nomeCliente.matches("[a-zA-Z ]{6,60}")) {
                break;
            } else {
                System.out.println("Nome inválido! Deve conter entre 6 e 60 caracteres alfabéticos.");
            }
        }

        // Telefone
        String telefone;
        while (true) {
            System.out.println("Digite o telefone (formato (99) X9999-9999): ");
            telefone = sc.nextLine();
            if (telefone.matches("\\(\\d{2}\\) \\d{5}-\\d{4}")) {
                break;
            } else {
                System.out.println("Telefone inválido! Deve seguir o formato (99) X9999-9999.");
            }
        }

        // E-mail (opcional)
        System.out.println("Digite o e-mail (opcional, até 80 caracteres): ");
        String email = sc.nextLine();
        if (email.length() > 80) {
            email = email.substring(0, 80);
        }

        // Data de nascimento
        String nascimento;
        while (true) {
            System.out.println("Digite a data de nascimento (formato dd/mm/aaaa): ");
            nascimento = sc.nextLine();
            if (nascimento.matches("\\d{2}/\\d{2}/\\d{4}")) {
                break;
            } else {
                System.out.println("Data de nascimento inválida! Deve seguir o formato dd/mm/aaaa.");
            }
        }

        // Endereço: Logradouro
        String logradouro;
        while (true) {
            System.out.println("Digite o logradouro (máximo 60 caracteres alfanuméricos): ");
            logradouro = sc.nextLine();
            if (logradouro.matches("[a-zA-Z0-9 ]{1,60}")) {
                break;
            } else {
                System.out.println("Logradouro inválido! Deve conter até 60 caracteres alfanuméricos.");
            }
        }

        // Endereço: Número
        String numero;
        while (true) {
            System.out.println("Digite o número (até 4 caracteres numéricos): ");
            numero = sc.nextLine();
            if (numero.matches("\\d{1,4}")) {
                break;
            } else {
                System.out.println("Número inválido! Deve conter até 4 caracteres numéricos.");
            }
        }

        // Endereço: Complemento (opcional)
        System.out.println("Digite o complemento (opcional, até 60 caracteres alfanuméricos): ");
        String complemento = sc.nextLine();
        if (complemento.length() > 60) {
            complemento = complemento.substring(0, 60);
        }

        // Endereço: Bairro
        String bairro;
        while (true) {
            System.out.println("Digite o bairro (até 60 caracteres alfanuméricos): ");
            bairro = sc.nextLine();
            if (bairro.matches("[a-zA-Z0-9 ]{1,60}")) {
                break;
            } else {
                System.out.println("Bairro inválido! Deve conter até 60 caracteres alfanuméricos.");
            }
        }

        // Endereço: Cidade
        String cidade;
        while (true) {
            System.out.println("Digite a cidade (até 60 caracteres alfanuméricos): ");
            cidade = sc.nextLine();
            if (cidade.matches("[a-zA-Z ]{1,60}")) {
                break;
            } else {
                System.out.println("Cidade inválida! Deve conter até 60 caracteres alfabéticos.");
            }
        }

        // Endereço: CEP
        String cep;
        while (true) {
            System.out.println("Digite o CEP (formato 99999-999): ");
            cep = sc.nextLine();
            if (cep.matches("\\d{5}-\\d{3}")) {
                break;
            } else {
                System.out.println("CEP inválido! Deve seguir o formato 99999-999.");
            }
        }

        // Endereço: Estado
        String estado;
        while (true) {
            System.out.println("Digite o estado (2 caracteres alfabéticos): ");
            estado = sc.nextLine().toUpperCase();
            if (estado.matches("[A-Z]{2}")) {
                break;
            } else {
                System.out.println("Estado inválido! Deve conter 2 caracteres alfabéticos.");
            }
        }

        // Sexo
        String sexo;
        while (true) {
            System.out.println("Digite o sexo (M - Masculino, F - Feminino): ");
            sexo = sc.nextLine().toUpperCase();
            if (sexo.equals("M") || sexo.equals("F")) {
                break;
            } else {
                System.out.println("Sexo inválido! Deve ser 'M' ou 'F'.");
            }
        }

        // Autorizado
        String autorizado;
        while (true) {
            System.out.println("Cliente autorizado a receber mensagens? (S/N): ");
            autorizado = sc.nextLine().toUpperCase();
            if (autorizado.equals("S") || autorizado.equals("N")) {
                break;
            } else {
                System.out.println("Resposta inválida! Deve ser 'S' ou 'N'.");
            }
        }

        // Cliente está ativo por padrão (True)
        String ativo = "True";

        // Adiciona o cliente à lista de clientes
        String[] cliente = { nomeCliente, logradouro, numero, complemento, bairro, cidade, cep, estado, sexo, telefone,
                email, nascimento, autorizado, ativo };
        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso.");
    }

    // Método para consultar clientes
    public static void consultarCliente(Scanner sc) {
        System.out.println("Digite o nome do cliente para consultar: ");
        String nomeCliente = sc.nextLine().toUpperCase();

        for (String[] cliente : clientes) {
            if (cliente[0].equalsIgnoreCase(nomeCliente) && cliente[13].equals("True")) {
                System.out.println("Cliente encontrado:");
                System.out.println("Nome: " + cliente[0]);
                System.out.println("Endereço: " + cliente[1] + ", " + cliente[2] + " " + cliente[3]);
                System.out.println("Bairro: " + cliente[4] + ", Cidade: " + cliente[5] + ", CEP: " + cliente[6]
                        + ", Estado: " + cliente[7]);
                System.out.println("Sexo: " + cliente[8]);
                System.out.println("Telefone: " + cliente[9]);
                System.out.println("E-mail: " + cliente[10]);
                System.out.println("Data de Nascimento: " + cliente[11]);
                System.out.println("Autorizado a receber mensagens: " + cliente[12]);
                return;
            }
        }

        System.out.println("Cliente não existe no cadastro.");
    }

    // Método para excluir clientes (marca como inativo)
    public static void excluirCliente(Scanner sc) {
        System.out.println("Digite o nome do cliente para excluir: ");
        String nomeCliente = sc.nextLine().toUpperCase();

        for (String[] cliente : clientes) {
            if (cliente[0].equalsIgnoreCase(nomeCliente) && cliente[13].equals("True")) {
                cliente[13] = "False"; // Marca o cliente como inativo
                System.out.println("Cliente excluído com sucesso.");
                return;
            }
        }

        System.out.println("Cliente não encontrado ou já está inativo.");
    }

    // Método para atualizar clientes
    public static void atualizarCliente(Scanner sc) {
        System.out.println("Digite o nome do cliente para atualizar: ");
        String nomeCliente = sc.nextLine().toUpperCase();

        for (String[] cliente : clientes) {
            if (cliente[0].equalsIgnoreCase(nomeCliente) && cliente[13].equals("True")) {
                System.out
                        .println("Cliente encontrado. Insira os novos dados ou deixe em branco para manter os atuais.");

                // Atualiza os dados do cliente
                cliente[1] = atualizarCampo(sc, "Logradouro", cliente[1]);
                cliente[2] = atualizarCampo(sc, "Número", cliente[2]);
                cliente[3] = atualizarCampo(sc, "Complemento", cliente[3]);
                cliente[4] = atualizarCampo(sc, "Bairro", cliente[4]);
                cliente[5] = atualizarCampo(sc, "Cidade", cliente[5]);
                cliente[6] = atualizarCampo(sc, "CEP", cliente[6]);
                cliente[7] = atualizarCampo(sc, "Estado", cliente[7]);
                cliente[9] = atualizarCampo(sc, "Telefone", cliente[9]);
                cliente[10] = atualizarCampo(sc, "E-mail", cliente[10]);
                cliente[11] = atualizarCampo(sc, "Data de Nascimento", cliente[11]);
                cliente[12] = atualizarCampo(sc, "Autorizado a receber mensagens", cliente[12]);

                System.out.println("Cliente alterado com sucesso.");
                return;
            }
        }

        System.out.println("Cliente não existe no cadastro.");
    }

    // Método auxiliar para atualizar campos dos clientes
    private static String atualizarCampo(Scanner sc, String campo, String valorAtual) {
        System.out.println(campo + " atual (" + valorAtual + "): ");
        String novoValor = sc.nextLine();
        if (!novoValor.isEmpty()) {
            return novoValor;
        }
        return valorAtual;
    }
}
