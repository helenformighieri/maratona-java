package orientação_objetos.associacao.teste;

import orientação_objetos.associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano");
        Jogador jogador2 = new Jogador("Ronaldinho");
        Jogador jogador3 = new Jogador("Messi");

        Jogador[] jogadores = new Jogador[] {jogador1, jogador2, jogador3};// só esta guardando a referencia dos objetos

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
