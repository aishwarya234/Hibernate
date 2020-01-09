package hbn;

//import javax.transaction.Transaction;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ssn=factory.openSession();
		Transaction tx=ssn.beginTransaction();
		Employee emp=new Employee();
		emp.setEmpcode(108);
		emp.setEmpname("hp");
		emp.setSalary(60000);
		ssn.save(emp);
		tx.commit();
		ssn.close();
	}

}
