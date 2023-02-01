// Anar Gasimov
// CS111-B
// Programming exercise for Chapter 4

import java.util.Scanner;

public class ExerciseChapter4 {
    static Scanner input = new Scanner(System.in);
// areaCalc multiplies x(width) by y(height) to calculate area. It then outputs total area (double)
    static double areaCalc(double x, double y) {
        return x * y;
    }
// Main method - Ask user to input width and height. It then calls areaCalc with user input
// And finally, prints out the return value of areaCalc
    public static void main(String[] args) {
        System.out.print("Please enter width: ");
        double width = input.nextDouble();
        System.out.print("Please enter height: ");
        double height = input.nextDouble();
        System.out.println("Area is: " + areaCalc(width, height));

    }
}
/*
*****************
SAMPLE OUTPUT #1:
*****************

Please enter width: 54
Please enter height: 76
Area is: 4104.0


*****************
SAMPLE OUTPUT #2:
*****************

Please enter width: 7653.45
Please enter height: 432.887
Area is: 3313079.01015


*****************
SAMPLE OUTPUT #3:
*****************

Please enter width: 4500
Please enter height: 23.65
Area is: 106425.0


 */