public class AuditoriaIncidentesApp {

    public static void main(String[] args) {
        System.out.println("=== Teste 1: divisao de lucros ===");
        try {
            SimuladorTransacoes.efetuarDivisaoLucros(1000, 0);
        } catch (ArithmeticException ex) {
            ServicoAuditoriaForense.emitirLaudoTecnico(ex);
        }

        System.out.println();
        System.out.println("=== Teste 2: chave de acesso ===");
        try {
            SimuladorTransacoes.converterChaveAcesso("ABC123");
        } catch (NumberFormatException ex) {
            ServicoAuditoriaForense.emitirLaudoTecnico(ex);
        }

        System.out.println();
        System.out.println("=== Teste 3: assinatura digital ===");
        try {
            SimuladorTransacoes.validarAssinaturaDigital(null);
        } catch (NullPointerException ex) {
            ServicoAuditoriaForense.emitirLaudoTecnico(ex);
        }

        System.out.println();
        System.out.println("=== Teste com dados validos ===");
        try {
            SimuladorTransacoes.efetuarDivisaoLucros(1000, 4);
            SimuladorTransacoes.converterChaveAcesso("12345");
            SimuladorTransacoes.validarAssinaturaDigital("abc");
        } catch (Exception ex) {
            ServicoAuditoriaForense.emitirLaudoTecnico(ex);
        }

        System.out.println();
        System.out.println("Aplicacao finalizada normalmente apos os 3 incidentes.");
    }
}
