package orientação_objetos.metodos.exercicio.test;

import orientação_objetos.metodos.exercicio.dominio.Funcionario;

public class ImprimirDados {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "João";
        funcionario.idade = 28;
        funcionario.salarios = new double[]{1500, 3500, 4783.0};

        //System.out.println("Nome: " + funcionario.nome + "\nIdade: " + funcionario.idade + "\nSalario: " + funcionario.salario);

        funcionario.imprimeDados();
        funcionario.imprimeMediaSalarial();
    }
}
