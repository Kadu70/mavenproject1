/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALUNO
 */

 
public class Mavenproject1 {

    public static void main(String[] args) {
        int x =0;
        System.out.println("Hello World!");
        try {
          System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Mavenproject1.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println("valor "+x);
    }
}
