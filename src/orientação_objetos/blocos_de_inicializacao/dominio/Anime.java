package orientação_objetos.blocos_de_inicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        //um bloco que inicializa sempre que uma instancia for criada
        for (int i = 0; i < episodios.length; i++) {
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
