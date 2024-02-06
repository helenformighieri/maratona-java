package orientação_objetos.metodos.exercicio.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salarios);

        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
    }

    public void imprimeMediaSalarial() {
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial " + media);
    }
}

