package lista4.br.uff.ic.poo.ex5;

public class PessoaFisica extends Pessoa{
    private String nome;
    private String cpf;
    private String aniversario;

    public PessoaFisica(String nome, String cpf, String endereco, String aniversario){
        super(endereco, cpf);
        this.nome = nome;
        this.cpf = cpf;
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                "CPF: " + cpf + '\n' +
                "Aniversario: " + aniversario + '\n';
    }
}
