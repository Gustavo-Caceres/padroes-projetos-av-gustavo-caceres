public class PagamentoMexico implements Pagamento {

    @Override
    public String processarPagamento(Cliente cliente) {
        return "SPEI | Valor: MXN " + String.format("%.2f", cliente.getValorMensal()) +
               " | Transferencia interbancaria";
    }
}
