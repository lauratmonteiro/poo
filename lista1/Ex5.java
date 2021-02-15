/* Escreva um programa recebe um valor N inteiro e que, se N for positivo, 
retorna o fatorial de N (N!). Se não for possível calcular o fatorial,
a função deve imprimir uma mensagem e retornar o valor -1. */

import java.util.Scanner;

public class Ex5 {

    public static int retornaFatorial(int n, int fatorial){
        if(n<0){
            System.out.println("Não foi possível calcular pois o número é negativo.");
            return -1;
        }
        for(int i = 1; i<n+1; i++){
            fatorial *= i;
        }
        return fatorial;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, fat = 1;
        n = input.nextInt();
        retornaFatorial(n, fat);
    }
}
