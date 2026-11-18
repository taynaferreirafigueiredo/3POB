public class ScoreSerasaInvalidoException extends RuntimeException {

    private int pontuacaoInformada;

    public ScoreSerasaInvalidoException(String mensagem, int pontuacaoInformada) {
        super(mensagem);
        this.pontuacaoInformada = pontuacaoInformada;
    }

    public ScoreSerasaInvalidoException(String mensagem, int pontuacaoInformada, Throwable causa) {
        super(mensagem, causa);
        this.pontuacaoInformada = pontuacaoInformada;
    }

    public int getPontuacaoInformada() {
        return pontuacaoInformada;
    }
}
