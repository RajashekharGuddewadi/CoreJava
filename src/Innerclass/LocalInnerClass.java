package Innerclass;
import java.util.Random;

 class Game {
    private int[][] Byte;
    private int rows;
    private int cols;

    public void generateBytes(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        // Local Inner Class
        class ByteGenerator {
            private Random random = new Random();

            public int[][] generate() {
                int[][] Byte = new int[rows][cols];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        Byte[i][j] = random.nextInt(2); // Randomly set cell to 0 or 1
                    }
                }
                return Byte;
            }
        }

        // Instantiate the local inner class
        ByteGenerator byteGenerator = new ByteGenerator();
        Byte = byteGenerator.generate();
    }

    public void displayMatrix() {
        if (Byte == null) {
            System.out.println("Matrix has not been generated yet.");
            return;
        }

        System.out.println("Generated Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(Byte[i][j] + " ");
            }
            System.out.println();
        }
    }

}


public class LocalInnerClass {
    public static void main(String[] args) {
        Game game = new Game();
        game.generateBytes(3, 3);
        game.displayMatrix();
    }
}
