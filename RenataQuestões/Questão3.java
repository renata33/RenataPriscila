/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaquestoes;

/**
 *
 * @author 201816930
 */
import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeNumeros = 20;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        
        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero > maiorValor) {
                maiorValor = numero;
            }
            
            if (numero < menorValor) {
                menorValor = numero;
            }
        }
        
        System.out.println("O maior valor fornecido é: " + maiorValor);
        System.out.println("O menor valor fornecido é: " + menorValor);
        
        scanner.close();
    }
}