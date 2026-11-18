public class Produto implements Comparable<Produto> {

    private String codigo;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto(String codigo, String descricao, double preco, int quantidade) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preco nao pode ser negativo");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade nao pode ser negativa");
        }
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Produto outro = (Produto) obj;
        return codigo != null && codigo.equals(outro.codigo);
    }

    @Override
    public int hashCode() {
        return codigo == null ? 0 : codigo.hashCode();
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", descricao=" + descricao
                + ", preco=" + String.format("%.2f", preco)
                + ", quantidade=" + quantidade + "]";
    }
}
