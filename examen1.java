/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Random;
import java.util.Scanner;

public class examen1 {
    

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el tamaño del array de manera segura
        int size = getArraySize(scanner);
        
        // Crear y llenar el array
        int[] array = createRandomArray(size);
        
        // Mostrar estadísticas del array
        displayStatistics(array);
    }
    
    // Método para obtener el tamaño del array de manera segura
    public static int getArraySize(Scanner scanner) {
        int size = 0;
        while (true) {
            try {
                System.out.print("Introduce el tamaño del array (número entero positivo): ");
                size = Integer.parseInt(scanner.nextLine());  // Leer el tamaño como entero
                
                // Controlar si el tamaño es positivo
                if (size <= 0) {
                    throw new NumberFormatException();  // Lanzar excepción si el número no es positivo
                }
                
                break;  // Si el tamaño es válido, salimos del bucle
            } catch (NumberFormatException e) {
                System.out.println("Tamaño inválido. Por favor, ingresa un número entero positivo.");
            }
        }
        return size;
    }

    // Método para crear el array con números aleatorios entre -10 y 10
    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        // Llenar el array con números aleatorios entre -10 y 10
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(21) - 10;  // Generar números entre -10 y 10
        }
        return array;
    }

    // Método para mostrar las estadísticas del array
    public static void displayStatistics(int[] array) {
        int sum = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        
        // Calcular la suma, cantidad de positivos y negativos
        for (int num : array) {
            sum += num;
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        
        // Calcular la media
        double average = (double) sum / array.length;
        
        // Mostrar los resultados
        System.out.println("\nEstadísticas del array:");
        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Media: " + average);
        System.out.println("Cantidad de números positivos: " + positiveCount);
        System.out.println("Cantidad de números negativos: " + negativeCount);
    }
}
    

