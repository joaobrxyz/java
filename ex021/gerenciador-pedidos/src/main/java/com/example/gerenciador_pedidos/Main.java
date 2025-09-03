package com.example.gerenciador_pedidos;

import java.time.LocalDate;
import java.util.*;

public class Main {
    private Scanner leitura = new Scanner(System.in);
    private ProdutoRepository produtoRepository;
    private CategoriaRepository categoriaRepository;
    private PedidoRepository pedidoRepository;
    private FornecedorRepository fornecedorRepository;

    public Main(ProdutoRepository produtoRepository, CategoriaRepository categoriaRepository, PedidoRepository pedidoRepository, FornecedorRepository fornecedorRepository) {
        this.produtoRepository = produtoRepository;
        this.categoriaRepository = categoriaRepository;
        this.pedidoRepository = pedidoRepository;
        this.fornecedorRepository = fornecedorRepository;
    }

    public void menu(){
        var opcao = -1;
        while(opcao != 0) {
            var menu = """
                    1 - Cadastrar produto
                    2 - Cadastrar categoria
                    3 - Cadastrar fornecedor
                    4 - Cadastrar pedido
                    5 - Visualizar produtos
                    6 - Visualizar categorias
                    7 - Visualizar fornecedores
                    8 - Visualizar pedidos
                    9 - Visualizar produto por nome
                    10 - Visualizar produtos por categoria
                    11 - Visualizar produtos maiores que o valor fornecido
                    12 - Visualizar produtos menores que o valor fornecido
                    13 - Visualizar produtos cujo nome contenha o termo especificado
                    14 - Visualizar pedidos sem data de entrega
                    15 - Visualizar pedidos com data de entrega
                    16 - Visualizar produtos de uma categoria ordenados pelo preço de forma decrescente
                    17 - Visualizar a contagem de produtos em uma categoria
                    18 - Visualizar a contagem de produtos cujo preço seja maior que o valor fornecido
                    
                    0 - Sair                                 
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    cadastrarCategoria();
                    break;
                case 3:
                    cadastrarFornecedor();
                    break;
                case 4:
                    cadastrarPedido();
                    break;
                case 5:
                    visualizarProdutos();
                    break;
                case 6:
                    visualizarCategorias();
                    break;
                case 7:
                    visualizarFornecedores();
                    break;
                case 8:
                    visualizarPedidos();
                    break;
                case 9:
                    visualizarProdutoPorNome();
                    break;
                case 10:
                    visualizarProdutosPorCategoria();
                    break;
                case 11:
                    visualizarProdutosValorMaior();
                    break;
                case 12:
                    visualizarProdutosValorMenor();
                    break;
                case 13:
                    visualizarProdutosPorNome();
                    break;
                case 14:
                    visualizarPedidosSemDataEntrega();
                    break;
                case 15:
                    visualizarPedidosComDataEntrega();
                    break;
                case 16:
                    visualizarProdutosPorCategoriaOrdenados();
                    break;
                case 17:
                    visualizarContagemProdutosPorCategoria();
                    break;
                case 18:
                    visualizarContagemProdutosPorPrecoMaior();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }}

    private void visualizarProdutoPorNome() {
        System.out.println("Digite o nome do produto: ");
        var nomeProduto = leitura.nextLine();
        List<Produto> produtos = Collections.singletonList(produtoRepository.findByNome(nomeProduto));
        produtos.forEach(System.out::println);
    }
    private void visualizarProdutosPorCategoria() {
        System.out.println("Categorias disponíveis: ");
        visualizarCategorias();
        System.out.println("Digite o id da categoria para visualizar os produtos: ");
        Long categoriaId = leitura.nextLong();
        leitura.nextLine();

        Optional<Categoria> categoria = categoriaRepository.findById(categoriaId);
        if (categoria.isEmpty()) {
            System.out.println("Categoria com o ID " + categoriaId + " não encontrada. Abortando operação.");
            return;
        }
        List<Produto> produtos = produtoRepository.findByCategoria(categoria.get());
        produtos.forEach(System.out::println);
    }
    private void visualizarProdutosValorMaior() {
        System.out.println("A partir de qual valor pra cima? ");
        var valor = leitura.nextDouble();
        List<Produto> produtos = produtoRepository.findByPrecoGreaterThanEqual(valor);
        produtos.forEach(System.out::println);
    }
    private void visualizarProdutosValorMenor() {
        System.out.println("A partir de qual valor pra baixo? ");
        var valor = leitura.nextDouble();
        List<Produto> produtos = produtoRepository.findByPrecoLessThanEqual(valor);
        produtos.forEach(System.out::println);
    }
    private void visualizarProdutosPorNome() {
        System.out.println("Digite o nome ou parte do nome do produto: ");
        var nomeProduto = leitura.nextLine();
        List<Produto> produtos = produtoRepository.findByNomeContainingIgnoreCase(nomeProduto);
        produtos.forEach(System.out::println);
    }
    private void visualizarPedidosSemDataEntrega() {
        List<Pedido> pedidos = pedidoRepository.findByDataIsNull();
        pedidos.forEach(System.out::println);
    }
    private void visualizarPedidosComDataEntrega() {
        List<Pedido> pedidos = pedidoRepository.findByDataIsNotNull();
        pedidos.forEach(System.out::println);
    }
    private void visualizarProdutosPorCategoriaOrdenados() {
        System.out.println("Categorias disponíveis: ");
        visualizarCategorias();
        System.out.println("Digite o id da categoria para visualizar os produtos: ");
        Long categoriaId = leitura.nextLong();
        leitura.nextLine();

        Optional<Categoria> categoria = categoriaRepository.findById(categoriaId);
        if (categoria.isEmpty()) {
            System.out.println("Categoria com o ID " + categoriaId + " não encontrada. Abortando operação.");
            return;
        }
        List<Produto> produtos = produtoRepository.findByCategoriaOrderByPrecoDesc(categoria.get());
        produtos.forEach(System.out::println);
    }
    private void visualizarContagemProdutosPorCategoria() {
        System.out.println("Categorias disponíveis: ");
        visualizarCategorias();
        System.out.println("Digite o id da categoria para visualizar os produtos: ");
        Long categoriaId = leitura.nextLong();
        leitura.nextLine();

        Optional<Categoria> categoria = categoriaRepository.findById(categoriaId);
        if (categoria.isEmpty()) {
            System.out.println("Categoria com o ID " + categoriaId + " não encontrada. Abortando operação.");
            return;
        }

        Long produtosCont = produtoRepository.countByCategoria(categoria.get());
        System.out.println("Existe " + produtosCont + " produtos cadastrados nessa categoria");
    }
    private void visualizarContagemProdutosPorPrecoMaior() {
        System.out.println("A partir de que valor pra cima? ");
        var valor = leitura.nextDouble();
        Long produtosCont = produtoRepository.countByPrecoGreaterThanEqual(valor);
        System.out.println("Existe " + produtosCont + " produtos maiores que R$" + valor);
    }
    private void cadastrarProduto() {
        System.out.println("Categorias disponíveis: ");
        visualizarCategorias();
        System.out.println("Digite o id da categoria do produto: ");
        Long categoriaId = leitura.nextLong();
        leitura.nextLine();

        Optional<Categoria> categoria = categoriaRepository.findById(categoriaId);
        if (categoria.isEmpty()) {
            System.out.println("Categoria com o ID " + categoriaId + " não encontrada. Abortando operação.");
            return;
        }

        System.out.println("Fornecedores disponíveis: ");
        visualizarFornecedores();
        System.out.println("Digite o id do fornecedor do produto: ");
        Long fornecedorId = leitura.nextLong();
        leitura.nextLine();

        Optional<Fornecedor> fornecedor = fornecedorRepository.findById(fornecedorId);
        if (fornecedor.isEmpty()) {
            System.out.println("Fornecedor com o ID " + fornecedorId + " não encontrado. Abortando operação.");
            return;
        }

        System.out.println("Digite o nome do produto: ");
        var nome = leitura.nextLine();
        System.out.println("Digite o valor do produto: ");
        var valor = leitura.nextDouble();

        Produto produto = new Produto(fornecedor.get(), nome, valor, categoria.get());
        produtoRepository.save(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }
    private void cadastrarCategoria() {
        System.out.println("Digite o nome da categoria que deseja cadastrar: ");
        var categoriaNome = leitura.nextLine();
        Categoria categoria = new Categoria(categoriaNome);
        categoriaRepository.save(categoria);
    }
    private void cadastrarFornecedor() {
        System.out.println("Digite o nome do fornecedor que deseja cadastrar: ");
        var fornecedorNome = leitura.nextLine();
        Fornecedor fornecedor = new Fornecedor(fornecedorNome);
        fornecedorRepository.save(fornecedor);
    }
    private void cadastrarPedido() {
        System.out.println("Produtos disponíveis: ");
        produtoRepository.findAll().forEach(produto ->
                System.out.println("Produto: " + produto.getNome()));
        String opcao = "S";
        List<Produto> produtos = new ArrayList<>();
        while (opcao.equalsIgnoreCase("N")) {
            System.out.println("Digite o nome do produto para adicionar ao carrinho: ");
            var produto = leitura.nextLine();
            Produto produtoLista  = produtoRepository.findByNome(produto);
            produtos.add(produtoLista);

            System.out.println("Deseja adicionar mais um produto na lista? (S/N)");
            opcao = leitura.nextLine();
        }
        Pedido pedido = new Pedido(LocalDate.now());
        pedido.setProdutos(produtos);
        pedidoRepository.saveAll(List.of(pedido));
        System.out.println("Pedido salvo!");
    }
    private void visualizarProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        produtos.forEach(System.out::println);
    }
    private void visualizarCategorias() {
        List<Categoria> categorias = categoriaRepository.findAll();
        categorias.forEach(System.out::println);
    }
    private void visualizarFornecedores() {
        List<Fornecedor> fornecedors = fornecedorRepository.findAll();
        fornecedors.forEach(System.out::println);
    }
    private void visualizarPedidos() {
        List<Pedido> pedidos = pedidoRepository.findAll();
        pedidos.forEach(System.out::println);
    }
}
