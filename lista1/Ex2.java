/*
Escreva um programa que efetue a leitura de três valores reais R, S e T, 
imprimindo qual deles é o maior
*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int R, S, T;

        R = input.nextInt();
        S = input.nextInt();
        T = input.nextInt();

        int max = R;

        if(S > max) max = S;
        if(T > max) max = T;

        System.out.println(max);


    }   
}
