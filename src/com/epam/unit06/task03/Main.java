package com.epam.unit06.task03;

import java.util.ArrayList;

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


class Book {
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int yearProd;
	private int numbPages;
	private double price;
	private String cover;
	
	
	public Book (int _id, String _name, String _author, String _publisher, int _yearProd, int _numbPages, double _price, String _cover ) {
		this.id=_id;
		this.name=_name;
		this.author=_author;
		this.publisher=_publisher;
		this.yearProd=_yearProd;
		this.numbPages=_numbPages;
		this.price=_price;
		this.cover=_cover;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getAuthor () {
		return author;
	}
	
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	
	public void setYearProd(int yearProd) {
		this.yearProd=yearProd;
	}
	public int getYearProd() {
		return yearProd;
	}
	
	public void setNumberOfPages(int numbPages) {
		this.numbPages=numbPages;
	}
	public int getNumberOfPages() {
		return numbPages;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice () {
		return price;
	}
	
	public void setCoverType(String cover) {
		this.cover=cover;
	}
	public String getCoverType() {
		return cover;
	}
	
}

class Library {
	private ArrayList<Book> bookList= new ArrayList<>();
	private String text="ID\t/Author\t\t/Name\t\t\t/Price\t\t/Publisher\t/Year\t/CoverType\t/Number of Pages\n";
	
	public Library() {}
	
	public void addBook(Book bk) {
		bookList.add(bk);
	}
	
	public boolean getStatus(String det) {
		return bookList.contains(det);
	}
	
	public int getSize() {
		return bookList.size();
	}
	
	
	public String textBuild(Book bk) {
		
		text=bk.getId()+"\t/"+bk.getAuthor()+"\t/"+bk.getName()+"\t/"+bk.getPrice()+"\t/"+bk.getPublisher()+"\t/"+bk.getYearProd()+"\t/"+bk.getCoverType()+"\t/"+bk.getNumberOfPages()+"\n";
	    
		return text;
	}
	
	public String searchByAuthor(String author) {
		Book bk;
		
		for (int i=0; i<getSize(); i++) {
			bk=bookList.get(i);	
			if (bk.getAuthor()==author) {
				text=text+textBuild(bk);
			}	
		}
				
	   return text;
	}
	
	public String searchByYear(int year) {
		Book bk;
		
		for (int i=0; i<getSize(); i++) {
			bk=bookList.get(i);	
			if (bk.getYearProd()>=year) {
				text=text+textBuild(bk);
			}	
		}
				
	   return text;
	}
	
}
