package orientação_objetos.exercicio02.teste;

import orientação_objetos.exercicio02.dominio.Aluno;
import orientação_objetos.exercicio02.dominio.Local;
import orientação_objetos.exercicio02.dominio.Professor;
import orientação_objetos.exercicio02.dominio.Seminario;

public class Cadastro {
    public static void main(String[] args) {
        Local local = new Local("Florianopolis");
        Aluno aluno = new Aluno("Aline", 28);
        Professor professor = new Professor("Sakura", "Java");
        Aluno[] alunosSeminario = {aluno};

        Seminario seminario = new Seminario("Orientação a Objetos", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
