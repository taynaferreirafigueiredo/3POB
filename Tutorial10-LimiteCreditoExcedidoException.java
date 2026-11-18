public class LimiteCreditoExcedidoException extends Exception {

    private double rendaMensal;
    private double valorParcelaPretendida;
    private double percentualComprometimento;

    public LimiteCreditoExcedidoException(String mensagem, double rendaMensal,
            double valorParcelaPretendida, double percentualComprometimento) {
        super(mensagem);
        this.rendaMensal = rendaMensal;
        this.valorParcelaPretendida = valorParcelaPretendida;
        this.percentualComprometimento = percentualComprometimento;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public double getValorParcelaPretendida() {
        return valorParcelaPretendida;
    }

    public double getPercentualComprometimento() {
        return percentualComprometimento;
    }
}
