/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String Nombre;
        
        System.out.println("Digite su nombre: ");
        Nombre = Teclado.next();
        System.out.println("Bienvenido " + Nombre);
        String input = JOptionPane.showInputDialog("Mensaje");
    }

}
