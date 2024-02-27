package orientação_objetos.modificadores_acesso.dominio;

public class Pessoa {
    private String nome; //private significa que os atributos só podem ser acessados pelo objeto
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(Integer idade){
        if (idade < 0){
            System.out.println("idade invalida");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
