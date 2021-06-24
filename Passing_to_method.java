public class passing_to_method{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println("method to print sum of arrays");
        sum(arr);
    }
    public static void sum(int[] arr) {
        int sum = 0;
        for (int i=0; i < arr.length; i++){
            sum += arr[i];
             
        }
        System.out.println(sum);
        
    }
}