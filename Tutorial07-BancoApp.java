public class BancoApp {

    public static void main(String[] args) {
        Conta[] contas = new Conta[4];
        contas[0] = new ContaCorrente("CC-001", 1000.0);
        contas[1] = new ContaPoupanca("CP-001", 500.0);
        contas[2] = new ContaCorrente("CC-002", 200.0);
        contas[3] = new ContaPoupanca("CP-002", 50.0);

        System.out.println("=== Saldos iniciais ===");
        for (int i = 0; i < contas.length; i++) {
            contas[i].exibirDados();
        }

        System.out.println();
        System.out.println("=== Saque de R$ 100,00 em todas as contas ===");
        for (int i = 0; i < contas.length; i++) {
            boolean ok = contas[i].sacar(100.0);
            if (ok) {
                System.out.println("Saque realizado");
            } else {
                System.out.println("Saque negado (saldo insuficiente)");
            }
            contas[i].exibirDados();
        }

        int qtd = 0;
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] instanceof Tributavel) {
                qtd++;
            }
        }

        Tributavel[] tributaveis = new Tributavel[qtd];
        int pos = 0;
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] instanceof Tributavel) {
                tributaveis[pos] = (Tributavel) contas[i];
                pos++;
            }
        }

        System.out.println();
        System.out.println("=== Tributos ===");
        double totalTributos = 0;
        for (int i = 0; i < tributaveis.length; i++) {
            double tributo = tributaveis[i].calcularTributo();
            System.out.println("Tributo " + (i + 1) + ": R$ " + tributo);
            totalTributos += tributo;
        }
        System.out.println("Total de tributos recolhidos: R$ " + totalTributos);
    }
}
