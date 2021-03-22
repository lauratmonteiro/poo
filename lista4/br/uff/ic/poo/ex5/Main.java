package lista4.br.uff.ic.poo.ex5;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Pessoa p1  = new PessoaFisica("Laura Monteiro", "123456789-00",
                "Rua Mexico, 123", "21/02/2000");
        Pessoa p2 = new PessoaFisica("Rodrigo Fabricante", "987654321-00",
                "Rua Equador", "15/12/1994");
        Pessoa p3 = new PessoaJuridica("Grer AutoPecas", "12345678",
                "Rua Nilo Pecanha, 456", 12350);

        agenda.addContato(p1);
        agenda.addContato(p2);
        agenda.addContato(p3);

        agenda.imprimirContato("123456789-00");
        System.out.println("-----------------------------------------");
        agenda.listarContatos();
    }
}
