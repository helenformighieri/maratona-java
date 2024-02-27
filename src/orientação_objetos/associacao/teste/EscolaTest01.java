package orientação_objetos.associacao.teste;

import orientação_objetos.associacao.dominio.Escola;
import orientação_objetos.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Iruka");

        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("DevDojo", professores);

        escola.imprime();
    }
}
