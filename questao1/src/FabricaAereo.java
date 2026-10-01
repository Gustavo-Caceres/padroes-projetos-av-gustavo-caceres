public class FabricaAereo extends FabricaFrete {

    private String cliente;
    private double valorCarga;

    public FabricaAereo(String cliente, double valorCarga) {
        this.cliente = cliente;
        this.valorCarga = valorCarga;
    }

    @Override
    public Frete criarFrete() {
        return new Aereo(cliente, valorCarga);
    }
}
