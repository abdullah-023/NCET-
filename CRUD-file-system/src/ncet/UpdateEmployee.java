package ncet;

import java.io.*;
import java.util.Scanner;
 
public class UpdateEmployee {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter Employee ID to update: ");
        String targetId = scanner.nextLine();
 
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
 
        System.out.print("Enter new department: ");
        String newDept = scanner.nextLine();
 
        File inputFile = new File("C:\\Users\\abdul\\desktop\\abc.txt");
        File tempFile = new File("C:\\Users\\abdul\\desktop\\temp.txt");
 
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
 
        String line;
        boolean found = false;
 
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts[0].equals(targetId)) {
                writer.write(targetId + ", " + newName + ", " + newDept + "\n");
                found = true;
            } else {
                writer.write(line + "\n");
            }
        }
        for(Employee emp : Employee.employees) {
        		if(emp.getId()==Integer.parseInt(targetId)) {
        			emp.setName(newName);
        			emp.setDept(newDept);
        			break;
        		}
        }
 
        writer.close();
        reader.close();
        scanner.close();
 
        tempFile.renameTo(inputFile);        
        if(inputFile.delete()) System.out.println("file deleted successfully.");
 
        if (found) {
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee ID not found.");
        }
    }
}
 
 
