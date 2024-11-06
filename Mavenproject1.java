/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author CarlosHerediaChimeno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
         int [] array1 = new int [10];
        int [] array2 = new int [10];
        for(int i = 0; i < 10; i++){
           array1[i]=(int)(Math.random()*11+10);
           array2[i]=(int)(Math.random()*11+10);
        }
        
        for (int e : array1)
            System.out.print( e + ", ");
        System.out.println();
        for (int e : array2)
            System.out.print( e + ", ");
        System.out.println();
        
        for(int i = 0; i < 10; i++){
           if(array1[i]==array2[i]){
               System.out.print("Numero: " + array1[i] + ", ");
               System.out.println("Posición: " + i);
           }
        }
    }
}
