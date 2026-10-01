import java.util.List;

public class Aereo extends Frete {

    public Aereo(String cliente, double valorCarga) {
        super("Aereo", cliente, valorCarga);
    }

    @Override
    public double calcularValor() {
        valorFrete = valorCarga * 0.06;
        return valorFrete;
    }

    @Override
    public List<String> listagemDocumentos() {
        return List.of("AWB (Air Waybill)");
    }
}
