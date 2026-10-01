public class Main {
    public static void main(String[] args) {

        Cliente clienteBrasil = new Cliente("Joao Silva", "Premium", 299.90);
        Cliente clienteMexico = new Cliente("Maria Gonzalez", "Premium", 1500.00);

        Assinatura assinaturaBrasil = new Assinatura(new FabricaBrasil());
        Assinatura assinaturaMexico = new Assinatura(new FabricaMexico());

        System.out.println(assinaturaBrasil.ativar(clienteBrasil));
        System.out.println(assinaturaMexico.ativar(clienteMexico));
    }
}
