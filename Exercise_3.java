package com.example.hello;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//================EXERCICIO 1=========================	
//		
//	int senha = sc.nextInt();
//	while (senha != 2002) {
//		System.out.println("Senha Incorreta");
//		senha = sc.nextInt();
//	}
//	System.out.println("Acesso Permitido");
//		
//====================================================	
	
//================EXERCICIO 2=========================	
//
//	int n1, n2;
//	
//	n1 = sc.nextInt();
//	n2 = sc.nextInt();
//	
//	while (n1 != 0 && n2 != 0) {
//		
//		if (n1 > 0 && n2 > 0)
//			System.out.println("primeiro");
//		else if (n1 > 0 && n2 < 0)
//			System.out.println("quarto");
//		else if (n1 < 0 && n2 < 0)
//			System.out.println("terceiro");
//		else
//			System.out.println("segundo");
//		
//		n1 = sc.nextInt();
//		n2 = sc.nextInt();
//	}
//
//====================================================	
		
//================EXERCICIO 3=========================	
//
//	int tipoCombustivel = sc.nextInt();
//	
//	int qtdDiesel = 0;
//	int qtdGasolina = 0;
//	int qtdAlcool = 0;
//	
//	while (tipoCombustivel != 4) {
//		switch (tipoCombustivel) {
//			case 1: {
//				qtdAlcool++;
//				break;
//			}
//			case 2: {
//				qtdGasolina++;
//				break;
//			}
//			case 3: {
//				qtdDiesel++;
//				break;
//			}
//			default: {
//	
//				break;
//			}
//		}
//		tipoCombustivel = sc.nextInt();
//	}
//	
//	System.out.println("MUITO OBRIGADO\n\n");
//	System.out.printf("Alcool: %d\n",qtdAlcool);
//	System.out.printf("Gasolina: %d\n",qtdGasolina);
//	System.out.printf("Diesel: %d\n\n",qtdDiesel);
//				
//====================================================	
		sc.close();
	}
}
