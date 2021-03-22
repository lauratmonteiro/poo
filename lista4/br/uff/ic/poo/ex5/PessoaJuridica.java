package lista4.br.uff.ic.poo.ex5;

public class PessoaJuridica extends Pessoa {
    private String razao;
    private String cnpj;
    private double faturamento;

    public PessoaJuridica(String razao, String cnpj, String endereco, double faturamento){
        super(endereco, cnpj);
        this.razao = razao;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    @Override
    public String toString() {
        return "Razao Social: " + razao + '\n' +
                "CNPJ: " + cnpj + '\n' +
                "Faturamento: " + faturamento + '\n';
    }
}
