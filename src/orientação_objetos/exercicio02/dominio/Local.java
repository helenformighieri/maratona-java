package orientação_objetos.exercicio02.dominio;

public class Local {
    private String endereco;

    public Local(String local) {

        this.endereco = local;
    }

    public String getLocal() {
        return endereco;
    }

    public void setLocal(String local) {
        this.endereco = local;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
