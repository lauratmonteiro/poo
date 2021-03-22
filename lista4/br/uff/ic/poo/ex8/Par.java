package lista4.br.uff.ic.poo.ex8;

public class Par <F, S>{
    private F primeiroElemento;
    private S segundoElemento;

    public Par(F primeiroElemento, S segundoElemento){
        this.primeiroElemento = primeiroElemento;
        this.segundoElemento = segundoElemento;
    }

    public F getPrimeiroElemento() {
        return this.primeiroElemento;
    }

    public S getSegundoElemento(){
        return this.segundoElemento;
    }

    public void setPrimeiroElemento(F primeiroElemento){
        this.primeiroElemento = primeiroElemento;
    }

    public void setSegundoElemento(S segundoElemento){
        this.segundoElemento = segundoElemento;
    }
}
