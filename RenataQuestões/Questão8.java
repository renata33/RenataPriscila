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

public class Questão8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();
        
        if (temperatura <= 18) {
            System.out.println("O clima é frio.");
        } else if (temperatura <= 23) {
            System.out.println("O clima é agradável.");
        } else if (temperatura <= 35) {
            System.out.println("O clima é quente.");
        } else {
            System.out.println("O clima é muito.");
        }
        
        scanner.close();
    }
}
