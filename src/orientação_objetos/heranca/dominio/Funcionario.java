package orientação_objetos.heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
