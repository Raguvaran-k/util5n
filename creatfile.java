import java.io.File;
import java.io.IOException;
public class creatfile {
    public static void main(String[] args)throws IOException {
       File ragu=new File("C:\\EFI\\karthi.txt") ;

       if (ragu.createNewFile()){
           System.out.println("file created");
       }else {
      // ragu.createNewFile();
        System.out.println("file already created");
    }
}
}
