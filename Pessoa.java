public class Pessoa {
    private String nome;
    private Universidade universidade;
    private Departamento departamento;

    Pessoa(String nome, Universidade universidade, Departamento departamento) {
        this.nome = nome;
        this.universidade = universidade;
        this.departamento = departamento;
    }

    Pessoa() {

    }

    public String retonaDados() {
        return "  Nome: " + nome + " \n " +
                " Universidade: " + universidade.getNome() + " \n  " +
                " Departamento: " + departamento.getNome();

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public Universidade setUniversidade(Universidade universidade) {
        return this.universidade = universidade;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
