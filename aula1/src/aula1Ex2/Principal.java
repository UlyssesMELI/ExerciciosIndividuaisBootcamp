package aula1Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Principal {
	

	static void ex1() {
		// TODO Auto-generated method stub
		
		Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12 ,127};
		
		Arrays.sort(array);
		
		System.out.println(array);
		
		System.out.println(Arrays.toString(array));
		Collections.reverse(Arrays.asList(array));
		System.out.println(Arrays.asList(array));
	}
	
	static void ex2() {
		// TODO Auto-generated method stub
		double companyX = 1.13;
		double companyY = 18.4;
		int ano = 0;
		while(companyX<companyY) {
			companyX += companyX*1.48;
			companyY += companyY * 0.32;
			++ano;
			System.out.println(String.format("Ano %d, empresa X valor: %f",ano,companyX));
			System.out.println(String.format("Ano %d, empresa Y valor: %f",ano,companyY));
		}
		System.out.println(String.format("--> Ano %d, empresa X valor: %f",ano,companyX));
		System.out.println(String.format("--> Ano %d, empresa Y valor: %f",ano,companyY));
	}
	
	static void ex3() {
		CarrinhoDeCompra listaDeProdutos = new CarrinhoDeCompra(); 
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			 System.out.println("Digite o nome");			 
		     String nome = scan.next();
		     
		     System.out.print("Digite o valor: ");
		     double valor = scan.nextDouble();
		     
		     System.out.print("Digite a quantidade: ");
		     int quantidade = scan.nextInt();
		     
		     Produto produto = new Produto(i,nome,valor,quantidade);
		     listaDeProdutos.add(produto);
		}
		System.out.println(listaDeProdutos);
		System.out.println(String.format("Valor total: %f", listaDeProdutos.contabilizar()));
		
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("Escolha o exercicio");
		Scanner scan = new Scanner(System.in);
		int opt = scan.nextInt();

		switch (opt) {
		case 1:
			ex1();
			break;
		case 2:
			ex2();
			break;

		case 3:
			ex3();
			break;

		default:
			break;
		}
		
	}
}
