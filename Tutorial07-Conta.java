public abstract class Conta {

    protected String numeroConta;
    protected double saldo;

    public Conta(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public abstract boolean sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("Conta: " + numeroConta + " | Saldo: R$ " + saldo);
    }
}
