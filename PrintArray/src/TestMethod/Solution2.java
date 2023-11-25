
package TestMethod;
import java.util.Scanner;
public class Solution2 {
    
        public static void main(String[] args) {
            
            
            Scanner mySc= new Scanner(System.in);
            double a= mySc.nextDouble();
            double b= mySc.nextDouble();
            double c= mySc.nextDouble();
            System.out.println("+=============================");
            System.out.println("A:"+a);
            System.out.println("A:"+b);
            System.out.println("A:"+c);

            
            System.out.println("+=============================");

            test_method aver = new test_method();
            
            System.out.println("This Result Average : \t" + aver.averages(a,b,c));
            
    }
    
    
    
    
}
