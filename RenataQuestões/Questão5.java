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

public class Questão5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero % 5 == 0) {
            System.out.println(numero + " é múltiplo de 5");
        } else {
            System.out.println(numero + " não é múltiplo de 5");
        }
        
        scanner.close();
    }
}
