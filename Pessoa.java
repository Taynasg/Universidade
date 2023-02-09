public class Pessoa {
    private String nomeDaPessoa;
    private Universidade universidade;

    Pessoa newton = new Pessoa("Newton", universidade);
    Pessoa einstein = new Pessoa("Einstein", universidade);

    Pessoa(){

    }
    Pessoa(String nomeDaPessoa,Universidade universidade) {
        this.nomeDaPessoa = nomeDaPessoa;
        this.universidade = universidade;
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