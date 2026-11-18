public class ContaCorrente extends Conta implements Tributavel {

    private static final double TAXA_SAQUE = 1.50;

    public ContaCorrente(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor + TAXA_SAQUE) {
            saldo -= valor + TAXA_SAQUE;
            return true;
        }
        return false;
    }

    @Override
    public double calcularTributo() {
        return saldo * 0.01;
    }
}
