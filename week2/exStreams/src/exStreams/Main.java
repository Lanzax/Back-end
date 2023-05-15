package exStreams;


import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		product p1=new product((long) 554655, "aldo", "fana", (double) 47.20);
		product p2=new product((long) 764646, "giovanni", "fana", (double) 85.20);
		product p3=new product((long) 959595, "giacomo", "fana", (double) 78.20);
		product p4=new product((long) 94548, "pollo", "loopo", (double) 45.20);
		product p5=new product((long) 9595, "rooss", "doro", (double) 55.20);
		product p6=new product((long) 82822, "eros", "eropo", (double) 99.20);
		aggiungiLibro(p1);
		aggiungiLibro(p2);
		aggiungiLibro(p3);	
		aggiungiBoys(p4);
		aggiungiBoys(p5);
		aggiungiBoys(p6);	
		
		prodotti.add(books);
		prodotti.add(boys);
		System.out.println(prodotti);
	}
	static List<Object>prodotti=new ArrayList<Object>();
	static List<Object>books=new ArrayList<Object>();
	static List<Object>boys=new ArrayList<Object>();
	
	 public static void aggiungiLibro(product p1) {	
		 
		 books.add("\nid: "+p1.id+"\nname: "+p1.name+"\ncategory: "+p1.category+"\nprice: "+p1.price+"\n");
		 
	}
	 public static void aggiungiBoys(product p1) {	
		 
		 boys.add("\nid: "+p1.id+"\nname: "+p1.name+"\ncategory: "+p1.category+"\nprice: "+p1.price+"\n");
		 
	}
}
