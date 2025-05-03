import java.util.Scanner;

public class Basic_Java_13_Logical_Operator {
    public static void main(String[] args) {
        // AND(&&) ,OR(||) , NOT(!)
        System.out.println("logical Operator : \n");
        int a = 10;
        int b =20;

        System.out.println("1 : AND Operation");
        System.out.println("2 : OR Operation");
        System.out.println("3 : NOT Operator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Choice Below");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1 :
                if(a > 0 && b > 0)
                {
                    System.out.println("a and b are Greater than zero");

                }
                else
                {
                    System.out.println("both are less than zero");
                }
                break;
            case 2:
                if(a > 10 || b > 10)
                {
                    System.out.println("a or b anyone greater than 10");

                }
                else {
                    System.out.println("both are not greater than 10");
                }
                break;
            case 3 :
                if(a!=9)
                {
                    System.out.println("a is not equals to 9");
                }
                else {
                    System.out.println("a is eqauls to 9");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
sc.close();
    }
}
