
package TestMethod;
import java.util.Scanner;
public class Soltion1 {
  
    public static void main(String[] args) {
         Scanner mySc= new Scanner(System.in);
            int a= mySc.nextInt();
            int b= mySc.nextInt();
            int c= mySc.nextInt();
            System.out.println("+=============================");
            System.out.println("A:"+a);
            System.out.println("A:"+b);
            System.out.println("A:"+c);
            test_method sm =new test_method();
            System.out.println("This value Smallest : \t "+ sm.smallest(a, b, c));
            System.out.println("+=============================");
            
    }
}
