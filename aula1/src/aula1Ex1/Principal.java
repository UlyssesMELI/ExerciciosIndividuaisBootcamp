package aula1Ex1;

import java.util.Iterator;

import java.util.Scanner;


public class Principal {
	
	static void ex1(int n) {
		int i = 0;
		int cont = 0;
		while(cont<n){
			if(i%2==0) {
				System.out.println(i);
				cont++;
			}
			i += 1;
		}

	}
	
	static void ex2(int n, int m) {
		for (int i = 0; i<=n;i++) {
			if(i%m==0) {
				System.out.println(i);
			}
		}
	}
	
	static boolean ex3(int n) {
		int d;
		if(n <= 1) {
			return false;
		}
		for (d = 2; d < n; d++) {
			if (n%d == 0) {
				return false;
			}
		}
		return true;

	}
	
	static void ex4(int n) {
		int i = 0;
		int cont = 0;
		while(cont<n){
			if(ex3(i)) {
				System.out.println(i);
				cont++;
			}
			i += 1;
		}
	}
	
	static void ex5(int n,int m, int d) {
		int cont = 0;
		int numOfD = 0;
		boolean allow = true;
		while(n>0) {
			allow = true;
			numOfD = 0;
			String aux_number = String.valueOf(cont);
			for(int i = 0; i<aux_number.length(); i++) {
				if (Character.getNumericValue(aux_number.charAt(i)) == d) {
					numOfD++;
				}
			}
			if (numOfD>=m) {
				System.out.println(cont);
				n--;
			}

			cont++;
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	     System.out.print("Digite o nuero do exercicio: ");
	     int opt = scan.nextInt();
	     int m = 0;
	     System.out.print("Digite N: ");
	     int n = scan.nextInt();
	     
	     switch (opt) {
	     case 1:
	    	 ex1(n);
	    	 break;
	     case 2:
	    	 System.out.print("Digite M: ");
		     m = scan.nextInt();
		     ex2(n,m);
	    	 break;
	     case 3:
	    	 if(ex3(n)){
	    		System.out.println("primo");
	    		break;
	    	 };
	    	 System.out.println("Nao primo");
	    	 break;
	     case 4:
	    	 ex4(n);
	    	 break;
	     case 5:
	    	 System.out.print("Digite M: ");
		     m = scan.nextInt();
		     System.out.print("Digite D: ");
		     int d = scan.nextInt();
	    	 ex5(n,m,d);
	    	 break;

	     default:
	    	 break;
	     }
	     
		
	}

}