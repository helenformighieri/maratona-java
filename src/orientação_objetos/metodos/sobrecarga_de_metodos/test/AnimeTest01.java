package orientação_objetos.metodos.sobrecarga_de_metodos.test;

import orientação_objetos.metodos.sobrecarga_de_metodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 23);
        anime.imprime();
    }
}
