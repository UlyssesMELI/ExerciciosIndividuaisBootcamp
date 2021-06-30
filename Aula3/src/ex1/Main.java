package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.nio.charset.Charset;


public class Main {
	
	public static void sortPessoa() {
		List<Precedente <Pessoa>> arr [] = new ArrayList[3];;
		 
		Random r = new Random();
		byte[] randomArray = new byte[7];
		
        // initializing
        for (int i = 0; i < 3; i++) {
            arr[i] = new ArrayList<Precedente <Pessoa>>();
            arr[i].add(new Pessoa("Fulano"+i,4));
            arr[i].add(new Pessoa("Ciclano"+i,2));
            arr[i].add(new Pessoa("Beltrano"+i,3));
            arr[i].add(new Pessoa("Pedro"+i,6));
            arr[i].add(new Pessoa("Amauri"+i,1));
            
            
        }
        
        SortUtil.sort(arr);
        
        
        int index = 0;
        for(List l: arr) {
        	System.out.println("Lista Pessoa " + index++ + "\n");
        	l.forEach(System.out::println);
        }
	}
	
	public static void sortCelular() {
		List<Precedente <Celular>> arr [] = new ArrayList[3];;
		 
		Random r = new Random();
		byte[] randomArray = new byte[7];
		
        // initializing
        for (int i = 0; i < 3; i++) {
            arr[i] = new ArrayList<Precedente <Celular>>();
            arr[i].add(new Celular(12333214));
            arr[i].add(new Celular(45435342));
            arr[i].add(new Celular(3567567));
            arr[i].add(new Celular(634543));
            arr[i].add(new Celular(999));
            
            
        }
        
        SortUtil.sort(arr);
        
        
        int index = 0;
        for(List l: arr) {
        	System.out.println("Lista Celular " + index++ + "\n");
        	l.forEach(System.out::println);
        }
	}
	
	public static void main(String[] args) {
		
		sortPessoa();
		sortCelular();
        
        
	}

}
