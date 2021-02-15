import java.util.Scanner;

/*O setor que terceiriza o restaurante de uma empresa realizou uma pesquisa com os funcionários
pedindo que cada um avaliasse a qualidade das refeições informando uma nota de 0 a 100. 
O setor quer saber o percentual de funcionários que considera as refeições péssimas (nota entre 0 e 25),
ruins (nota acima de 25 e até 50), boas (nota acima de 50 e até 75) e ótimas (acima de 75 até 100). 
Escreva um programa que leia as notas informadas e imprima o percentual de funcionários que votou em 
cada faixa. A entrada de dados deve terminar quando for lido um valor que não pertença a nenhum dos 
intervalos acima.*/

public class Ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float pessimo = 0;
        float ruim = 0;
        float bom = 0;
        float otimo = 0;
        float total;
        
        float nota = input.nextFloat();

        while(0 <= nota && nota <= 100){
            if(nota <= 25) 
                pessimo += 1;
            else if (25 < nota && nota <= 50)
                ruim += 1;
            else if (50 < nota && nota <= 75)
                bom += 1;
            else if (75 < nota && nota <= 100)
                otimo += 1;

            nota = input.nextFloat();
        }
        total = pessimo + ruim + bom + otimo;
        pessimo = pessimo * 100 / total;
        ruim = ruim * 100 / total;
        bom = bom * 100 / total;
        otimo = otimo * 100 / total;

        System.out.printf("Péssimo: %f\n", pessimo);
        System.out.printf("Ruim: %f\n", ruim);
        System.out.printf("Bom: %f\n", bom);
        System.out.printf("Ótimo: %f\n", otimo);
    }
}
