package com.epam.unit06.task03;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Library lb =new Library();
		
		lb.addBook(new Book(1, "The Lord of the Rings1","J.Tolkien","Atamura",2005,1020, 8520.12,"Soft cover"));
		lb.addBook(new Book(2, "The Lord of the Rings2","J.Tolkien","Atamura",2006,1010, 8120.12,"Hard cover"));
		lb.addBook(new Book(4, "the Lord of the Rings3","J.Tolkien","ACT    ",2007,980, 10120.98,"Hard cover"));
		lb.addBook(new Book(6, "Harry Potter 1        ","J. K. Rowling","bloomsbury",1997,500, 4120.18,"Soft cover"));
		lb.addBook(new Book(8, "Harry Potter 2        ","J. K. Rowling","bloomsbury",1998,520, 4120.18,"Soft cover"));
		
		System.out.println(lb.searchByAuthor("J.Tolkien"));
		
		System.out.println(lb.searchByYear(1997));
		
	}

}

