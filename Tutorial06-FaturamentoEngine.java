public class FaturamentoEngine {

    public static final double TARIFA_USUARIO_EXCEDENTE = 15.00;

    public double calcularMensalidade(NivelAssinatura nivel) {
        return nivel.getMensalidadeBase();
    }

    public double calcularMensalidade(NivelAssinatura nivel, int totalUsuariosAtivos) {
        double total = nivel.getMensalidadeBase();
        int excedentes = totalUsuariosAtivos - nivel.getLimiteUsuariosInclusos();
        if (excedentes > 0) {
            total += excedentes * TARIFA_USUARIO_EXCEDENTE;
        }
        return total;
    }

    public double calcularMensalidade(NivelAssinatura nivel, int... departamentos) {
        int soma = 0;
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i] > 0) {
                soma += departamentos[i];
            }
        }
        return calcularMensalidade(nivel, soma);
    }
}
