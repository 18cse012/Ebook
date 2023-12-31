package com.tarun.Entity;

public class BookDtls {
	
	private int bookId;
	private String bookName;
	private String author;
	private String price;
	private String bookCategori;
	private String status;
	private String photoName;
	private String email;
	
	public BookDtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookDtls(String bookName, String author, String price, String bookCategori, String status, String photoName,
			String email) {
		super();
		
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.bookCategori = bookCategori;
		this.status = status;
		this.photoName = photoName;
		this.email = email;
	}

	public int getId() {
		return bookId;
	}

	public void setId(int id) {
		this.bookId = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBookCategori() {
		return bookCategori;
	}

	public void setBookCategori(String bookCategori) {
		this.bookCategori = bookCategori;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "BookDtls [id=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", bookCategori=" + bookCategori + ", status=" + status + ", photoName=" + photoName + ", email="
				+ email + "]";
	}
	
	
	
	

}
