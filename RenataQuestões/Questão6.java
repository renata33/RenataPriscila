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

public class Questão6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a velocidade máxima permitida (em km/h): ");
        int velocidadeMaxima = scanner.nextInt();
        
        System.out.print("Digite a velocidade do motorista (em km/h): ");
        int velocidadeMotorista = scanner.nextInt();
        
        int diferencaVelocidade = velocidadeMotorista - velocidadeMaxima;
        
        if (diferencaVelocidade <= 10) {
            System.out.println("Multa: R$ 50");
        } else if (diferencaVelocidade <= 30) {
            System.out.println("Multa: R$ 100");
        } else {
            System.out.println("Multa: R$ 200");
        }
        
        scanner.close();
    }
}
    

