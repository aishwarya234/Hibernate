package inheritance;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ssn=factory.openSession();
		Transaction tx=ssn.beginTransaction();
		
		Book book=new Book();
		book.setBookid(101);
		book.setAuthor("xyz");
		book.setTitle("Oracle");
		book.setPrice(600);
		
		
		JavaBook java=new JavaBook();
		java.setBookid(201);
		java.setTitle("Java Programming");
		java.setAuthor("bbb");
		java.setPrice(800);
		java.setDicount(20);

		
		DotnetBook dotnet=new DotnetBook();
		dotnet.setBookid(301);
		dotnet.setTitle("Dotnet familiarising");
		dotnet.setAuthor("ccc");
		dotnet.setPrice(900);
		dotnet.setCds(3);
		
		ssn.save(book);
		ssn.save(java);
		ssn.save(dotnet);
		tx.commit();
		ssn.close();
		
	}

}
