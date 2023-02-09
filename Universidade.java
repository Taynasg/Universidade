public class Universidade {

    Pessoa pessoa = new Pessoa();
    Universidade universidadeDoEinstein = new Universidade("Princeton");
    Universidade universidadeDoNewton = new Universidade("Cambrage");

    private String nomeDaUniversidade;


    Universidade(String nomeDaUniversidade){
        this.nomeDaUniversidade = nomeDaUniversidade;
    }

    public String retornaNome() {
        return "Nome: " + nomeDaUniversidade;

    }

}