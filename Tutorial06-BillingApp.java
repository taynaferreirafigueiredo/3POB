public class BillingApp {

    public static void main(String[] args) {
        FaturamentoEngine engine = new FaturamentoEngine();

        System.out.println("=== Sobrecarga 1: so o plano ===");
        System.out.println("BRONZE: R$ " + engine.calcularMensalidade(NivelAssinatura.BRONZE));
        System.out.println("PRATA: R$ " + engine.calcularMensalidade(NivelAssinatura.PRATA));
        System.out.println("OURO: R$ " + engine.calcularMensalidade(NivelAssinatura.OURO));

        System.out.println();
        System.out.println("=== Sobrecarga 2: plano + total de usuarios ===");
        System.out.println("BRONZE com 2 usuarios (sem excedente): R$ " + engine.calcularMensalidade(NivelAssinatura.BRONZE, 2));
        System.out.println("BRONZE com 3 usuarios (no limite): R$ " + engine.calcularMensalidade(NivelAssinatura.BRONZE, 3));
        System.out.println("BRONZE com 8 usuarios (5 excedentes): R$ " + engine.calcularMensalidade(NivelAssinatura.BRONZE, 8));
        System.out.println("PRATA com 14 usuarios (4 excedentes): R$ " + engine.calcularMensalidade(NivelAssinatura.PRATA, 14));
        System.out.println("OURO com 30 usuarios (5 excedentes): R$ " + engine.calcularMensalidade(NivelAssinatura.OURO, 30));

        System.out.println();
        System.out.println("=== Sobrecarga 3: varargs com departamentos ===");
        System.out.println("PRATA com departamentos 4, 3, 2 (9 usuarios, sem excedente): R$ " + engine.calcularMensalidade(NivelAssinatura.PRATA, 4, 3, 2));
        System.out.println("PRATA com departamentos 5, 5, 4 (14 usuarios, 4 excedentes): R$ " + engine.calcularMensalidade(NivelAssinatura.PRATA, 5, 5, 4));
        System.out.println("OURO com departamentos 10, 10, 10 (30 usuarios): R$ " + engine.calcularMensalidade(NivelAssinatura.OURO, 10, 10, 10));
        System.out.println("BRONZE com departamentos 1, 1 (2 usuarios): R$ " + engine.calcularMensalidade(NivelAssinatura.BRONZE, 1, 1));

        System.out.println();
        System.out.println("=== Casos de borda ===");
        int[] vazio = new int[0];
        System.out.println("PRATA com array de departamentos vazio: R$ " + engine.calcularMensalidade(NivelAssinatura.PRATA, vazio));
        System.out.println("BRONZE com departamentos 0, 0, 0: R$ " + engine.calcularMensalidade(NivelAssinatura.BRONZE, 0, 0, 0));
        System.out.println("BRONZE com departamentos 2, 0, 5: R$ " + engine.calcularMensalidade(NivelAssinatura.BRONZE, 2, 0, 5));
        System.out.println("OURO com 0 usuarios: R$ " + engine.calcularMensalidade(NivelAssinatura.OURO, 0));
    }
}
