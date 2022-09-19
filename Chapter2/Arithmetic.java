package Chapter2;


public class Arithmetic {

    private int num1;
    private int num2;
    public int setNum1(int num1) {
        return num1;
    }

    public int setNum2(int num2) {
        return num2;
    }

    public int squareNum1(int num1) {
        return (int) Math.pow(num1,2);
    }

    public int squareNum2(int num2) {
        return (int) Math.pow(num2,2);
    }

    public int sumOfSquare(int num1, int num2) {
        int num1Sqrt = (int) Math.pow(num1,2);
        int num2Sqrt = (int) Math.pow(num2,2);

        return num1Sqrt + num2Sqrt;
    }


    public int differenceSquare(int num1, int num2) {
        int num1Sqrt = (int) Math.pow(num1,2);
        int num2Sqrt = (int) Math.pow(num2,2);
        return num1Sqrt - num2Sqrt;
    }
}
