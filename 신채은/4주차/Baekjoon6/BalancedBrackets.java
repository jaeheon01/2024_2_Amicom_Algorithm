package Baekjoon6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String userInput = br.readLine();
            if (userInput.equals(".")) {
                break;
            }

            if(isBalanced(userInput)) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }

    private static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            } else if (ch == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            }
        }


        return stack.isEmpty();
    }
}