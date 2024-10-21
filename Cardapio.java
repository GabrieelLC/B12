import java.util.Scanner;

public class Cardapio {

    private static final int LIM_REG = 100;
    private static final String[][] produtos = new String[LIM_REG][4];
    private static final String[][] clientes = new String[LIM_REG][10];
    private static int totalProdutos = 0;
    private static int totalClientes = 0;
    private static Scanner entradaDados = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenuPrincipal();
            opcao = entradaDados.nextInt();
            entradaDados.nextLine();

            switch (opcao) {
                case 1:
                    menuCadastroProduto();
                    break;
                case 2:
                    menuCadastroCliente();
                    break;
                case 3:
                    imprimirCardapio();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\nMenu Principal:");
        System.out.println("1. Cadastro de Produtos");
        System.out.println("2. Cadastro de Clientes");
        System.out.println("3. Imprimir Cardápio");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void menuCadastroProduto() {
        System.out.println("\nCadastro de Produtos:");
        System.out.println("1. Incluir Produto");
        System.out.println("2. Alterar Produto");
        System.out.println("3. Excluir Produto");
        System.out.println("4. Consultar Produto");
        System.out.print("Escolha uma opção: ");
        int opcao = entradaDados.nextInt();
        entradaDados.nextLine();

        switch (opcao) {
            case 1:
                incluirProduto();
                break;
            case 2:
                alterarProduto();
                break;
            case 3:
                excluirProduto();
                break;
            case 4:
                consultarProduto();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void incluirProduto() {
        if (totalProdutos >= LIM_REG) {
            System.out.println("Cadastro de produtos cheio.");
            return;
        }

        String codigo;
        do {
            System.out.print("Código (6 caracteres alfanuméricos): ");
            codigo = entradaDados.nextLine().toUpperCase();
            if (codigo.length() != 6) {
                System.out.println("Código inválido! Deve conter exatamente 6 caracteres.");
            }
        } while (codigo.length() != 6);

        String produto;
        do {
            System.out.print("Produto (min 3, max 60 caracteres): ");
            produto = entradaDados.nextLine().toUpperCase();
            if (produto.length() < 3 || produto.length() > 60) {
                System.out.println("Descrição do produto inválida!");
            }
        } while (produto.length() < 3 || produto.length() > 60);

        double preco;
        do {
            System.out.print("Preço (formato 0.00): ");
            preco = entradaDados.nextDouble();
            entradaDados.nextLine();

            if (preco < 0) {
                System.out.println("O preço deve ser positivo.");
            }
        } while (preco < 0);

        String ativo;
        do {
            System.out.print("Ativo (true para ativo, false para desativado): ");
            ativo = entradaDados.nextLine().toUpperCase();
            if (!ativo.equals("TRUE") && !ativo.equals("FALSE")) {
                System.out.println("Valor inválido! Informe true ou false.");
            }
        } while (!ativo.equals("TRUE") && !ativo.equals("FALSE"));

        produtos[totalProdutos][0] = codigo;
        produtos[totalProdutos][1] = produto;
        produtos[totalProdutos][2] = ativo;
        produtos[totalProdutos][3] = String.format("%.2f", preco);
        totalProdutos++;

        System.out.println("Produto cadastrado com sucesso.");
    }

    private static void alterarProduto() {
        System.out.print("Digite o código do produto a alterar: ");
