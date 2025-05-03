import java.util.Scanner;

public class Basic_Java_05_Find_Ascii_Values_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character like [A to Z] or [a to z] : ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("The Ascii Values of Character "+ ch +" is : "+ ascii);
    }
}
