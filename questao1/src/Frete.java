import java.util.List;

public abstract class Frete {

    protected String modalidade;
    protected String cliente;
    protected double valorCarga;
    protected double valorFrete;

    public Frete(String modalidade, String cliente, double valorCarga) {
        this.modalidade = modalidade;
        this.cliente = cliente;
        this.valorCarga = valorCarga;
    }

    public abstract double calcularValor();

    public abstract List<String> listagemDocumentos();

    public String gerarResumo() {
        return "Modalidade: " + modalidade + "\n" +
               "Cliente: " + cliente + "\n" +
               "Valor do frete: R$ " + String.format("%.2f", valorFrete) + "\n" +
               "Documentos exigidos: " + listagemDocumentos() + "\n";
    }
}
