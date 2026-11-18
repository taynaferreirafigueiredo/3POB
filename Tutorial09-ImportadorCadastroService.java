import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class ImportadorCadastroService {

    public void importarLote(String dadosBrutos) {
        int linhasLidas = 0;
        int sucessos = 0;

        try (BufferedReader leitor = new BufferedReader(new StringReader(dadosBrutos))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                linhasLidas++;
                try {
                    String[] campos = linha.split(",");
                    if (campos.length != 4) {
                        throw new IllegalArgumentException("quantidade de campos invalida");
                    }
                    Long id = Long.parseLong(campos[0].trim());
                    String nome = campos[1].trim();
                    int idade = Integer.parseInt(campos[2].trim());
                    double limite = Double.parseDouble(campos[3].trim());

                    RegistroCliente cliente = new RegistroCliente(id, nome, idade, limite);
                    cliente.exibirDados();
                    sucessos++;
                } catch (NumberFormatException | IllegalArgumentException ex) {
                    System.out.println("Linha " + linhasLidas + " descartada: " + ex.getMessage());
                }
            }
        } catch (IOException ex) {
            System.out.println("Erro de leitura: " + ex.getMessage());
        } finally {
            System.out.println();
            System.out.println("===== RELATORIO FINAL =====");
            System.out.println("Linhas lidas: " + linhasLidas);
            System.out.println("Cadastros processados com sucesso: " + sucessos);
        }
    }
}
