import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
     Student student = new Student();

     student.setFirstName("Pasindu");
     student.setLastName("Manodya");
     student.setPhoneNumber("1234556");

        File file = new File("Student");

     System.out.println("Student's first name is : " + student.getFirstName());
     System.out.println("Student's last name is : " + student.getLastName());
     System.out.println("Student's telephone number is : " + student.getPhoneNumber());

     try{

         if (file.createNewFile()){
             System.out.println("File created");
         }else {
             System.out.println("File already exists");
         }
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("First Name : " + student.getFirstName() + " Last Name : " + student.getLastName());
        //bufferedWriter.write("Last Name : " + student.getLastName());
        bufferedWriter.write(" Number : " + student.getPhoneNumber());
        bufferedWriter.close();

    }
}