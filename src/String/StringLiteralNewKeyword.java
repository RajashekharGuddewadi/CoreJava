package String;

public class StringLiteralNewKeyword {
    public static void main(String[] args) {
        String s ="Rajshekhar"; // String Literal

        String s1 = new String("Rajshekhar Guddewadi");

        System.out.println(s);
        System.out.println(s1+" "+s1.length()+" substring : "+s1.substring(3));
        System.out.println(s1.contains("Raj")+" "+s1.contains("m"));
        System.out.println(s.equals(s1));
        System.out.println(s.charAt(2)+" "+s.length()+"is empty "+s.isEmpty());
    }
}
