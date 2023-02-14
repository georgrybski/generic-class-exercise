import java.util.List;

public class Impressora {
    public static <T extends Produto> void listarProdutos(List<T> listaProduto) {
        listaProduto.forEach(System.out::println);
    }
}
