package th.ac.ku.eng.kps.cpe.lab1.model;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Main2 {
	public static void main(String[] args) throws Exception {
		
		BookStore2 b = new BookStore2() ;
		b.setIsbn("0123456001");
		//b.setTitle("Java For Dummies");
		b.setAuthor("Tan Ah Teck");
		b.setAuthor("Gnu");
		b.setCatagory("Programming");
		b.setYear(2009);
		b.setEdition((byte)7);
		b.setPrice(19.99);
		
		if(b.getTitle().isBlank()) {
			System.out.println("yolo");
		} else {
			System.out.println("no");
		}
		
		
		Document doc = DocumentFactory.getInstance().createDocument();
		doc.addComment("bookstore2.xml");
		
		Element bookstore = doc.addElement("bookstore");
		
		Element book = bookstore.addElement("book");
		book.addAttribute("ISBN", b.getIsbn());


		Element elem = book.addElement("title");
		elem.addText(b.getTitle());
		
		elem = book.addElement("author");
		elem.addText(b.getAuthor().get(0));
		elem = book.addElement("author");
		elem.addText(b.getAuthor().get(1));
		
		elem = book.addElement("catagory");
		elem.addText(b.getCatagory().get(0));
		
		elem = book.addElement("year");
		elem.addText(Integer.toString(b.getYear()));
		
		elem = book.addElement("edition");
		elem.addText(Byte.toString(b.getEdition()));
		
		elem = book.addElement("price");
		elem.addText(Double.toString(b.getPrice()));
		
		
		
		
		
		FileOutputStream fos = new FileOutputStream("bookstore2.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fos, format);
		writer.write(doc);
		writer.flush();
		writer.close();
		fos.close();
		
		
		
		
	}
}
