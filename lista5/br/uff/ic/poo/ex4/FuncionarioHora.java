package lista5.br.uff.ic.poo.ex4;

public class FuncionarioHora extends Funcionario {
    double salario;
    double horas;

    public FuncionarioHora(String nome, double salario, double horas){
        super(nome);
        this.salario = salario;
        this.horas = horas;
    }


    @Override
    public double folhaPagamento() {
        if(horas<=40){
            return this.salario*horas;
        }
        return (horas-40)*1.5;
    }
}
