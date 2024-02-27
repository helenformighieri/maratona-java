package orientação_objetos.modificadores_acesso.test;

import orientação_objetos.modificadores_acesso.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Ranger";
        //pessoa.idade = 70;
        pessoa.setNome("Ranger");
        pessoa.setIdade(70);
        pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
