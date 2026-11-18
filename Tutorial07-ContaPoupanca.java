public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
