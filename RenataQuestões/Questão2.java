/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaquestoes;

/**
 *
 * @author 201816930
 */
    public class Questao2 {
    public static void main(String[] args) {
        int n = 20; // Número de termos desejado
        
        int firstTerm = 1;
        int secondTerm = 1;
        
        System.out.println("Série de Fibonacci até o vigésimo termo:");
        System.out.print(firstTerm + " " + secondTerm);
        
        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
    
    
    

