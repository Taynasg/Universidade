public class Departamento {

    private String nome;

    Departamento (String nomeDoDePartamento){
        this.nome = nomeDoDePartamento;
    }

    public String retornaDepartamento() {
        return "Nome: " + this.nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
