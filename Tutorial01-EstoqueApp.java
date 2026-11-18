public class EstoqueApp {

    public static void main(String[] args) {

        // criando dois itens (new coloca eles no Heap)
        ItemEstoque item1 = new ItemEstoque("001", "Teclado", 10, 59.90);
        ItemEstoque item2 = new ItemEstoque("002", "Mouse", -5, 25.50); // quantidade invalida, vira 0

        System.out.println("=== Estado inicial ===");
        System.out.println(item1.getNome() + " -> " + item1.getQuantidade());
        System.out.println(item2.getNome() + " -> " + item2.getQuantidade());

        System.out.println("\n=== Simulacao de entregas ===");

        // retirada valida
        boolean ok = item1.removerEstoque(4);
        System.out.println("Retirar 4 de Teclado: " + ok);
        System.out.println("Saldo Teclado: " + item1.getQuantidade());

        // retirada excessiva (tem 6, tenta tirar 20)
        ok = item1.removerEstoque(20);
        System.out.println("Retirar 20 de Teclado: " + ok);
        System.out.println("Saldo Teclado: " + item1.getQuantidade());

        // retirada de quantidade negativa
        ok = item1.removerEstoque(-3);
        System.out.println("Retirar -3 de Teclado: " + ok);
        System.out.println("Saldo Teclado: " + item1.getQuantidade());

        // mouse esta com 0, nao pode tirar nada
        ok = item2.removerEstoque(1);
        System.out.println("Retirar 1 de Mouse: " + ok);
        System.out.println("Saldo Mouse: " + item2.getQuantidade());

        // adicionando estoque
        ok = item2.adicionarEstoque(15);
        System.out.println("Adicionar 15 de Mouse: " + ok);
        System.out.println("Saldo Mouse: " + item2.getQuantidade());

        ok = item2.adicionarEstoque(0);
        System.out.println("Adicionar 0 de Mouse: " + ok);
        System.out.println("Saldo Mouse: " + item2.getQuantidade());

        // testando valor unitario invalido
        System.out.println("\n=== Teste de valor invalido ===");
        try {
            ItemEstoque item3 = new ItemEstoque("003", "Monitor", 5, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
