package br.edu.universidade.concessionaria;

public class ConcessionariaApp {

    public static void main(String[] args) {

        // tres veiculos criados no Heap
        Veiculo v1 = new Veiculo("9BWZZZ377VT004251", "Volkswagen", "Gol", 2020, 45000.00);
        Veiculo v2 = new Veiculo("8AFZZZ554KJ112233", "Fiat", "Argo", 2022, 70000.00);

        // este usa o construtor sobrecarregado (sem ano e sem preco)
        Veiculo v3 = new Veiculo("JTDKB20U577654321", "Toyota", "Corolla");

        System.out.println("=== Fichas iniciais ===");
        v1.exibirFichaTecnica();
        v2.exibirFichaTecnica();
        v3.exibirFichaTecnica();

        System.out.println("\n=== Descontos validos ===");
        v1.aplicarDesconto(0.10);
        v2.aplicarDesconto(0.25);

        System.out.println("\n=== Desconto abusivo (40%) ===");
        v1.aplicarDesconto(0.40);

        System.out.println("\n=== Fichas finais ===");
        v1.exibirFichaTecnica();
        v2.exibirFichaTecnica();
        v3.exibirFichaTecnica();
    }
}
