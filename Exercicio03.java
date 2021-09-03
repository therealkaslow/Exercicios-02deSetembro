package br.com.beneration.exerciciosfor;

import java.util.Scanner;

public class Exercicio03 {
public static void main(String[]args) {//funcao "inicio"
Scanner leia = new Scanner(System.in);

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
//pédir a idade de várias pessoas, total de pessoas com menos de 21 anos
//e total de 50 anos, e o programa termina com a idade até 99 anos.
int idade,contador21=0,contador50=0;
System.out.println("\n DIGITE A IDADE: ");
idade = leia.nextInt();
while(idade!=-99)
   {
       if(idade<21) contador21++;
       if(idade>50) contador50++;
       System.out.println("\n Digite a idade da pessoa (para Sair digite -99) : ");
       idade = leia.nextInt();
   }
System.out.printf("\n O Total com menos de 21 anos E:%d",contador21);
System.out.printf("\n O Total com mais de 50 anos E:%d",contador50);
System.out.println("\n\n");
leia.close();
}
}

