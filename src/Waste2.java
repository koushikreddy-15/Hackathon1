import java.util.Scanner;

public class Waste2 {
    public static void main(String[] args ) {
        Scanner sc =new Scanner(System.in);
        double WasteCollected =sc.nextDouble();
         
        if (WasteCollected >= 100.0 ){
            System.out.println("Collection Target Achieved");
        } else{
           System.out.println("More waste collection required");
        } 
    }

    
}
