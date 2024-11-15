/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author CarlosHerediaChimeno
 */
public class examen {
    
        public static void main(String[] args) {
            
            // PRIMERA COMPRA
		double precioProducto1 = 39.95;
		double precioProducto2 = 19.95;
		double total = precioTotal(precioProducto1, precioProducto2);
		System.out.println("el total de la compra con portes es de " + calcularPortes(total));
		
		
		// SEGUNDA COMPRA
		precioProducto1 = 34.95;
		precioProducto2 = 17.95;		
		total = precioTotal(precioProducto1, precioProducto2);
		System.out.println("el total de la compra con portes es de " + calcularPortes(total));
		
	}
	
						
	public static double precioTotal (double producto1, double producto2) {
		double total = producto1 + producto2;
		return total;
	}
	
	
	
	public static double calcularPortes(double total) {
		double portes = total + 5;
		return portes;
	}
        }
        
    

