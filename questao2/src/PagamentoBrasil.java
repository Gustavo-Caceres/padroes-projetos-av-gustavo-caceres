public class PagamentoBrasil implements Pagamento {

    @Override
    public String processarPagamento(Cliente cliente) {
        return "Pix | Valor: R$ " + String.format("%.2f", cliente.getValorMensal()) +
               " | Compensacao imediata";
    }
}
