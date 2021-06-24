public class return_statements {
    public static void main (String[] args){
        name();
        int sum =add(4,5);
        System.out.println(sum);
    }
    public static void name() {
        System.out.println("Name");
        
    }
    public static int add(int a, int b){
        return a+b;
    }
}
