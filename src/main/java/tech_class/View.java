package tech_class;

public class View {

    /**
     * Method shows the results of math expression: "input[0]" "math symbol" "input[1]" = "input[2]".
     * @param input - int[3], input[0] - first number, input[1] - second number, input[2] - result.
     * @param symbol - math symbol of expression.
     */
    public void ShowResult(int[] input, char symbol){
        System.out.println(input[0] + " " + symbol + " " + input[1] + " = " + input[2]);
    }

    /**
     * Method shows the results of math expression: "input[0]" "math symbol" "input[1]" = "input[2]".
     * @param input - double[3], double[0] - first number, double[1] - second number, double[2] - result.
     * @param symbol - math symbol of expression.
     */
    public void ShowResult(double[] input, char symbol){
        System.out.println(String.format("%.2f", input[0]) + " " + symbol + " " + String.format("%.2f",input[1]) + " = " + String.format("%.2f",input[2]));
    }
}
