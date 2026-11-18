package br.edu.universidade.sistema.frota;

public class FrotaApp {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("CHASSI001", "Gol", 50000.0);
        Veiculo v2 = new Veiculo("CHASSI002", "Civic", 120000.0);
        Veiculo v3 = new Veiculo("CHASSI003", "Hilux", 250000.0);

        System.out.println("=== Auditoria inicial ===");
        System.out.println("Total de veiculos: " + Veiculo.getTotalVeiculosCadastrados());
        System.out.println("Patrimonio total: R$ " + Veiculo.getPatrimonioTotalFrota());

        System.out.println();
        System.out.println("=== Desconto valido de 10% no " + v1.getModelo() + " ===");
        boolean ok1 = v1.concederDesconto(0.10);
        System.out.println("Aprovado: " + ok1);
        System.out.println("Novo valor: R$ " + v1.getValorComercial());
        System.out.println("Patrimonio total: R$ " + Veiculo.getPatrimonioTotalFrota());

        System.out.println();
        System.out.println("=== Desconto valido de 20% no " + v2.getModelo() + " ===");
        boolean ok2 = v2.concederDesconto(0.20);
        System.out.println("Aprovado: " + ok2);
        System.out.println("Novo valor: R$ " + v2.getValorComercial());
        System.out.println("Patrimonio total: R$ " + Veiculo.getPatrimonioTotalFrota());

        System.out.println();
        System.out.println("=== Desconto abusivo de 30% no " + v3.getModelo() + " ===");
        boolean ok3 = v3.concederDesconto(0.30);
        System.out.println("Aprovado: " + ok3);
        System.out.println("Valor continua: R$ " + v3.getValorComercial());
        System.out.println("Patrimonio total: R$ " + Veiculo.getPatrimonioTotalFrota());

        System.out.println();
        System.out.println("=== Teste do setValorComercial ===");
        v3.setValorComercial(-5000.0);
        System.out.println("Valor apos tentar -5000: R$ " + v3.getValorComercial());
        v3.setValorComercial(240000.0);
        System.out.println("Valor apos setar 240000: R$ " + v3.getValorComercial());

        System.out.println();
        System.out.println("=== Auditoria final ===");
        System.out.println("Total de veiculos: " + Veiculo.getTotalVeiculosCadastrados());
        System.out.println("Patrimonio total: R$ " + Veiculo.getPatrimonioTotalFrota());
    }
}
