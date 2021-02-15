/*
Escreva um programa que recebe como parâmetro um número inteiro n. 
A função deve ler n valores do teclado e retornar quantos destes valores são negativos.
*/

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n, num, count = 0;

        n = input.nextInt();

        for(int i = 0; i<n; i++){
            num = input.nextInt();
            if(num<0) count++;
        }
        
        System.out.println("A quantidade de números negativos é " + count);
    }
}