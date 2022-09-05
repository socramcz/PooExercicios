package PooNivel1;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public static void main(String[] args) {
        Funcionario test = new Funcionario("Carlos", 1500);
        System.out.println(test.getNome());
        System.out.println(test.getSalario());

    }

}
