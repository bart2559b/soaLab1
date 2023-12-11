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

	public void setTitle(String string) {
		this.title = string;
	}

	public void setAuthor(String string) {
		this.author = string;
	}

	public void setCatagory(String string) {
		this.catagory = string;
	}

	public void setEdition(byte b) {
		this.edition = b;
	}

	public void setYear(int i) {
		this.year = i;
	}

	public void setPrice(double d) {
		this.price = d;
		
	}
	
}
