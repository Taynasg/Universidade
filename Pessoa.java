public class Pessoa {
    private String nomeDaPessoa;
    private String universidade;


    Pessoa(String nomeDaPessoa, String universidade) {
        this.nomeDaPessoa = nomeDaPessoa;
        this.universidade = universidade;

    }

    Pessoa newton = new  Pessoa("Newton","Cambridge");
    Pessoa einstein = new Pessoa("Einstein","Princeton");


    public String retonaDados() {
        return "Nome: " + nomeDaPessoa + " \n " +
                "Universidade: " + universidade;

    }
}