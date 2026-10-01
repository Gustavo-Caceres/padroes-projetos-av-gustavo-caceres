public class ComprovanteBrasil implements ComprovanteFiscal {

    @Override
    public String gerarComprovante(Cliente cliente) {
        double iss = cliente.getValorMensal() * 0.05;

        return "NFS-e | Plano: " + cliente.getPlano() +
               " | Valor: R$ " + String.format("%.2f", cliente.getValorMensal()) +
               " | ISS (5%): R$ " + String.format("%.2f", iss);
    }
}
