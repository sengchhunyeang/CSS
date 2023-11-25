
public class ChangeRow {
    
    public static void main(String[] args) {
        
        int[][] change={
            
            {10,20,30},
            {40,50,60}
        };
        for(int i=0; i<=change.length;i++){
            for(int j=0; j<=change.length;j++){
                System.out.println(change[i][j]);
            }
        }
    }
}  