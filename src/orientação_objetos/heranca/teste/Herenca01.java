package orientação_objetos.heranca.teste;

import orientação_objetos.heranca.dominio.Endereco;
import orientação_objetos.heranca.dominio.Funcionario;
import orientação_objetos.heranca.dominio.Pessoa;

public class Herenca01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Rua dos Alfeneiros");
        endereco.setCep(66666666);

        Pessoa pessoa = new Pessoa();
        System.out.println("Pessoa");
        pessoa.setNome("Harry Potter");
        pessoa.setCpf(00000000000);
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        System.out.println("Funcionario");
        funcionario.setNome("Hermione");
        funcionario.setCpf(1111111111);
        funcionario.setEndereco(endereco);
        funcionario.setSalario(300000);

        funcionario.imprime();
    }
}
