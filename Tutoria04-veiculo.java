package br.edu.universidade.concessionaria;

import java.time.Year;

public class Veiculo {

    private String chassi;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double precoBase;

    public Veiculo(String chassi, String marca, String modelo, int anoFabricacao, double precoBase) {
        // ano tem que ser maior que 1886, senao lanca erro
        if (anoFabricacao <= 1886) {
            throw new IllegalArgumentException("Ano de fabricacao deve ser maior que 1886!");
        }

        this.chassi = chassi;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;

        // preco negativo vira 0.0
        if (precoBase < 0) {
            this.precoBase = 0.0;
        } else {
            this.precoBase = precoBase;
        }
    }

    // construtor sobrecarregado: usa o ano atual e preco 0
    public Veiculo(String chassi, String marca, String modelo) {
        this(chassi, marca, modelo, Year.now().getValue(), 0.0);
    }

    public void aplicarDesconto(double percentual) {
        // so aceita de 0 (exclusivo) ate 0.25 (inclusivo)
        if (percentual > 0.0 && percentual <= 0.25) {
            precoBase = precoBase - (precoBase * percentual);
            System.out.printf("Desconto de %.0f%% aplicado em %s.%n", percentual * 100, modelo);
        } else {
            System.out.printf("Desconto de %.0f%% recusado em %s (maximo permitido: 25%%).%n", percentual * 100, modelo);
        }
    }

    public void exibirFichaTecnica() {
        System.out.println("----- Ficha Tecnica -----");
        System.out.println("Chassi: " + chassi);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricacao: " + anoFabricacao);
        System.out.printf("Preco base: R$ %.2f%n", precoBase);
        System.out.println("-------------------------");
    }
}
