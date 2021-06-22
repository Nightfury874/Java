import java.util.Scanner;

public class If_elseapp {
    public static void main(String[] args) {
      
        System.out.println("Enter your marks");
        Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();

        if (marks >= 90){
        
            System.out.println("A++");
        }
        else if (marks >= 80 && marks < 90){
            System.out.println("A");
        }
        else{
            System.out.println("Fail");
        }
        
        
    }
    
}
