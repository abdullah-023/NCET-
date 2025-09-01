import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class UpdateRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
  
    	SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx  =session.beginTransaction();
	      
	      try {
	    	  Scanner sc = new Scanner(System.in);
	    	  System.out.println("Enter ID to UPDATE : ");
	    	  int id=sc.nextInt();
	    	  
	    	  System.out.println("Transfer  to  :");
	    	  String city=sc.next();
 
	         Student employee = (Student)session.get(Student.class, id);
	         employee.setCity( city );
	         
			 session.update(employee);
	         tx.commit();
	      } catch (Exception e) {
	       System.out.println(e);
	      }
 
	}
}
