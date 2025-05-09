import java.util.Scanner;

public class Basic_Java_15_Increment_and_Decrement_Operator {
    public static void main(String[] args) {

        int a = 5;
        int b=10;

        //Pre-Increment : ++a
        System.out.println("Pre-Increment : ++a : "+(++a));  //a =6;

        //Post-Increment: a++
        System.out.println("Post-Increment : a++ : "+(a++));  //a= 6
        System.out.println("value after the Post-Increment : a : "+ a); //a= 7

        //Pre-Decrement
        System.out.println("Pre-Decrement : --b : "+ (--b)); //b=9

        //Post-Decrement
        System.out.println("Post-Decrement : b-- : "+ (b--)); // b=9;
        System.out.println("Value After the Post_Decrement : b :"+ b); //b=8
    }
}
