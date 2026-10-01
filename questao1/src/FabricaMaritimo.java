public class FabricaMaritimo extends FabricaFrete {

    private String cliente;
    private double valorCarga;

    public FabricaMaritimo(String cliente, double valorCarga) {
        this.cliente = cliente;
        this.valorCarga = valorCarga;
    }

    @Override
    public Frete criarFrete() {
        return new Maritimo(cliente, valorCarga);
    }
}
