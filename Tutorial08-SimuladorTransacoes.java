public class SimuladorTransacoes {

    public static void efetuarDivisaoLucros(int totalLucro, int totalSocios) {
        int resultado = totalLucro / totalSocios;
        System.out.println("Lucro por socio: R$ " + resultado);
    }

    public static void converterChaveAcesso(String chave) {
        int numero = Integer.parseInt(chave);
        System.out.println("Chave convertida: " + numero);
    }

    public static void validarAssinaturaDigital(String assinatura) {
        String maiuscula = assinatura.toUpperCase();
        System.out.println("Assinatura validada: " + maiuscula);
    }
}
