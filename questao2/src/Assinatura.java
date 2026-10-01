public class Assinatura {

    private FabricaPais fabrica;

    public Assinatura(FabricaPais fabrica) {
        this.fabrica = fabrica;
    }

    public String ativar(Cliente cliente) {
        ComprovanteFiscal comprovante = fabrica.criarComprovante();
        Pagamento pagamento = fabrica.criarPagamento();
        TermoPrivacidade termo = fabrica.criarTermo();

        return "===== ATIVACAO DE ASSINATURA =====\n" +
               "Comprovante fiscal: " + comprovante.gerarComprovante(cliente) + "\n" +
               "Pagamento:          " + pagamento.processarPagamento(cliente) + "\n" +
               "Privacidade:        " + termo.gerarTermo(cliente) + "\n";
    }
}
