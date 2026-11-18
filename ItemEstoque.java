public class ItemEstoque {

    private String codigo;
    private String nome;
    private int quantidade;
    private double valorUnitario;

    public ItemEstoque(String codigo, String nome, int quantidade, double valorUnitario) {
        // valor unitario nao pode ser <= 0, entao lanca erro
        if (valorUnitario <= 0) {
            throw new IllegalArgumentException("Valor unitario deve ser maior que zero!");
        }

        this.codigo = codigo;
        this.nome = nome;
        this.valorUnitario = valorUnitario;

        // se a quantidade inicial for negativa, comeca com 0
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public boolean adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidade = quantidade + qtd;
            return true;
        }
        return false;
    }

    public boolean removerEstoque(int qtd) {
        // so remove se for positivo e tiver saldo suficiente
        if (qtd > 0 && qtd <= quantidade) {
            quantidade = quantidade - qtd;
            return true;
        }
        return false;
    }

    // getters (nao tem setter de quantidade pra ninguem mexer direto)
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
}
