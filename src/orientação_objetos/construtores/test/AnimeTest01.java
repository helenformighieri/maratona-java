package orientação_objetos.construtores.test;


import orientação_objetos.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 23, "ação", "Ghibli");
        anime.imprime();
    }
}
