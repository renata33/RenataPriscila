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

public class Questão7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite outro número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Escolha a opção:");
        System.out.println("1 - Soma de 2 números");
        System.out.println("2 - Diferença entre 2 números (maior pelo menor)");
        System.out.println("3 - Produto entre 2 números");
        System.out.println("4 - Divisão entre 2 números");
        
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                double soma = numero1 + numero2;
                System.out.println("Resultado da soma: " + soma);
                break;
            case 2:
                double diferenca = Math.abs(numero1 - numero2);
                System.out.println("Resultado da diferença: " + diferenca);
                break;
            case 3:
                double produto = numero1 * numero2;
                System.out.println("Resultado do produto: " + produto);
                break;
            case 4:
                if (numero2 != 0) {
                    double divisao = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + divisao);
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }
}
