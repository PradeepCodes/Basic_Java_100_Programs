public class Basic_Java_14_AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b;

        //= -> assignment
        b = a;
        System.out.println("Assignment (=)"+ b);

        //+= -> Addition Assignment
        b +=5;  // b = b + 5; -> b=15;

        System.out.println("Addition Assignment (+=) : "+ b);

        //-= -> Subtraction Assignment
        b -= 3;  // b = b = 3; -> 15-3 = 12;

        System.out.println("Subtraction Assignment (-=) : "+ b);

        //*= -> Multiplication Assignment
        b *=2;   // b = b * 2 = 24;

        System.out.println("Multiplication Assignment (*=) : "+ b);

        // /= -> Division Assignment
        b /= 2;  // b = b / 2 = 12;

        System.out.println("Division Assignment (/=) : "+ b);

        //%= -> Modulo Assignment
        b %= 2; // b = b % 2 = 0

        System.out.println("Modulus Assignment (%=) : "+ b);


    }
}
