package org.example;

public class App {
    public static void main(String[] args) {

if(args.length != 3) {
    System.out.println("oh no, there more, that three arguments");
}

            double num1 = Double.parseDouble(args[0]);
            String operation = args[1];
            double num2 = Double.parseDouble(args[2]);


                double result = 0;
                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "x":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("You can't divide by zero");
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operation");
                        break;
                }
                System.out.println("Result: " + result);
        }

    }

