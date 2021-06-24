public class return_statements {
    public static void main (String[] args){
        name();
        // int sum =add(4,5);
        // System.out.println(sum);
        String shout = caps("Hello my name is ");
        System.out.println(shout);
   }
     public static void name() {
         System.out.println("Name");}
        
    
    public static String caps(String s){
        return s.toUpperCase();
    }
}
