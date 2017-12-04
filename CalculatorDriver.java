public class CalculatorDriver {
    public static void main(String[] args){
        System.out.println(Calculator.getAverage(1,2));
        System.out.println(Calculator.getProduct(2,2));

        double [] num = new double[4];
        num[0] = 3;
        num[1] = 4;
        num[2] = 5;
        num[3] = 6;

        System.out.println(Calculator.getProduct(num));


    }
}
