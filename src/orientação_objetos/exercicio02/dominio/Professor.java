package orientação_objetos.exercicio02.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    private Professor professor;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade, Professor professor, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.professor = professor;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) {
            return;
        }
        System.out.println("##Seminario Cadastrados##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0){
                continue;
            }
            System.out.println("**Alunos**");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + " idade: " + aluno.getIdade());
            }
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
