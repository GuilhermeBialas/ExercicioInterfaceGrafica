/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01Lista09Packge;

import java.awt.EventQueue;

/**
 *
 * @author Guilherme Bialas
 */
public class ExercicioLista09Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExercicioLista09MenuPrincipal();
            }
        });
    }
    
}
