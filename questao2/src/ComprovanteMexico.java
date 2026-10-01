public class ComprovanteMexico implements ComprovanteFiscal {

    @Override
    public String gerarComprovante(Cliente cliente) {
        double iva = cliente.getValorMensal() * 0.16;

        return "CFDI | Plan: " + cliente.getPlano() +
               " | Valor: MXN " + String.format("%.2f", cliente.getValorMensal()) +
               " | IVA (16%): MXN " + String.format("%.2f", iva);
    }
}
