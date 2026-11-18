public class PropostaFinanciamento {

    private String cpfCliente;
    private double rendaMensal;
    private double valorEmprestimo;
    private int quantidadeMeses;

    public PropostaFinanciamento(String cpfCliente, double rendaMensal,
            double valorEmprestimo, int quantidadeMeses) {
        if (cpfCliente == null || cpfCliente.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF invalido");
        }
        if (rendaMensal <= 0) {
            throw new IllegalArgumentException("Renda mensal deve ser maior que zero");
        }
        if (valorEmprestimo <= 0) {
            throw new IllegalArgumentException("Valor do emprestimo deve ser maior que zero");
        }
        if (quantidadeMeses <= 0) {
            throw new IllegalArgumentException("Quantidade de meses deve ser maior que zero");
        }
        this.cpfCliente = cpfCliente;
        this.rendaMensal = rendaMensal;
        this.valorEmprestimo = valorEmprestimo;
        this.quantidadeMeses = quantidadeMeses;
    }

    public double calcularParcela() {
        return (valorEmprestimo * 1.10) / quantidadeMeses;
    }

    public void validarAprovacao(int scoreSerasa) throws LimiteCreditoExcedidoException {
        if (scoreSerasa < 0 || scoreSerasa > 1000) {
            throw new ScoreSerasaInvalidoException("Score fora do intervalo permitido (0 a 1000)", scoreSerasa);
        }
        if (scoreSerasa < 400) {
            throw new ScoreSerasaInvalidoException("Proposta recusada: score insuficiente para concessão", scoreSerasa);
        }
        double parcela = calcularParcela();
        if (parcela > rendaMensal * 0.30) {
            double percentual = (parcela / rendaMensal) * 100;
            throw new LimiteCreditoExcedidoException("Parcela excede 30% da renda mensal",
                    rendaMensal, parcela, percentual);
        }
        System.out.println("Proposta aprovada para o CPF " + cpfCliente);
    }

    public String getCpfCliente() {
        return cpfCliente;
    }
}
