import java.sql.SQLOutput;

public class ASCII {
    public static void main(String[] args) {
        char number = 0;
        while(number <= 127) {
          System.out.print((int) number);
          System.out.print(' ');
          System.out.println(number);
        number++;
       }
   }
}
