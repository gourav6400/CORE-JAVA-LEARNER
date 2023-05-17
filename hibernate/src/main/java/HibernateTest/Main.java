package HibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Student;

public class Main {
	public static void main(String[] args) {
		//Student object
		Student student = new Student(1,"Ankit","Java");
		Student sc = new Student(2,"Vaibhav","Full satck");
		Student se = new Student(3,"Nilesh","HTML");
		Student  A = new Student(3,"Nilesh","HTML");
		Student B = new Student(3,"Nilesh","HTML");
		Configuration configuration = new Configuration()
				  .configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		session.beginTransaction();
		session.save(student);
		session.save(sc);
		session.save(se);
		session.save(A);
		session.save(B);
		tx.commit();
	    System.out.println("Object saved successfully");

	}
	
}
