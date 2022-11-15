import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) throws IOException {

            FileWriter obj = new FileWriter("C:\\EFI\\ram.txt");
try{
   // FileWriter obj = new FileWriter("C:\\EFI\\ram.txt");

    obj.write("this is a ragu");
           obj.close();
    System.out.println("hgfth5uygh");
    //obj.close();

} catch (IOException f) {
            System.out.println("file has been writter");
    System.out.println("fggfdu");
        }
    }
}
