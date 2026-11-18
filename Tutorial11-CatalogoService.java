import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoService {

    private final List<Produto> produtos = new ArrayList<>();

    public void cadastrar(Produto p) {
        if (p == null) {
            throw new IllegalArgumentException("Produto nao pode ser nulo");
        }
        if (produtos.contains(p)) {
            throw new IllegalArgumentException("Codigo ja cadastrado: " + p.getCodigo());
        }
        produtos.add(p);
    }

    public Produto obterPorPosicao(int indice) {
        if (indice < 0 || indice >= produtos.size()) {
            throw new IndexOutOfBoundsException("Indice invalido: " + indice);
        }
        return produtos.get(indice);
    }

    public boolean excluirPorCodigo(String codigo) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo().equals(codigo)) {
                produtos.remove(i);
                return true;
            }
        }
        return false;
    }

    public void ordenarPorPreco() {
        Collections.sort(produtos);
    }

    public int tamanho() {
        return produtos.size();
    }
}
