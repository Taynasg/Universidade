public class Pessoa {
    private String nomeDaPessoa;
    private Universidade universidade;
    private Departamento departamento;

    Pessoa newton = new Pessoa("Newton", universidade,departamento);
    Pessoa einstein = new Pessoa("Einstein", universidade,departamento);

    Pessoa(){

    }
    Pessoa(String nomeDaPessoa,Universidade universidade,Departamento departamento) {
        this.nomeDaPessoa = nomeDaPessoa;
        this.universidade = universidade;
        this.departamento = departamento;
    }

    public String retonaDados() {
        return "Nome: " + nomeDaPessoa + " \n " +
                "Universidade: " + universidade;
    }

    public void setNomeDaPessoa(String nomeDaPessoa) {
        this.nomeDaPessoa = nomeDaPessoa;
    }
    public String getNomeDaPessoa() {
        return nomeDaPessoa;
    }

    public Universidade getUniversidade() {
        return universidade;
    }
    public Universidade setUniversidade(Universidade universidade) {
        return this.universidade = universidade;
    }
}