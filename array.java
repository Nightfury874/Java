import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] array1 = new int []{1,2,3,4,5,56,7,8,9,10};
        Scanner scan = new Scanner ( System.in);
        int x =  scan.nextInt();  
        System.out.println (x); 
        for (int i =0; i< x; i++){
            System.out.println( "The element at index " + i + " is " +array1[i]);
        }

    }
}
