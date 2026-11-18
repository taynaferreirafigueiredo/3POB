public class CatalogoApp {

    public static void main(String[] args) {
        CatalogoService service = new CatalogoService();

        service.cadastrar(new Produto("P1", "Notebook", 3500.00, 5));
        service.cadastrar(new Produto("P2", "Mouse", 50.00, 30));
        service.cadastrar(new Produto("P3", "Monitor", 900.50, 10));
        service.cadastrar(new Produto("P4", "Teclado", 150.00, 20));

        System.out.println("Lista inicial:");
        for (int i = 0; i < service.tamanho(); i++) {
            System.out.println(i + " - " + service.obterPorPosicao(i));
        }

        service.excluirPorCodigo("P3");

        System.out.println();
        System.out.println("Apos excluir P3:");
        for (int i = 0; i < service.tamanho(); i++) {
            System.out.println(i + " - " + service.obterPorPosicao(i));
        }

        service.ordenarPorPreco();

        System.out.println();
        System.out.println("Lista ordenada por preco (menor para maior):");
        for (int i = 0; i < service.tamanho(); i++) {
            System.out.println(i + " - " + service.obterPorPosicao(i));
        }
    }
}
