import java.util.*;
import java.io.*;

public class Stacks {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1.Push  2.Pop  3.Peek  4.Search  5.Display  6.Exit");

            int ch = s.nextInt();
            s.nextLine(); // consume newline

            switch (ch) {

                case 1:
                    // Implementing Stacks (User Defined)
                    System.out.println("Enter element to push:");
                    String str = s.nextLine();
                    stack.push(str);
                    break;

                case 2:
                    if (!stack.isEmpty())
                        System.out.println("The element deleted is: " + stack.pop());
                    else
                        System.out.println("Stack is empty");
                    break;

                case 3:
                    if (!stack.isEmpty())
                        System.out.println("The element at top is: " + stack.peek());
                    else
                        System.out.println("Stack is empty");
                    break;

                case 4:
                    System.out.println("Enter the element to be searched:");
                    str = s.nextLine();
                    System.out.println("Position: " + stack.search(str));
                    break;

                case 5:
                    Enumeration<String> e = stack.elements();
                    while (e.hasMoreElements())
                        System.out.println(e.nextElement());
                    break;

                default:
                    return;
            }
        }
    }
}
