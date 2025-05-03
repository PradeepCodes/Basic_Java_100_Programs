import java.util.Scanner;

public class Basic_Java_04_Multiply_two_flaot_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Float values : ");
        float a  = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter the Second Float values : ");
        float b = sc.nextFloat();
        System.out.println("Multiplication of 2 float values : "+ a * b);
    }
}
