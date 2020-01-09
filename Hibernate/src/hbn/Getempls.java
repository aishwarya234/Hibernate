package hbn;

import java.util.List;

//import javax.management.Query;

import  org.hibernate.Query;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Getempls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ssn=factory.openSession();
		org.hibernate.Query query=ssn.createQuery("from Employee");
		List<Employee> emplist= query.list();
		for(Employee e:emplist)
		System.out.println(e.getEmpcode()+" "+e.getEmpname()+" "+e.getSalary());
		ssn.close();
	}

}
