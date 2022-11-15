import  java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class readerfile {
    public static void main(String[] args) throws FileNotFoundException{
    File obj=new File("C:\\EFI\\ram.txt");
        Scanner reader=new Scanner(obj);
        String data=reader.nextLine();
        System.out.println(data);
    }
}
