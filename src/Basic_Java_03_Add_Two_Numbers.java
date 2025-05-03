import java.util.Scanner;

public class Basic_Java_03_Add_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Values : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Second Values : ");
        int b = sc.nextInt();
        System.out.println("Addition values : "+ (a+b));
    }
}
