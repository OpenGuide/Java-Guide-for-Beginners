import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Program to convert infix expression to postfix.
 * Input format :- there have to be spaces in between numbers and mathematical signs
 * + - * / % ^ ( ) are considered.
 * example of input :-      a * b - c / d * ( e - f ) ^ g + h
 * example of output :-     a b * c d / e f - g ^ * - h +
 */
public class infix_to_postfix
{
    public static int precedence(String sign)
    {
        switch (sign) {
            case "+":
            case "-":
                return 0;
            case "*":
            case "/":
                return 1;
            case "%":
                return 2;
            case "^":
                return 3;
            case "(":
            case ")":
                return 4;
            default:
                return 5;
        }
    }

    public static void main(String[] args)
    {
        String St, i;
        Scanner Sc = new Scanner (System.in);
        Stack stack = new Stack();
        St = Sc.nextLine();
        StringTokenizer obj = new StringTokenizer(St);
        for (St = obj.nextToken(); obj.hasMoreTokens(); St = obj.nextToken()) {
            if (St.equals("(")) {
                stack.push (St);
                continue;
            }
            if (St.equals(")")) {
                for (i = stack.top(); !stack.is_empty(); stack.pop(), i = stack.top()) {
                    if (i.equals("(")) {
                        stack.pop();
                        break;
                    } else {
                        System.out.print(i + " ");
                    }
                }
                continue;
            }
            if (St.equals("+") || St.equals("-") || St.equals("*") || St.equals("/") || St.equals("%") || St.equals("^")) {
                for ( ; !stack.is_empty(); ) {
                    i = stack.top();
                    if (i.equals("(")) {
                        break;
                    }
                    if (precedence (i) >= precedence (St)) {
                        System.out.print(i + " ");
                        stack.pop();
                    } else {
                        break;
                    }
                }
                stack.push (St);
            } else {
                System.out.print(St + " ");
            }
        }
        System.out.print(St + " ");
        for ( ; !stack.is_empty(); stack.pop()) {
            System.out.print(stack.top() + " ");
        }
    }
}
class Stack {
    private String[] arr;
    private int size;
    public Stack()
    {
        size = 0;
        arr = new String[10000];
    }
    public String top()
    {
        return arr[size - 1];
    }
    public void pop()
    {
        --size;
    }
    public void push (String val)
    {
        arr[size] = val;
        ++size;
    }
    public boolean is_empty()
    {
        return size == 0;
    }
}
