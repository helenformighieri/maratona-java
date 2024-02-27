package orientação_objetos.blocos_de_inicializacao.test;

import orientação_objetos.blocos_de_inicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");

        }

    }
}
