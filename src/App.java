import Classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(49);
        pessoa.setAltura(1.89f);
        System.out.format
        ("Nome: %s, Idade = %d e %f",
        pessoa.getNome(),
        pessoa.getIdade(),
        pessoa.getAltura()
        );

    }
}
