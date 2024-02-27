package orientação_objetos.modificadores_estaticos.dominio;

import java.util.Objects;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        //um bloco que inicializa sempre que uma instancia for criada
        episodios = new int[100];
        for (int i = 0; i < Objects.requireNonNull(episodios).length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime() {
        for(int episodios: this.episodios){
            System.out.print(episodios + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
