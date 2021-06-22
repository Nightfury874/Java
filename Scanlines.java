import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
public class Scanlines{
    public static void main (String [] args){
        Scanner scan =  new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = scan.next();

        System.out.println(" Your name is " + name);
        System.out.println ("Type in your quote");
        String quote = scan.next();
        //System.out.println(quote); // Here only first word is printed because scan.next() will only take in till first space
        //we shall add
        quote = quote + scan.nextLine(); //will print till enter is hit
        System.out.println(quote);
    }
}