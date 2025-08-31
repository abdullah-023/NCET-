package ncet;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class  EmployeeReader{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\abdul\\Desktop\\abc.txt"));
        String line;
        System.out.println("Employee List:");
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            System.out.println("ID: " + parts[0] + " | Name: " + parts[1] + " | Dept: " + parts[2]);

        }
        br.close();
    }
}
 
 