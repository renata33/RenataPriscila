/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaquestoes;

/**
 *
 * @author 201816930
 */
public class Questão4 {
    public static void main(String[] args) {
        System.out.println("Polegadas\tCentímetros");
        
        for (int polegadas = 1; polegadas <= 20; polegadas++) {
            double centimetros = polegadas * 2.54;
            System.out.println(polegadas + "\t\t" + centimetros);
        }
    }
}
