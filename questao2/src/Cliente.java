public class Cliente {

    private String nome;
    private String plano;
    private double valorMensal;

    public Cliente(String nome, String plano, double valorMensal) {
        this.nome = nome;
        this.plano = plano;
        this.valorMensal = valorMensal;
    }

    public String getNome() { return nome; }
    public String getPlano() { return plano; }
    public double getValorMensal() { return valorMensal; }
}
