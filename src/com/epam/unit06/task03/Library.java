package com.epam.unit06.task03;

import java.util.ArrayList;
import java.util.List;

class Library {
	private List<Book> bookList= new ArrayList<>();
	
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
		String text;
		text=bk.getId()+"\t/"+bk.getAuthor()+"\t/"+bk.getName()+"\t/"+bk.getPrice()+"\t/"+bk.getPublisher()+"\t/"+bk.getYearProd()+"\t/"+bk.getCoverType()+"\t/"+bk.getNumberOfPages()+"\n";
	    
		return text;
	}
	
	public String searchByAuthor(String author) {
		Book bk;
		String text="ID\t/Author\t\t/Name\t\t\t/Price\t\t/Publisher\t/Year\t/CoverType\t/Number of Pages\n";
		
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
		String text="ID\t/Author\t\t/Name\t\t\t/Price\t\t/Publisher\t/Year\t/CoverType\t/Number of Pages\n";
		
		for (int i=0; i<getSize(); i++) {
			bk=bookList.get(i);	
			if (bk.getYearProd()>=year) {
				text=text+textBuild(bk);
			}	
		}
				
	   return text;
	}
	
}