public class CadastroApp {

    public static void main(String[] args) {
        String dados = "1,Ana Souza,30,2500.50\n"
                + "2,Bruno Lima,vinte,1800.00\n"
                + "3,Carla Dias,45,-500.00\n"
                + "4,Diego Rocha,28,3200.75\n"
                + "5,,35,1000.00\n"
                + "6,Elisa Prado,50,abc\n"
                + "7,Fabio Neri,22,1500.00";

        ImportadorCadastroService servico = new ImportadorCadastroService();

        System.out.println("=== Importando lote de clientes ===");
        servico.importarLote(dados);

        System.out.println();
        System.out.println("Aplicacao finalizada normalmente.");
    }
}
