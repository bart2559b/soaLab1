package th.ac.ku.eng.kps.cpe.lab1.model;

public class Main {
	public static void main(String[] args) {
		
		BookStore b = new BookStore() ;
		b.setIsbn("0123456001");
		b.setTitle("Java For Dummies");
		b.setAuthor("Tan Ah Teck");
		b.setCatagory("Programming");
		b.setYear(2009);
		b.setEdition((byte)7);
		b.setPrice(19.99);

		
	}
}
