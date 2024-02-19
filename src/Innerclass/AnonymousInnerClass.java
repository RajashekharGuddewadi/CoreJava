package Innerclass;
interface MathOperation {
    int operate(int a, int b);
}

class Calculator {
    public void performOperation(int a, int b, MathOperation operation) {
        int result = operation.operate(a, b);
        System.out.println("Result: " + result);
    }

}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Anonymous Inner Class implementing the MathOperation interface for subtraction
        calculator.performOperation(10, 5, new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        });
        calculator.performOperation(10, 5, new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        });

    }
}
