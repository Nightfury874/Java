import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
class Main{
    public static void main (String [] args){
        Scanner scan =  new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = scan.next();

        System.out.println(" Your name is " + name);
        System.out.println ("Type in your quote");
        String quote = scan.next();
    }
}