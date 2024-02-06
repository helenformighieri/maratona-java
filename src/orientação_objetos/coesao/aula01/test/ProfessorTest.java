package orientação_objetos.coesao.aula01.test;

import orientação_objetos.coesao.aula01.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Sammya";
        professor.idade = 35;
        professor.sexo = 'F';

        System.out.println(professor.nome + ", " + professor.idade +", "+ professor.sexo);
    }
}
