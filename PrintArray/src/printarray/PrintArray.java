
package printarray;
import java.lang.ArrayIndex;
public class PrintArray {

    public static void main(String[] args) {
       
        System.out.println("======================");
        int[][] myArray = {{10,39,8},{3},{35,87},{22},{34}};
        
//        for (int i =0; i<myArray.length; i++){
//            for (int j = 0 ; j<myArray.length; j++){
//                System.out.println("Array 2 D:\t"+myArray[i][j]);
//            }
//        }
        
        System.out.println("Print:\t 8,3,87,34");
        System.out.println("============================================");
        System.out.println("Result:\t"+myArray[0][2]+"\t"+myArray[1][0]+"\t"+myArray[2][1]+"\t"+myArray[4][0]);
        
        System.out.println("============================================");
       
    }
    
}
