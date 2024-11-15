/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

public class examen2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir modelos de tren, capacidades y destinos
        String[] modelos = {"Tren A", "Tren B", "Tren C"};
        int[] capacidades = {80, 120, 150};  // Capacidades para cada modelo de tren
        String[] destinos = {"Barcelona - Mataró", "Barcelona - El Prat", "Barcelona - Sabadell"};
        
        // Pedir al usuario cuántos pasajeros desean abordar
        System.out.print("¿Cuántos pasajeros desean abordar el tren de cercanías? ");
        int numPasajeros = Integer.parseInt(scanner.nextLine());
        
        // Mostrar los modelos de tren disponibles y elegir uno
        System.out.println("Modelos de tren disponibles:");
        for (int i = 0; i < modelos.length; i++) {
            System.out.println((i + 1) + ". " + modelos[i] + " | Capacidad: " + capacidades[i] + " | Destino: " + destinos[i]);
        }
        
        // Pedir al usuario que elija un tren
        System.out.print("Elige un tren (1, 2 o 3): ");
        int opcion = Integer.parseInt(scanner.nextLine()) - 1;
        
        // Verificar si la opción es válida
        if (opcion >= 0 && opcion < modelos.length) {
            // Verificar si el número de pasajeros cabe en el tren elegido
            if (verificarCapacidad(capacidades[opcion], numPasajeros)) {
                // Si hay suficiente capacidad, agregar los pasajeros
                int pasajerosActuales = numPasajeros;
                mostrarInformacion(modelos[opcion], pasajerosActuales, capacidades[opcion], destinos[opcion]);
            } else {
                // Si no hay suficiente capacidad
                System.out.println("Lo siento, no hay suficiente capacidad en el " + modelos[opcion] + " para " + numPasajeros + " pasajeros.");
                System.out.println("El " + modelos[opcion] + " solo puede transportar hasta " + capacidades[opcion] + " pasajeros.");
            }
        } else {
            System.out.println("Opción no válida. El programa terminará.");
        }
    }

    // Método para verificar si el número de pasajeros cabe en el tren
    public static boolean verificarCapacidad(int capacidadMaxima, int numPasajeros) {
        return numPasajeros <= capacidadMaxima;
    }

    // Método para mostrar la información final
    public static void mostrarInformacion(String modelo, int pasajerosActuales, int capacidadMaxima, String destino) {
        System.out.println("¡Bienvenidos al " + modelo + "!");
        System.out.println("El tren se dirige a " + destino + ".");
        System.out.println("Actualmente hay " + pasajerosActuales + " pasajeros a bordo.");
        System.out.println("La capacidad máxima del " + modelo + " es " + capacidadMaxima + " pasajeros.");
    }
}

    
    

