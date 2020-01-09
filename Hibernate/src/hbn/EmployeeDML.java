package hbn;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class EmployeeDML {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ssn=factory.openSession();
		Transaction tx=ssn.beginTransaction();
		Employee emp=(Employee) ssn.get(Employee.class, 101);
		emp.setEmpname("bynu");
		//ssn.update(emp);
		ssn.delete(emp);
		tx.commit();
		ssn.close();
}
}