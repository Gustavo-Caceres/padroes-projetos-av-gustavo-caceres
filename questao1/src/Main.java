public class Main {
    public static void main(String[] args) {

        FabricaFrete rodoviario = new FabricaRodoviario("Joao Silva", 50000.00);
        FabricaFrete aereo      = new FabricaAereo("Maria Souza", 20000.00);
        FabricaFrete maritimo   = new FabricaMaritimo("Carlos Lima", 150000.00);

        System.out.println(rodoviario.contratar());
        System.out.println(aereo.contratar());
        System.out.println(maritimo.contratar());
    }
}
