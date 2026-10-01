import java.util.List;

public class Rodoviario extends Frete {

    public Rodoviario(String cliente, double valorCarga) {
        super("Rodoviario", cliente, valorCarga);
    }

    @Override
    public double calcularValor() {
        valorFrete = valorCarga * 0.02;
        return valorFrete;
    }

    @Override
    public List<String> listagemDocumentos() {
        return List.of("CT-e", "MDF-e");
    }
}
