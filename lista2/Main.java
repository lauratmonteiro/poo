public class Main{
    public static void main(String[] args) {
        // exercicio 2 //
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Laura");
        pessoa.fazerAniversario();
        pessoa.fazerAniversario();
        System.out.println(pessoa);

        System.out.println("----------------------------------------");

        // exercicio 3 //
        Porta porta = new Porta();

        porta.abrir();

        porta.pintar("Azul");
        porta.pintar("Rosa claro");
        porta.pintar("Amarelo");

        porta.mudarDimensao(500, 1000);

        porta.estaAberta();
        porta.fechar();
        porta.estaAberta();

        System.out.println("----------------------------------------");

        // exercicio 4 //
        Casa casa = new Casa();

        Porta porta1 = new Porta();
        porta1.abrir();
        Porta porta2 = new Porta();
        porta2.abrir();
        Porta porta3 = new Porta();

        casa.addPorta(porta1);
        casa.addPorta(porta2);
        casa.addPorta(porta3);

        casa.quantasPortasEstaoAbertas();

        System.out.println("----------------------------------------");

        // exercicio 5 //

        Televisao tv = new Televisao();
        tv.ligar();
        tv.mudarCanal(16);
        tv.canalAnterior();
        tv.canalAnterior();
        tv.proximoCanal();
        tv.aumentarVolume();
        System.out.println(tv);

        System.out.println("----------------------------------------");

        // exercicio 6 //
    }
}