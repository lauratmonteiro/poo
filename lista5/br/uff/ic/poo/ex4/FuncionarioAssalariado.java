package lista5.br.uff.ic.poo.ex4;

public class FuncionarioAssalariado extends Funcionario {
    double salario;

    public FuncionarioAssalariado(String nome, double salario){
        super(nome);
        this.salario = salario;
    }
    @Override
    public double folhaPagamento() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "Funcionario Assalariado" + '\n' +
                "Nome: " + nome + '\n' +
                "Salario: " + salario;
    }
}
