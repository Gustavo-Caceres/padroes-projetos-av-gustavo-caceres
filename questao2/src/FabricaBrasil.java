public class FabricaBrasil implements FabricaPais {

    @Override
    public ComprovanteFiscal criarComprovante() {
        return new ComprovanteBrasil();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBrasil();
    }

    @Override
    public TermoPrivacidade criarTermo() {
        return new TermoBrasil();
    }
}
