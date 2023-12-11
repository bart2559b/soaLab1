package th.ac.ku.eng.kps.cpe.lab1.model;


public class BookStore {
	public String title;
	public String author;
	public String catagory;
	public int year;
	public Byte edition;
	public double price;
	public String isbn;
	
	public BookStore() {
		this.title = "";
		this.author ="";
		this.catagory="";
		this.year=0;
		this.edition=0;
		this.price = 0.0;
	}

	public void setIsbn(String string) {
		this.isbn = string;
	}
	public String getIsbn() {
		return this.isbn;
	}

	public void setTitle(String string) {
		this.title = string;
	}
	public String getTitle() {
		return this.title;
	}

	public void setAuthor(String string) {
		this.author = string;
	}
	public String getAuthor() {
		return this.author;
	}

	public void setCatagory(String string) {
		this.catagory = string;
	}
	public String getCatagory() {
		return this.catagory;
	}

	public void setEdition(byte b) {
		this.edition = b;
	}
	public Byte getEdition() {
		return this.edition;
	}

	public void setYear(int i) {
		this.year = i;
	}
	public int getYear() {
		return this.year;
	}

	public void setPrice(double d) {
		this.price = d;
		
	}
	public double getPrice() {
		return this.price;
	}
	
}
