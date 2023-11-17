
public class LengthArray {
    
    public static void main(String[] args) {
        String[][] arrayWord = {{"Hello","there","world"},{"How","are","you"}};
        System.out.println("==================================================");
        System.out.print(arrayWord[0][0]+"\t");
        System.out.print(arrayWord[0][1]+"\t");
        System.out.print(arrayWord[0][2]+"\t");
        System.out.print(arrayWord[1][0]+"\t");
        System.out.print(arrayWord[1][1]+"\t");
        System.out.println(arrayWord[1][2]+"\t");
        System.out.println("==================================================");
        for(int i=0; i<=arrayWord.length; i++){
            System.out.print(arrayWord[0][i]+"\t");
            System.out.println(arrayWord[1][i]);
        }
       
        
        
        
        System.out.println("============================");
        
            
        
    }
}
