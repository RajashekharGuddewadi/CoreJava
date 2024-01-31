public class Test {
    public static void main(String[] args) {
       //integral literal
        int x=12; //decimal (base 10 allowed(0-9)
        int y=012;//octal   (base 8 allowed (0-7)
        int z=0x12;//hexadecimal (base 16 allowed 0 to 9 and a to f)
        System.out.println(x+" "+y+" "+z);

        //int x1=0786; integer number to large Compile time error
        int z1= 0XBeef;
        System.out.println(z1);
        //int z2= 0XBeer; cannot resolve Symbol r

        //floating point literals
        float a = 123.456f;
        double d = 123.456;
        double d1 = 0123.456;
        //double d2 = 0X123.456;
        double d2 = 0xFace;
        System.out.println(d2);

        //boolean leterals
        boolean b = true;
        /* boolean b1 = 0;
        boolean b2 = "true"; */
        System.out.println(b);

        //char leterals
        char ch = 'a';
        //char ch = a; // cannot find symbol
        //char ch1 = "a"; // incompatable type
       // char ch1='ab'; // to many character
        char ch1=9787;
        char ch2=0xFaae;
        System.out.println(ch+" "+ ch1+" "+ch2);

        char c = '\u5562';
        System.out.println(c);
        System.out.println("this is \" character");

        // binaray leterals 1.7 onwards (allowed digits are 1 and 0)
        int b1 = 0B101101101;
        System.out.println(b1);

        //uses of _symbol in nummeric leterals for good readability

        double d3 = 1_23_456.7_8_9;
        double d4 = 123_456.7_8_9;
        System.out.println(d3+"\n"+d4);

        int binary = 0b1111;
        System.out.println(binary);

    }
}
