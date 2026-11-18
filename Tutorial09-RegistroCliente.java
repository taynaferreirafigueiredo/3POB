public class RegistroCliente {

    private Long id;
    private String nome;
    private int idade;
    private double limiteCredito;

    public RegistroCliente(Long id, String nome, int idade, double limiteCredito) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("id invalido");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("nome vazio");
        }
        if (idade < 18) {
            throw new IllegalArgumentException("idade menor que 18");
        }
        if (limiteCredito < 0) {
            throw new IllegalArgumentException("limite de credito negativo");
        }
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.limiteCredito = limiteCredito;
    }

    public void exibirDados() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Idade: " + idade
                + " | Limite: R$ " + String.format("%.2f", limiteCredito));
    }
}
