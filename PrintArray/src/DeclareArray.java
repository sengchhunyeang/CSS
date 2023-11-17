
public class DeclareArray {
    public static void main(String[] args) {
        System.out.println("=============================================");
        String[][] colors={
            {"red","yellow","blue"},
            {"orage","green","purple"}
        };
        for(int i=0; i<=colors.length;i++){
            
                System.out.print(colors[0][i]+"\t");
                
            
        }
        System.out.println("");
         System.out.println("=============================================");
         for(int j=0; j<=colors.length;j++){
            
                System.out.print(colors[1][j]+"\t");
                
            
        }
         System.out.println("");
         System.out.println("=============================================");
    }
    
}
