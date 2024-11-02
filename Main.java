import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static double lastResult = 0;
    public static ArrayList<Double> results = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean out = false;

        while (!out) {
            System.out.println("calculator menu: ");
            System.out.println("1-Addition");
            System.out.println("2-Subtraction");
            System.out.println("3-Multiplication");
            System.out.println("4-Division");
            System.out.println("5-Modulus");
            System.out.println("6-Find Minimum");
            System.out.println("7-Find Maximum");
            System.out.println("8-Find Average");
            System.out.println("9-Print Last Result");
            System.out.println("10-Print List of All Results");
            System.out.println("11-Exit");

            System.out.print("Enter your option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addNumbers(scanner);
                    break;
                case 2:
                    subNumbers(scanner);
                    break;
                case 3:
                    multipliNumbers(scanner);
                    break;
                case 4:
                    divisionNumbers(scanner);
                    break;
                case 5:
                    modulusNumbers(scanner);
                    break;
                case 6:
                    minimumNumbers(scanner);
                    break;
                case 7:
                    maximumNumbers(scanner);
                    break;
                case 8:
                    averageNumbers(scanner);
                    break;
                case 9:
                    System.out.println("Last Result: " + lastResult);
                    break;
                case 10:
                    System.out.println("All Results: " + results);
                    break;
                case 11:
                    out = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

    public static void addNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        lastResult = num1 + num2;
        results.add(lastResult);
        System.out.println("Result: " + lastResult);
    }

    public static void subNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        lastResult = num1 - num2;
        results.add(lastResult);
        System.out.println("Result: " + lastResult);
    }

    public static void multipliNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        lastResult = num1 * num2;
        results.add(lastResult);
        System.out.println("Result: " + lastResult);
    }

    public static void divisionNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            lastResult = num1 / num2;
            results.add(lastResult);
            System.out.println("Result: " + lastResult);
        } else {
            System.out.println("Error: division by zero!");
        }
    }

    public static void modulusNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        lastResult = num1 % num2;
        results.add(lastResult);
        System.out.println("Result: " + lastResult);
    }

    public static void minimumNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        if(num1<num2) {
            lastResult = num1;
        }else {
            lastResult = num2;
        }
        results.add(lastResult);
        System.out.println("Minimum: " + lastResult);
    }

    public static void maximumNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        if(num1>num2) {
            lastResult = num1;
        }else {
            lastResult = num2;
        }
        results.add(lastResult);
        System.out.println("Maximum: " + lastResult);
    }

    public static void averageNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        lastResult = (num1 + num2) / 2;
        results.add(lastResult);
        System.out.println("Average: " + lastResult);
    }
}