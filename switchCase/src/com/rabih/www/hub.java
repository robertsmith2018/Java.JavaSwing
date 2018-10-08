package com.rabih.www;

import java.util.Scanner;

public class hub {

	public static void main(String[] args) {
		int codeEntre=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrez Un nombre entre 1 et 3 "); 
		codeEntre = sc.nextInt();
		
		switch(codeEntre){
		
		case 1:
		System.out.println("Meilleur choix");
		break;
		
		case 2:
		System.out.println("Meilleur choix");
		break;
		
		case 3:
		System.out.println("Code valide");	
		break;
		
		default:
			System.out.println("Code erroné");
		}

	}

}
