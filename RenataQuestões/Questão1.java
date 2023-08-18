/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaquestoes;

/**
 *
 * @author 201816930
 */
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número N: ");
        int N = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= N; ++i) {
            sum += i;
        }
        
        System.out.println("A soma dos números de 1 a " + N + " é: " + sum);
        
        scanner.close();
    }
}