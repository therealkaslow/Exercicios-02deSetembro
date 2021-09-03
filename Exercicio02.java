package br.com.beneration.exerciciosfor;

import java.util.Scanner;

public class Exercicio02 {
public static void main(String[]args) {
Scanner leia = new Scanner(System.in);
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
			int numero;
			int par1=0;
			int imp1=0;
			int valor=0;
		for(numero=0;numero <10;numero++) 
		{
			System.out.println("Digite um Numero: ");
			valor = leia.nextInt();
			if (valor % 2 == 0){
			par1++;
			}
			else{
			imp1++;	
			} 
			}
		System.out.println("Os Pares São: \n"+par1);
		System.out.println("Os Valores Impares São: \n"+imp1);
}
}
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
