Mathematics Faculty has given the assignment to his student to write java code to handle ArithmeticException and InputMismatchException exception when user is passing two input to perform Arithmetic operation(+,-,*,/). The result should be display on screen when no exception raised.

If user pass the second input as 0(zero) than display the massage "second number must be non zero".

If the user pass the second input as non-integer number than display the massage “second number must be numeric”.

Input Format

Line 1 Read first number x
Line 2 Read second number y
Line 3 Read the arithmetic opratoer

Constraints

x , y > 0

Output Format

Display the result of arithmetic operation /or handle Exception

Sample Input 0

6
2
+
Sample Output 0

8
Sample Input 1

8
0
/
Sample Output 1

second number must be non zero 


solution :- 


import java.util.Scanner;
import java.util.InputMismatchException;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("");
            int x = sc.nextInt();
            System.out.print("");
            int y = sc.nextInt();
            System.out.print("");
            char op = sc.next().charAt(0);
            int result = 0;
            switch (op) {
                case '+':
                    result = x + y;
                    break;
                case '-':
                    result = x - y;
                    break;
                case '*':
                    result = x * y;
                    break;
                case '/':
                    if (y == 0) {
                        throw new ArithmeticException("second number must be non zero");
                    }
                    result = x / y;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator");
            }
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("second number must be numeric");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

















