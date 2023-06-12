import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class loja {
    // Atributos
    private String nome_loja;
    private ArrayList<Carne> catalogo = new ArrayList<Carne>(); // Declarando e instanciando um objeto(catálogo)
    // -> Coleção de objetos Polimórfica - referências polimorficas

    // Método Construtor
    public loja(String nome_loja) {
        this.nome_loja = nome_loja;
    }

    // Métodos
    public void adicionar(Carne item) {
        catalogo.add(item);
    }

    public void adicionar_Carne_Bovina() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da fabricante da carne que deseja adicionar no catálogo:");
        String nome_fabricante = teclado.nextLine();

        System.out.println("Digite o preço unitário:");
        double preco_unitario = teclado.nextDouble();

        System.out.println("Digite o peso da carne: ");
        String peso = teclado.next();

        System.out.println("Digite se a carne está temperada: ");
        String tempero = teclado.next();

        System.out.println("Digite a classificação da carne: ");
        String classificacao = teclado.next();

        System.out.println("Digite a quantidade de estoque:");
        int quant_estoque = teclado.nextInt();

        System.out.println("Digite o tipo de corte que deseja adicionar no catálogo: ");
        String tipo_corte = teclado.next();

        Bovina cadastro = new Bovina(nome_fabricante, preco_unitario, peso, quant_estoque, tipo_corte, tempero,
                classificacao);
        catalogo.add(cadastro);
        cadastro.tipos_d_cortes(); // vai imprimir os tipos de cortes disponiveis para fazer o cadastro

        // decisão para retornar o metodo no começo
        System.out.println("\n\nDeseja cadastrar uma nova Carne Bovina? [S/N]:");
        String decisao = teclado.next();

        if ("S".equals(decisao))
            adicionar_Carne_Bovina();
        if (!"S".equals(decisao))
            System.out.println("Fim do progrma!");
        teclado.close();
    }

    public void adicionar_Carne_Suina() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tipo de Carne Suína que deseja adicionar no catalogo:");
        String nome_fabricante = teclado.next();

        System.out.println("Digite o preço unitário:");
        double preco_unitario = teclado.nextDouble();

        System.out.println("Digite o peso da carne: ");
        String peso = teclado.next();

        System.out.println("Digite se a carne está temperada: ");
        String tempero = teclado.nextLine();

        System.out.println("Digite a classificação da carne: ");
        String classificacao = teclado.next();

        System.out.println("Digite a quantidade de estoque:");
        int quant_estoque = teclado.nextInt();

        System.out.println("Digite o tipo de corte que deseja adicionar no catálogo: ");
        String tipo_corte = teclado.next();

        Suina cadastro = new Suina(nome_fabricante, preco_unitario, peso, quant_estoque, tipo_corte, tempero,
                classificacao);
        catalogo.add(cadastro);
        cadastro.tipos_d_cortes(); // vai imprimir os tipos de cortes disponiveis para fazer o cadastro

        // decisão para retornar o metodo no começo
        System.out.println("\n\nDeseja cadastrar um nova Carne Suína? [S/N]:");
        String decisao = teclado.next();

        if ("S".equals(decisao))
            adicionar_Carne_Suina();
        if (!"S".equals(decisao))
            System.out.println("Fim do progrma!");
        teclado.close();
    }

    public void procurar() throws Excecaoprocura {
        Scanner teclado = new Scanner(System.in);
        try {
            imprimir();
            System.out.println("\n");
            System.out.println("Digite a Carne que deseja procurar:");
            String dado = teclado.nextLine();
            boolean resposta = false;
            for (Carne b : catalogo) {
                if (b.fabricada_por(dado) == true) {
                    resposta = true;
                    System.out.println("\n");
                    System.out.println("Possui a Carne");
                    break;
                }
            }
            if (resposta == false) {
                throw new Excecaoprocura("Não possui essa corte no catalogo");
            }

            // decisão para realizar novamente o método
            System.out.println("\n\nDeseja fazer mais uma Pesquisa? [S/N]:");
            String decisao = teclado.next();

            if ("S".equals(decisao)) {
                procurar();
            }
            if (!"S".equals(decisao)) {
                System.out.println("Fim da Pesquisa!");
            }
        } finally {
            teclado.close();
        }
    }

    public void corte_procura() {
        try {
            procurar();
        } catch (Excecaoprocura e) {
            e.printStackTrace();
        }
    }

    public void compra() {
        Scanner teclado = new Scanner(System.in);
        imprimir();
        System.out.println("\n");
        System.out.println("---------------------Comprar--------------");
        System.out.println("Digite a Carne que deseja comprar:");
        String fabricante = teclado.nextLine();
        System.out.println("Digite a quantidade que deseja comprar: ");
        int quant = teclado.nextInt();
        comprar(fabricante, quant);
        imprimir();
        // decisão para realizar novamente o método
        System.out.println("\n\nDeseja fazer mais uma compra? [S/N]:");
        String decisao = teclado.next();

        if ("S".equals(decisao))
            compra();
        if (!"S".equals(decisao))
            System.out.println("Fim da Compra!");
        teclado.close();

    }

    public void venda() {
        Scanner teclado = new Scanner(System.in);
        imprimir();
        System.out.println("\n");
        System.out.println("---------------------Venda--------------");
        System.out.println("Digite a Carne que deseja vender:");
        String fabricante = teclado.nextLine();
        System.out.println("Digite a quantidade que deseja vender: ");
        int quant = teclado.nextInt();
        vender(fabricante, quant);
        imprimir();
        // decisão para realizar novamente o método
        System.out.println("\n\nDeseja fazer mais uma venda? [S/N]:");
        String decisao = teclado.next();

        if ("S".equals(decisao))
            venda();
        if (!"S".equals(decisao))
            System.out.println("Fim da Venda!");
        teclado.close();
    }

    public void atualiza() {
        Scanner teclado = new Scanner(System.in);
        imprimir();
        System.out.println("\n");
        System.out.println("---------------------Atualização--------------");
        System.out.println("Digite a Carne que deseja atualizar: ");
        String fabricante = teclado.nextLine();
        System.out.println("Digite o valor da Carne que deseja atualizar: ");
        double valor_Carne = teclado.nextDouble();
        atualizar(fabricante, valor_Carne);
        imprimir();
        // decisão para realizar novamente o método
        System.out.println("\n\nDeseja fazer mais uma atualização? [S/N]:");
        String decisao = teclado.next();

        if ("S".equals(decisao))
            atualiza();
        if (!"S".equals(decisao))
            System.out.println("Fim da Venda!");
        teclado.close();
    }

    public void comprar(String fabricante, int quant) {
        for (Carne b : catalogo) { // passa por cada item
            if (b.fabricada_por(fabricante)) { // função para comparar os dados sem quebrar o encapsulamento
                b.comprar_b(quant); // caso tenha avança para a função de comprar a quant que o usuario quiser
            }
        }
    }

    public void vender(String fabricante, int quant) {
        for (Carne b : catalogo) {
            if (b.fabricada_por(fabricante)) {
                b.vender_b(quant);
            }
        }
    }

    public void atualizar(String fabricante, double valor_Carne) {
        for (Carne b : catalogo) {
            if (b.fabricada_por(fabricante)) {
                b.atualizar_preco(valor_Carne);
            }
        }
    }

    public void imprimir() {
        System.out.println("o nome da loja é " + nome_loja);
        for (Carne b : catalogo) {
            String s = b.toString();
            System.out.println(s);
        }
    }

    public void imprimi_cortes() { // Chamada poliformica de método
        for (Carne c : catalogo) {
            c.tipos_d_cortes();
        }
        System.out.println("\nVoltando para o menu:");
    }

    public void gerar_arquivo() {
        String conteudo;
        try {
            FileWriter gerar = new FileWriter("Açougue.txt");
            for (Carne c : catalogo) {
                conteudo = c.toString();
                conteudo += "\r\n";
                gerar.write(conteudo);
            }
            gerar.close();
            System.out.println("Arquivo criado!");
        } catch (IOException e) {
            System.out.println("Erro, arquivo não criado");
            e.printStackTrace();
        }
    }

    public void menu() {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 10) {
            System.out.println("---------------------------Menu--------------------------");
            System.out.println("|Opção 1: Visualizar os Produtos                        |");
            System.out.println("|Opção 2: Procurar Carne pela marca                     |");
            System.out.println("|Opção 3: Adicionar nova Carne Bovina                   |");
            System.out.println("|Opção 4: Adicionar novo Carne Suina                    |");
            System.out.println("|Opção 5: Comprar Carne                                 |");
            System.out.println("|Opção 6: Vender Carne                                  |");
            System.out.println("|Opção 7: Atualizar a Carne                             |");
            System.out.println("|Opção 8: Ver os tipos de carnes                        |");
            System.out.println("|Opção 9: Gerar arquivo txt                             |");
            System.out.println("|Opção 10: Saída do Menu                                |");
            System.out.println("---------------------------------------------------------\n");

            System.out.print("Selecione uma das opções acima:");
            opcao = teclado.nextInt();

            switch (opcao) {

                // Colocar os metodos em cada case de acordo com o Menu

                case 1:
                    imprimir();
                    break;

                case 2:
                    corte_procura();
                    break;

                case 3:
                    adicionar_Carne_Bovina();

                    break;

                case 4:
                    adicionar_Carne_Suina();
                    break;

                case 5:
                    compra();
                    break;

                case 6:
                    venda();
                    break;

                case 7:
                    atualiza();
                    break;

                case 8:
                    imprimi_cortes();
                    break;

                case 9:
                    gerar_arquivo();
                    break;

                case 10:
                    System.out.println("Saindo do menu...");
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("O Código não possui essa opção");
                    System.out.println("\n");
            }
        }
        teclado.close();
    }
}