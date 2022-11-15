public class exception_java {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;
        try {
           int arr[]=null;
            System.out.println(arr[1]);
           // c = a / b;
       // }catch (Exception e) {
         //   System.out.println("varan");

        }catch (ArithmeticException e) {
            System.out.println("error occuard");
        }
        // catch (Exception e) {
                //System.out.println("ragu");
          //  }

        catch (NullPointerException e) {
            System.out.println("null occuard");
       }finally {
            System.out.println("what is your name");
      //  }catch (Exception e) {
          // System.out.println("ragu");
        }
        System.out.println(c);
        System.out.println("programize");
    }
}
