package lista5.br.uff.ic.poo.ex4;

public class FuncionarioComissionado extends Funcionario {
    double vendas;
    double porcentagem;

    public FuncionarioComissionado(String nome, double vendas, double porcentagem){
        super(nome);
        this.vendas = vendas;
        this.porcentagem = porcentagem;
    }

    @Override
    public double folhaPagamento() {
        return this.vendas * this.porcentagem;
    }

    @Override
    public String toString() {
        return "Funcionario Comissionado" +
                "Nome: " + nome + '\n' +
                "Vendas: " + vendas + '\n' +
                "Porcentagem: " + porcentagem +
                "Pagamento: " + this.folhaPagamento();
    }
}
