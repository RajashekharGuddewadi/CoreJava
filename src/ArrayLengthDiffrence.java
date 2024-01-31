public class ArrayLengthDiffrence {
    public static void main(String[] args) {
        //------ length vs length() -------

        int[] x = new int[6];
       // System.out.println(x.length());  //gives compile time error because x is array variable so length method not applicable
        System.out.println(x.length); //6 length is final variable is applicable for array and represent size of array

        String s ="Rajkumar";
        //System.out.println(s.length); //gives Compile time error
        System.out.println(s.length());// length()  method is a final method applicable for string object and length() method written no of charter present in string

        String[] names = {"Raj","Kartik","Keshav","Parag"};
        System.out.println(names.length);
       // System.out.println(names.length()); // it is array not applicable length() method
       // System.out.println(names[0].length);// it is String not applicable length variable
        System.out.println(names[1].length());

        //in multidimensional array length variable represents only base size not total size
        int[][] m = new int[6][3];
        System.out.println(m.length); //6
        System.out.println(m[0].length); //3
        System.out.println(m[1].length); //3
    }
}
