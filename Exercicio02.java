package br.com.beneration.exerciciosfor;

import java.util.Scanner;

public class Exercicio02 {
public static void main(String[]args) {
Scanner leia = new Scanner(System.in);
/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
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
		System.out.println("Os Pares S�o: \n"+par1);
		System.out.println("Os Valores Impares S�o: \n"+imp1);
}
}
/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
