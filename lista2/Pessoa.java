public class Pessoa{
    private String nome;
    int idade = 21;
    
    public int fazerAniversario(){
        return idade += 1;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                "Idade: " + idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}