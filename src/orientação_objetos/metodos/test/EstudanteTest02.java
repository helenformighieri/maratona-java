package orientação_objetos.metodos.test;
import orientação_objetos.metodos.dominio.Estudante;


public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midorya";
        estudante01.idade = 17;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';
    }
}
