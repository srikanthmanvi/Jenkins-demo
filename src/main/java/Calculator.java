/**
 * Created by smanvi on 6/22/17.
 */
public class Calculator {

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.add(1 ,2);
    }

    public int add(int a, int b) {
        int result = a +b;
        System.out.println(" Adding "+a+ ", "+b+ " = "+result);
        return result;
    }
}
