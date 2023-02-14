import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Impressora<Produto> impressora = new Impressora<>();
        Estoque<Livro> livroEstoque = new Estoque<>();
        Estoque estoque = new Estoque();
        Livro livro = new Livro("The Three Body Problem", BigDecimal.valueOf(10d));
        Livro livro2 = new Livro("Clean Code", BigDecimal.valueOf(10d));
        Livro livro3 = new Livro("Domain Driven Design", BigDecimal.valueOf(10d));
        livroEstoque.adicionar(livro);
        livroEstoque.adicionar(livro2);
        livroEstoque.adicionar(livro3);

        impressora.listarProdutos(livroEstoque.getLista());
        System.out.println();
        livroEstoque.deletar(2);
        impressora.listarProdutos(livroEstoque.getLista());
        System.out.println();
        impressora.listarProdutos(livroEstoque.getLista());

        Brinquedo brinquedo = new Brinquedo("Mandalorian Action Figure", BigDecimal.valueOf(100d));
//        livroEstoque.adicionar(brinquedo);
    }
}