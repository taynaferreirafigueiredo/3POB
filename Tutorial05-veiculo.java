package br.edu.universidade.sistema.frota;

public class Veiculo {

    private static int totalVeiculosCadastrados = 0;
    private static double patrimonioTotalFrota = 0.0;

    public static final double TETO_DESCONTO_PERMITIDO = 0.20;

    private String chassi;
    private String modelo;
    private double valorComercial;

    public Veiculo(String chassi, String modelo, double valorComercial) {
        this.chassi = chassi;
        this.modelo = modelo;
        if (valorComercial < 0) {
            this.valorComercial = 0.0;
        } else {
            this.valorComercial = valorComercial;
        }
        totalVeiculosCadastrados++;
        patrimonioTotalFrota += this.valorComercial;
    }

    public String getChassi() {
        return chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double novoValor) {
        if (novoValor >= 0) {
            double diferenca = novoValor - this.valorComercial;
            this.valorComercial = novoValor;
            patrimonioTotalFrota += diferenca;
        }
    }

    public boolean concederDesconto(double percentual) {
        if (percentual >= 0.0 && percentual <= TETO_DESCONTO_PERMITIDO) {
            double valorDesconto = this.valorComercial * percentual;
            this.valorComercial -= valorDesconto;
            patrimonioTotalFrota -= valorDesconto;
            return true;
        }
        return false;
    }

    public static int getTotalVeiculosCadastrados() {
        return totalVeiculosCadastrados;
    }

    public static double getPatrimonioTotalFrota() {
        return patrimonioTotalFrota;
    }
}
