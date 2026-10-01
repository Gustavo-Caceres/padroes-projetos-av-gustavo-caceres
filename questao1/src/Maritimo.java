import java.util.List;

public class Maritimo extends Frete {

    public Maritimo(String cliente, double valorCarga) {
        super("Maritimo", cliente, valorCarga);
    }

    @Override
    public double calcularValor() {
        valorFrete = valorCarga * 0.01;
        return valorFrete;
    }

    @Override
    public List<String> listagemDocumentos() {
        return List.of("BL (Bill of Lading)", "Fatura comercial");
    }
}
