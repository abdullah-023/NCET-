import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class ReadData {
	public static void main(String[] args) {
		try
		{
		Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
  
    	SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx  =session.beginTransaction();
       
        List employees = session.createQuery("FROM Student").list();
//        		find. FindAll, findbyIb : JPA
        for (Iterator iterator = employees.iterator();iterator.hasNext();)
        {
           Student  employee = (Student) iterator.next();
           System.out.println("ID : " + employee.getUid());
           System.out.println("  Name: " + employee.getName());
           System.out.println("  CITY : " + employee.getCity());
           System.out.println("  PIN: " + employee.getPin());
           System.out.println("====================");
        }
        tx.commit();
 
        
	}
    catch (Exception e) {
		System.out.println(e);
	}
 
	}
}