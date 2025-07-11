import java.io.*;
class ArithmeticJava {
    public static void main(String[] args)
    {
        int number1 = 100;
        int number2 = 0;

        try {
            // code that may throw an exception
            int answer = number1 / number2;
            System.out.println("Answer: " + answer);
        } catch (ArithmeticException e) {
             // code to handle the exception
            System.out.println(
                "Error: Division by zero is not allowed!"
            );
        }
        finally {
            // code that will always execute
            System.out.println("Program continues after handling the exception.");
        }
        
    }
}
