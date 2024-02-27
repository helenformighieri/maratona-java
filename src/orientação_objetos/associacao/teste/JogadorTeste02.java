package orientação_objetos.associacao.teste;

import orientação_objetos.associacao.dominio.Jogador;
import orientação_objetos.associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano");
        Time time = new Time("Portugal");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
