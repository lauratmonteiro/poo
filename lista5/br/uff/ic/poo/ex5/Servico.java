package lista5.br.uff.ic.poo.ex5;

public class Servico implements Recebivel{
    String descricao;
    int horas;
    double precoHora;

    public Servico(String descricao, int horas, double precoHora){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }

    @Override
    public double totalizarReceita(){
        return this.horas * this.precoHora;
    }

    @Override
    public String toString() {
        return "Descricao: " + this.descricao + '\n' +
                "Horas: " + this.horas + '\n' +
                "Preco hora: " + this.precoHora + '\n' +
                "Receita: " + this.totalizarReceita();
    }
}
