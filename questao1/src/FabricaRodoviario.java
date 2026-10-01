public class FabricaRodoviario extends FabricaFrete {

    private String cliente;
    private double valorCarga;

    public FabricaRodoviario(String cliente, double valorCarga) {
        this.cliente = cliente;
        this.valorCarga = valorCarga;
    }

    @Override
    public Frete criarFrete() {
        return new Rodoviario(cliente, valorCarga);
    }
}
