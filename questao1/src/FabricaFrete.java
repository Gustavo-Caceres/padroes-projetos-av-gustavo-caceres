public abstract class FabricaFrete {

    public abstract Frete criarFrete();

    public final String contratar() {
        Frete frete = criarFrete();
        frete.calcularValor();
        return frete.gerarResumo();
    }
}
