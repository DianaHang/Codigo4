package com.generation;

import java.util.Scanner; //Se importa el Scanner

public class Codigo4 {

	public static void main (String[] args) { //Se agrega el public static void main 
	 Scanner s  =  new Scanner(System.in);  //Se agrega el input

	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Se corrige el turno del jugador 2
	    String j2 = s.nextLine();
	    
	    if (j1 == (j2)) {   //Se agrega paréntesis
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }

	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;
	          }
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	
	}
}
