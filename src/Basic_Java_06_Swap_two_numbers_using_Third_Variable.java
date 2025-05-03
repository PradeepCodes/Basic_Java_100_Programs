public class Basic_Java_06_Swap_two_numbers_using_Third_Variable{

public static void main(String[] args) {
    System.out.println("Before Swapping : ");
    int a = 10;
    int b = 15;

    System.out.println("a = "+a);
    System.out.println("b = "+b);

    int temp = a;
    a = b;
    b = temp;

    System.out.println("After Swapping : ");
    System.out.println("a = "+ a);
    System.out.println("b = "+b);

}
}
