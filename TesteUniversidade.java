public class TesteUniversidade {
    public static void main(String[] args) {


        Universidade universidadeDoNewton = new Universidade("Cambrige");
        Departamento departamentoDoNewton = new Departamento("Educação");
        Pessoa newton = new Pessoa("Newton",universidadeDoNewton,departamentoDoNewton);

        System.out.println(newton.getNome());
        System.out.println(newton.getUniversidade().getNome());
        System.out.println(newton.getDepartamento().getNome());
        System.out.println(newton.retonaDados());

        System.out.println();

        Universidade universidadeDoEinstein = new Universidade("Princeton");
        Departamento departamentoDoEinstein = new Departamento("Educação");
        Pessoa einstein = new Pessoa("Einstein",universidadeDoEinstein,departamentoDoEinstein);

        System.out.println(einstein.getNome());
        System.out.println(einstein.getUniversidade().getNome());
        System.out.println(einstein.getDepartamento().getNome());

        System.out.println();

        Universidade universidadeDoDalton = new Universidade("Harvard");
        Departamento departamentoDoDalton = new Departamento("Educação");
        Pessoa dalton = new Pessoa("Dalton",universidadeDoDalton,departamentoDoDalton);

        System.out.println(dalton.getNome());
        System.out.println(dalton.getUniversidade().getNome());
        System.out.println(dalton.getDepartamento().getNome());
    }
}