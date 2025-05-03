import java.util.Scanner;

public class Basic_Java_07_Swap_Two_Number_Using_Without_Third_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Values of b : ");
        int b = sc.nextInt();
        System.out.println("Before Swapping values : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping Values : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
}
