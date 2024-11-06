package Baekjoon4;

import Baekjoon4.Queue;
import java.util.Scanner;
/*
정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/

public class QueueController {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int commandCount = Integer.parseInt(sc.nextLine());

    Queue queue = new Queue();

    for (int i = 0; i < commandCount; i++) {
      String command = sc.nextLine();
      if (command.contains("push")) {
        String item = command.split(" ")[1]; //공백을 기준으로 명령어와 입력값 구분
        queue.push(item);
      } else if (command.equals("pop")) {
        queue.pop();
      } else if (command.equals("size")) {
        queue.size();
      } else if (command.equals("empty")) {
        queue.empty();
      } else if (command.equals("front")) {
        queue.front();
      } else if (command.equals("back")) {
        queue.back();
      } else {
        System.out.println("스택에 해당 명령이 없습니다.");
        System.exit(1);
      }
    }
  }
}
