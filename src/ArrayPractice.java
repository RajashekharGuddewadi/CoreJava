//arrays are indexed collection
//----limitations----
// arrays are in fixed in Size
//once creation of array there no chance of increase and decrease of size of arrays
// arrays can hold only homogenous data element

//----advantages-----
//we can represent huge number values in Single variable
// so readability of code will improve
public class ArrayPractice {
    public static void main(String[] args) {
        //Array declaration(one dimensional)
        int[] x; //best way to declare name is clearly separated from type
        int []x1;
        int x2[];

        //int[6] x; in arrays declaration  we cant specify the size other wise we get compile time error
        //Array declaration(two dimensional)
        int[][] y;
        int [][]y1;
        int y2[][];
        int[] []y3;
        int[] y4[];
        int []y5[];

        //int[] []a,[]b; if we declare dimension before variable this rule only applicable for first variable;
        //Array declaration(three dimensional)

        int[][][] z;
        int [][][]z1;
        int z2[][][];
        int[] [][]z3;
        int[] z4[][];
        int[] []z5[];
        int[][] z6[];
        //so on

        // Arrays Creation
        //every array in java is an object only hence we can create arrays using new operator
        //every array type corresponding classes are available but in java lang not available for programmer level
        //at the time of array creation we should specify the size otherwise we get compile time error
        int[] a = new int[3];
        System.out.println(a.getClass().getName()); //output [I
        int[][] a1 = new int[3][3];
        System.out.println(a1.getClass().getName()); //output [[I
        double[] D = new double[5];
        System.out.println(D.getClass().getName());  //output [D
        boolean[] B = new boolean[5];
        System.out.println(B.getClass().getName()); //output [Z

        int[] a2 = new int[0]; // valid array with zero size

        System.out.println(args.length); // output gives 0

        //int[] n = new int[-3]; //No Compile type error // give runtime exception RE:NegativeArraySizeException

        // to Specify array Size to allowed data types are by short, char, int if trying to specify and other datatype then we will gwt compile time error
        int[] c = new int['a'];//
        byte b = 20;
        int[] c1 = new int[b];
        short s =30;
        int[] c2 = new int[s];
       // int[] c3 = new int[10l]; // Compile time error

        // Maximum allowed array size in java is 2147483647 which is maximum value of int data type
        //int[] max = new int[2147483647]; // may be occurs Size vm limits // OutOfMemoryError
        //System.out.println(max.length);
        //int[] max1 = new int[2147483648]; // integer number to large
    }
}
