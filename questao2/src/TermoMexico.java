public class TermoMexico implements TermoPrivacidade {

    @Override
    public String gerarTermo(Cliente cliente) {
        return "Aviso de privacidad conforme a LFPDPPP" +
               " | Aceptado por: " + cliente.getNome();
    }
}
