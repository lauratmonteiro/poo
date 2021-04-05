package lista5.br.uff.ic.poo.ex4;

public class FuncionarioAssalariadoComissionado extends FuncionarioComissionado {
    double salario;

    public FuncionarioAssalariadoComissionado(String nome, double vendas, double porcentagem,
                                              double salario){
        super(nome, vendas, porcentagem);
        this.salario = salario;
    }

    @Override
    public double folhaPagamento() {
        double extra = salario * 0.1;
        return salario + super.folhaPagamento() + extra;
    }

    @Override
    public String toString() {
        return "FuncionarioAssalariadoComissionado{" +
                "Nome: " + nome + '\n' +
                "Salario: " + salario + '\n' +
                "Vendas: " + vendas + '\n' +
                "Porcentagem: " + porcentagem + '\n' +
                "Pagamento: " + this.folhaPagamento();
    }
}
