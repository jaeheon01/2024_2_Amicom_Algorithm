package Baekjoon3;

import java.util.Scanner;

public class StackController {
  /*
    정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
    명령은 총 다섯 가지이다.

    push X: 정수 X를 스택에 넣는 연산이다.
    pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    size: 스택에 들어있는 정수의 개수를 출력한다.
    empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int commandCount = Integer.parseInt(sc.nextLine());
        
        Stack stack = new Stack();
        
        for (int i = 0; i < commandCount; i++) {
            String command = sc.nextLine();
            if (command.contains("push")) {
                String item = command.split(" ")[1]; //공백을 기준으로 명령어와 입력값 구분
                stack.push(item);
            }else if (command.equals("pop")) {
                stack.pop();
            }else if(command.equals("size")) {
                stack.size();
            }
            else if (command.equals("empty")) {
                stack.empty();
            }else if (command.equals("top")) {
                stack.top();
            }else{
                System.out.println("스택에 해당 명령이 없습니다.");
                System.exit(1);
            }
        }
    }

}
