import java.util.Scanner;

public class Basic_Java_10_Take_input_from_user_and_display_it {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Input for User : ");
        System.out.println("Enter the Bytes Values : ");
        byte b = sc.nextByte();
        System.out.println("Bytes values you Entered : "+b);

        System.out.println("Enter the Short values : ");
        short sh = sc.nextShort();
        System.out.println("Short values you entered "+sh);

        System.out.println("Enter the Integers values : ");
        int in = sc.nextInt();
        System.out.println("Integer values you entered "+in);

        System.out.println("Enter the Long values : ");
        long l = sc.nextLong();
        System.out.println("Long values you entered "+l);

        System.out.println("Enter the Float values : ");
        float f = sc.nextFloat();
        System.out.println("float values you entered "+f);

        System.out.println("Enter the double values : ");
        double d = sc.nextDouble();
        System.out.println("Double values you entered "+d);

        System.out.println("Enter the Char values : ");
        char ch = sc.next().charAt(0);
        System.out.println("Char values you entered "+ch);

        System.out.println("Enter the Boolean values : ");
        boolean bool = sc.nextBoolean();
        System.out.println("Boolean values you entered "+bool);
  sc.close();
    }
}
