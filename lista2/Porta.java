public class Porta{
    boolean estaAberta;
    String cor;
    int altura;
    int largura;

    public void mudarDimensao(int altura, int largura){
        System.out.println("A porta tem " + largura + " por " + altura);
    }

    public void pintar(String cor){
        System.out.println("A porta foi pintada de " + cor);
    }

    public void abrir(){
        this.estaAberta = true;
    }

    public void fechar(){
        this.estaAberta = false;
    }

    public void estaAberta(){
        if(this.estaAberta){
            System.out.println("A porta esta aberta.");
        }
        System.out.println("A porta esta fechada.");

    }

    public boolean getEstaAberta(){
        return this.estaAberta;
    }
}