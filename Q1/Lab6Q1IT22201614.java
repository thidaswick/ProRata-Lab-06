import java.util.Scanner;

public class Lab6Q1IT22201614 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number;
        double square;
        double squareRoot;

        System.out.print("Enter a number: ");
        number = input.nextDouble();

        square = number * number;
        squareRoot = Math.sqrt(number);

        System.out.println();
        System.out.println("The square of " + number + " is: " + square);
        System.out.println("The square root of " + number + " is: " + squareRoot);
    }
}
