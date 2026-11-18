public class AnaliseCreditoApp {

    public static void main(String[] args) {
        System.out.println("=== Teste 1: comprometimento de renda excessivo ===");
        try {
            PropostaFinanciamento p1 = new PropostaFinanciamento("111.111.111-11", 4000.0, 20000.0, 11);
            System.out.println("Parcela calculada: R$ " + String.format("%.2f", p1.calcularParcela()));
            p1.validarAprovacao(700);
        } catch (LimiteCreditoExcedidoException ex) {
            System.out.println("----- LAUDO DE AUDITORIA -----");
            System.out.println("Motivo: " + ex.getMessage());
            System.out.println("Renda mensal: R$ " + String.format("%.2f", ex.getRendaMensal()));
            System.out.println("Parcela pretendida: R$ " + String.format("%.2f", ex.getValorParcelaPretendida()));
            System.out.println("Comprometimento: " + String.format("%.2f", ex.getPercentualComprometimento()) + "%");
            System.out.println("------------------------------");
        }

        System.out.println();
        System.out.println("=== Teste 2: score negativo ===");
        try {
            PropostaFinanciamento p2 = new PropostaFinanciamento("222.222.222-22", 5000.0, 6000.0, 12);
            p2.validarAprovacao(-50);
        } catch (ScoreSerasaInvalidoException ex) {
            System.out.println("Erro de score: " + ex.getMessage());
            System.out.println("Pontuacao informada: " + ex.getPontuacaoInformada());
        } catch (LimiteCreditoExcedidoException ex) {
            System.out.println("Limite excedido: " + ex.getMessage());
        }

        System.out.println();
        System.out.println("=== Teste 3: score baixo ===");
        try {
            PropostaFinanciamento p3 = new PropostaFinanciamento("333.333.333-33", 5000.0, 6000.0, 12);
            p3.validarAprovacao(300);
        } catch (ScoreSerasaInvalidoException ex) {
            System.out.println("Erro de score: " + ex.getMessage());
            System.out.println("Pontuacao informada: " + ex.getPontuacaoInformada());
        } catch (LimiteCreditoExcedidoException ex) {
            System.out.println("Limite excedido: " + ex.getMessage());
        }

        System.out.println();
        System.out.println("=== Teste 4: proposta valida ===");
        try {
            PropostaFinanciamento p4 = new PropostaFinanciamento("444.444.444-44", 5000.0, 6000.0, 12);
            System.out.println("Parcela calculada: R$ " + String.format("%.2f", p4.calcularParcela()));
            p4.validarAprovacao(750);
        } catch (ScoreSerasaInvalidoException ex) {
            System.out.println("Erro de score: " + ex.getMessage());
        } catch (LimiteCreditoExcedidoException ex) {
            System.out.println("Limite excedido: " + ex.getMessage());
        }

        System.out.println();
        System.out.println("Aplicacao finalizada normalmente.");
    }
}
