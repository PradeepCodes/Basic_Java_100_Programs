public class Basic_Java_16_Bitwise_Operator {
    public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011

        System.out.println(" a = "+ a +" & b = "+b);
        //Bitwise Operator
        //1. &  -> Bitwise AND
        //2. |  -> Bitwise OR
        //3. ^  -> Bitwise XOR
        //4. ~  -> Bitwise NOT
        //5. << -> Left Shift
        //6. >> -> Right Shift
        //7. >>> -> Unsigned Right Shift
        System.out.println("Bitwise Operation Is Started Below : ");
        System.out.println(" a & b = "+ (a&b));
        // 0101 & 0011 => 0001 (1)
        System.out.println(" a | b = "+ (a|b));
        // 0101 & 0011 => 0111 (7)
        System.out.println(" a ^ b = "+ (a^b));
        // 0101 & 0011 => 0110 (6)
        System.out.println(" a ~ b = "+ (~a));
        // 0101 => 1010 (10) => -6 (Why)

    }
}
