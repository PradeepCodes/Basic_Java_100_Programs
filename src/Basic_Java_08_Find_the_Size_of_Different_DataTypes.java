public class Basic_Java_08_Find_the_Size_of_Different_DataTypes {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //doublt
        //char
        //boolean
        System.out.println("size and range of the primitive data typess in java:\n");
        System.out.println("byte : ");
        System.out.println("  Size : "+Byte.BYTES+ " bytes ");
        System.out.println(" Range : "+Byte.MIN_VALUE +" to "+ Byte.MAX_VALUE);

        System.out.println("\n");
        System.out.println("short : ");
        System.out.println("  Size : "+Short.BYTES+ " bytes ");
        System.out.println(" Range : "+Short.MIN_VALUE +" to "+ Short.MAX_VALUE);

        System.out.println("\n");
        System.out.println("Integer : ");
        System.out.println("  Size : "+Integer.BYTES+ " bytes ");
        System.out.println(" Range : "+Integer.MIN_VALUE +" to "+ Integer.MAX_VALUE);

        System.out.println("\n");
        System.out.println("Long : ");
        System.out.println("  Size : "+Long.BYTES+ " bytes ");
        System.out.println(" Range : "+Long.MIN_VALUE +" to "+ Long.MAX_VALUE);

        System.out.println("\n");
        System.out.println("Float : ");
        System.out.println("  Size : "+Float.BYTES+ " bytes ");
        System.out.println(" Range : "+Float.MIN_VALUE +" to "+ Float.MAX_VALUE);

        System.out.println("\n");
        System.out.println("Double : ");
        System.out.println("  Size : "+Double.BYTES+ " bytes ");
        System.out.println(" Range : "+Double.MIN_VALUE +" to "+ Double.MAX_VALUE);

        System.out.println("\n");
        System.out.println("Char : ");
        System.out.println("  Size : "+Character.BYTES+ " bytes ");
        System.out.println(" Range : "+(int) Character.MIN_VALUE +" to "+ (int) Character.MAX_VALUE);


        System.out.println("\n");
        System.out.println("Boolean : ");
        System.out.println("  Size : 1 bytes ");
        System.out.println(" Range : "+Boolean.FALSE +" or "+ Boolean.TRUE);
    }
}
