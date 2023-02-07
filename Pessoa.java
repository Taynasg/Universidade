public class Pessoa {
    private String nomeDaPessoa;
    private String universidade;

    Pessoa(String nomeDaPessoa, String universidade) {
        this.nomeDaPessoa = nomeDaPessoa;
        this.universidade = universidade;

    }

    public String retonaDados() {
        return "Nome: " + nomeDaPessoa + " \n " +
                "Universidade: " + universidade;

    }
}