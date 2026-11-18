public class ServicoAuditoriaForense {

    public static void emitirLaudoTecnico(Exception ex) {
        System.out.println("----- LAUDO TECNICO -----");
        System.out.println("Tipo da falha: " + ex.getClass().getName());
        System.out.println("Mensagem: " + ex.getMessage());
        StackTraceElement[] pilha = ex.getStackTrace();
        if (pilha.length > 0) {
            System.out.println("Metodo de origem: " + pilha[0].getMethodName());
            System.out.println("Classe de origem: " + pilha[0].getClassName());
            System.out.println("Linha: " + pilha[0].getLineNumber());
        }
        System.out.println("-------------------------");
    }
}
