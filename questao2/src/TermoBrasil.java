public class TermoBrasil implements TermoPrivacidade {

    @Override
    public String gerarTermo(Cliente cliente) {
        return "Termo de privacidade conforme a LGPD (Lei 13.709/2018)" +
               " | Aceito por: " + cliente.getNome();
    }
}
