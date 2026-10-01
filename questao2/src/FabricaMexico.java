public class FabricaMexico implements FabricaPais {

    @Override
    public ComprovanteFiscal criarComprovante() {
        return new ComprovanteMexico();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoMexico();
    }

    @Override
    public TermoPrivacidade criarTermo() {
        return new TermoMexico();
    }
}
