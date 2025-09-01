import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class DeleteRecord {
	public static void main(String[] args) {
try {
        	
        	Configuration cfg = new Configuration();
        	cfg.configure("hibernate.cfg.xml");
      
        	SessionFactory factory = cfg.buildSessionFactory();
        	
        	Student st = new Student();
 
                        
        	Scanner sc= new Scanner(System.in);
        	System.out.println("Enter ID to Delete : ");
        	int uid=sc.nextInt();
        	
        	st.setUid(uid);
        	
            Session session = factory.openSession();
            Transaction tx  =session.beginTransaction();
            session.delete(st);
            tx.commit();
            
            System.out.println("Data Deleted Successfully ...!");
            
		}
        catch (Exception e) {
			System.out.println(e);
		}
 
	}
}
