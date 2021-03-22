package lista4.br.uff.ic.poo.ex5;

public class Pessoa {
    private String endereco;
    private String chave;

    public Pessoa(String endereco, String chave) {
        this.endereco = endereco;
        this.chave = chave;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getChave(){
        return this.chave;
    }


}
