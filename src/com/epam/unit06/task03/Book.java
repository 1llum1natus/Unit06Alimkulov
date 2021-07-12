package com.epam.unit06.task03;

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
