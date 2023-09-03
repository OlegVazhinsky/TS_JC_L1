package tech_class;

import java.sql.Array;

public class Model {

    /**
     * Method adds int num_1 and int num_2.
     * @param num_1 - int, first number.
     * @param num_2 - int, second number.
     * @return result - int[], first number, second number and their addition.
     */
    public int[] Add(int num_1, int num_2){
        int[] result = new int[3];
        result[0] = num_1;
        result[1] = num_2;
        result[2] = num_1 + num_2;
        return result;
    }

    /**
     * Method adds double num_1 and double num_2.
     * @param num_1 - double, first number.
     * @param num_2 - double, second number.
     * @return result - double[], first number, second number and their addition.
     */
    public double[] Add(double num_1, double num_2){
        double[] result = new double[3];
        result[0] = num_1;
        result[1] = num_2;
        result[2] = num_1 + num_2;
        return result;
    }

    /**
     * Method substraits int num_2 from int num_1.
     * @param num_1 - int, first number.
     * @param num_2 - int, second number.
     * @return result - int[], first number, second number and their substraction.
     */
    public int[] Subs(int num_1, int num_2){
        int[] result = new int[3];
        result[0] = num_1;
        result[1] = num_2;
        result[2] = num_1 - num_2;
        return result;
    }

    /**
     * Method substraits double num_2 from double num_1.
     * @param num_1 - double, first number.
     * @param num_2 - double, second number.
     * @return result - double[], first number, second number and their substraction.
     */
    public double[] Subs(double num_1, double num_2){
        double[] result = new double[3];
        result[0] = num_1;
        result[1] = num_2;
        result[2] = num_1 - num_2;
        return result;
    }

    /**
     * Method multiplicates int num_1 and int num_2.
     * @param num_1 - int, first number.
     * @param num_2 - int, second number.
     * @return result - int[], first number, second number and their multiplicationtion.
     */
    public int[] Mult(int num_1, int num_2){
        int[] result = new int[3];
        result[0] = num_1;
        result[1] = num_2;
        result[2] = num_1 * num_2;
        return result;
    }

    /**
     * Method multiplicates double num_1 and double num_2.
     * @param num_1 - double, first number.
     * @param num_2 - double, second number.
     * @return result - double[], first number, second number and their multiplicationtion.
     */
    public double[] Mult(double num_1, double num_2){
        double[] result = new double[3];
        result[0] = num_1;
        result[1] = num_2;
        result[2] = num_1 * num_2;
        return result;
    }

    /**
     * Method divides int num_1 on int num_2.
     * @param num_1 - int, first number.
     * @param num_2 - int, second number.
     * @return result - int[], first number, second number and their division.
     */
    public int[] Div(int num_1, int num_2){
        int[] result = new int[3];
        result[0] = num_1;
        result[1] = num_2;
        result[2] = num_1 / num_2;
        return result;
    }

    /**
     * Method divides double num_1 on double num_2.
     * @param num_1 - double, first number.
     * @param num_2 - double, second number.
     * @return result - double[], first number, second number and their division.
     */
    public double[] Div(double num_1, double num_2){
        double[] result = new double[3];
        result[0] = num_1;
        result[1] = num_2;
        result[2] = num_1 / num_2;
        return result;
    }

}
