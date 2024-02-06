package orientação_objetos.introducao_classes.aula01.test;

import orientação_objetos.introducao_classes.aula01.dominio.Estudante;

public class PessoaTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Sesshoumaru";
        estudante.idade = 23;
        estudante.sexo = 'M';
        System.out.println(estudante.nome + ", " + estudante.idade +", "+ estudante.sexo);
    }
}
