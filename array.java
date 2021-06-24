// import java.util.Scanner;
class Student
{
    public int roll_no;
    public String name;
    Student (int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class array {
    public static void main(String[] args) {
        Student [] array1 = new Student[5];
        array1[0] = new Student(1, "Nihar");
        array1[1] =  new Student (2, "Jyoti");
        array1[2] =  new Student (3, "Basisth");

        for (int i =0; i< array1.length; i++){
            System.out.println("The name of student at psition 1 is " + array1[i].name + "and roll number is " + array1[i].roll_no);
        }

    }
}
