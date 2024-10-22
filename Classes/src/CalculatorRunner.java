import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);;
        Calculator calculator = new Calculator();

        boolean continueCalculating = true;

        while(continueCalculating)
        {System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Choose an Operation + - / *");
            String operation = scanner.next();

           double result = 0;
           switch (operation)
           {
               case "+":
                    result= calculator.add(num1,num2);
                    break;
                case "-":
                    result= calculator.subtract(num1,num2);
                    break;

               case "*":
                   result=calculator.multiply(num1,num2);
                   break;

               case "/":
                   result = calculator.divide(num1,num2);
                   break;
               default:
                   System.out.println("invalid operation selected");
                   break;
           }

        System.out.println("The result is: " + result);

        System.out.println("Do you want another calculation? yes/no");
        String userResponse = scanner.next();

        if(userResponse.equalsIgnoreCase("no"))
        {continueCalculating=false;
        }
        }
        System.out.println("Calculator exiting. Bye");
        scanner.close();}
}
