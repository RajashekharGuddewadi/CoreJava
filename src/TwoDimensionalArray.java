public class TwoDimensionalArray {
    public  static  void main(String[] args){
        System.out.println("Hello World");
        //arrays of Array
        //---- Two Dimensional Array Creation
        //in java Two Dimensional array not implemented matrix from
        // some people followed array ao arrays approach for multidimensional array creation
        //main Advantage of these approach is memory utilization will be improved

        //example 1
        int[][] x = new int[2][];
        x[0] = new int[2];
        x[1] = new int[3];

        //example 2
        int[][][] y = new int[2][][];
        y[0] = new int[3][];
        y[0][0]=new int[1];
        y[0][1]=new int[2];
        y[0][2]=new int[3];
        y[1]= new int[2][2];

        // arrays declaration

        /*
        int[] a = new int[]; // not valid
        int[] b = new int[3]; // valid
        int[][] c = new int[][]; // not valid
        int[][] d = new int[3][]; //valid
        int[][] e = new int[][4]; //not valid
        int[][] f = new int[3][4]; // valid
        int[][][] g = new int[3][4][5]; //valid
        int[][][] h = new int[3][4][]; //valid
        int[][][] i = new int[3][][5]; //not valid
        int[][][] j = new int[][4][5]; //not valid
         */

        //Arrays Initialization
        //once we can create every arrays element by default initialize with default value
        int[]  z = new int[3];
        System.out.println(z); // whenever we're trying to print any reference variable internally to string method will be called which is implemented by default to written string following form classname@hashcodein hexadecimal form
        System.out.println(z[0]+" "+z[1]+" "+z[2]);

        int[][] a = new int[2][3];
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[0][0]);

        int[][] b = new int[3][];
        System.out.println(b);
        System.out.println(b[0]); // if you perform any operation on null then we will get null pointer exception
        //System.out.println(b[0][0]);

        //once we create arrays every arrays elements by default initializer with  default values if we are not satisfied with default values then we can override with over customized values
        int[] c = new int[6];
        c[0]=10;
        c[1]=20;
        c[2]=30;
        c[3]=40;
        c[4]=50;
        c[5]=60;

        //Array Declaration,Creation and Initialization in a single line
        //we can declare,create and initialize in a single line(shortcut representation)
        int[] d = {10,20,30};
        char[] ch = {'a','e','i','o','u'};
        String[] str = {"Kartik","Raj","Keshav"};

        //twoDimensional Array
        int[][] e ={{10,20},{30,40,50}};

        //ThreeDimensional Array
        int[][][] f = {{{10,20,30},{40,50,60}} ,{{70,80},{90,100,110}}};
        System.out.println(f[0][1][1]);







    }
}
