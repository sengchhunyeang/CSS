
package TestMethod;
import java.lang.Math;
public class test_method {
    
//    Method Print Average 
 public static double average(double[] array){
     double sum=0;
     for(double a :array){
         sum+=a;
     }
     double average=sum/array.length;
     return average;
     
 }
 public static double averages(double a, double b , double c ){
     
     
     return a+b+c/3;
 }
   
// finish mehtod Average
 
/**
 * This is Method smallest value 
 * create by Chhunyeang
 * 
 */
 public static int smallest(int a, int b ,int c){
   return Math.min(Math.min(a, b), c);
 }
 
}
