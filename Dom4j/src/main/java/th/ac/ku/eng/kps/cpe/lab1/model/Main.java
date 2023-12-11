package th.ac.ku.eng.kps.cpe.lab1.model;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BookStore b = new BookStore() ;
		b.setIsbn("0123456001");
		b.setTitle("Java For Dummies");
		b.setAuthor("Tan Ah Teck");
		b.setCatagory("Programming");
		b.setYear(2009);
		b.setEdition((byte)7);
		b.setPrice(19.99);

		Document doc = DocumentFactory.getInstance().createDocument();
		doc.addComment("bookstore.xml");
		
		Element bookstore = doc.addElement("bookstore");
		
		Element book = bookstore.addElement("book");
		book.addAttribute("ISBN", b.getIsbn());

		Element elem = book.addElement("title");
		elem.addText(b.getTitle());
		
		elem = book.addElement("author");
		elem.addText(b.getAuthor());
		
		elem = book.addElement("catagory");
		elem.addText(b.getCatagory());
		
		elem = book.addElement("year");
		elem.addText(Integer.toString(b.getYear()));
		
		elem = book.addElement("edition");
		elem.addText(Byte.toString(b.getEdition()));
		
		elem = book.addElement("price");
		elem.addText(Double.toString(b.getPrice()));

		FileOutputStream fos = new FileOutputStream("bookstore.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fos, format);
		writer.write(doc);
		writer.flush();
		writer.close();
		fos.close();
		
	}
}
