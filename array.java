// import java.util.Scanner;
// class Student
// {
//     public int roll_no;
//     public String name;
//     Student (int roll_no, String name)
//     {
//         this.roll_no = roll_no;
//         this.name = name;
//     }
// }
// public class array {
//     public static void main(String[] args) {
//         Student [] array1 = new Student[5];
//         array1[0] =  new Student (1, "Nihar");
//         array1[1] =  new Student (2, "Jyoti");
//         array1[2] =  new Student (3, "Basisth");

//         for (int i =0; i< array1.length; i++){
//             System.out.println("The name of student at psition 1 is " + array1[i].name + " and roll number is " + array1[i].roll_no);
//         }

//     }
// // }
// public class array{
//     public static void main(String[] args){
//         int n;
//         int[] arr =  new int[10];
//         Scanner scan = new Scanner(System.in);
//         n=scan.nextInt();
//         for (int i=0; i< n; i++){
           
//              arr[i]= scanner.nextInt();
//         }

//     }
// }


import java.util.Scanner;
public class array{
  public static void main(String[] args) {

    // Scanner class object to read input
    Scanner scan = new Scanner(System.in);

    // declaring and creating array objects
    int[] arr = new int[5];

    // displaying default values
    System.out.println("Default values of array:");
    for (int i=0; i < arr.length; i++) {
      System.out.print(arr[i]+"\t");
    }

    // initializing array
    System.out.println("\n\n***Initializing Array***");
    System.out.println("Enter "+ arr.length
                     + " integer values:");

    for(int i=0; i < arr.length; i++) {
      // read input
      arr[i] = scan.nextInt();
    }
    System.out.println("***Initialization completed***\n");

    //displaying initialized values
    System.out.println("Array elements are:");
    for (int i=0; i < arr.length; i++) {
      System.out.print(arr[i]+"\t");
    }

  }
}