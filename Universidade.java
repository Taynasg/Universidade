public class Universidade {
    private String nome;
    private Departamento departamento;

    Universidade(String nomeDaUniversidade) {
        this.nome = nomeDaUniversidade;
    }

    public String retornaNome() {
        return "Nome: " + nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}