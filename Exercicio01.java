package br.com.beneration.exerciciosfor;
public class Exercicio01 {
public static void main(String[]args) {	
/*1-Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/
	int resto = 0;
	for(int numeros = 1000; numeros < 2000;) {
		numeros++;
		resto = numeros %11;
		if(numeros%11==5){
		System.out.println("resto é"+numeros);	
		}
		else {
			numeros++;
		}
			}
		}

	}

