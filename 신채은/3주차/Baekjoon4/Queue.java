package Baekjoon4;

import java.util.ArrayList;
import java.util.List;

class Queue {
  List<String> queue = new ArrayList<>();
  String queueFront = "-1";
  String queueBack = "-1";

  public void push(String item) {
    queue.add(item);
    if(queueFront.equals("-1")) { //큐에 아무것도 들어오지 않은 경우
      queueFront = item;
    }
    queueBack = item;
  }

  public int pop() {

    System.out.println(queueFront);

    if(queueFront.equals("-1")) { //들어있는게 없으므로 아래 과정 진행 X 리턴
      return -1;
    }

    queue.remove(0);

    if (queue.size() == 0) {
      queueFront = "-1"; //길이가 0이니까 초기화
      queueBack = "-1";
    } else {
      queueFront = queue.get(0);
    }
    return 0;
  }

  public void size() {
    System.out.println(queue.size());
  }

  public void empty() {
    if (queue.size() == 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

  public void front() {
    System.out.println(queueFront);
  }

  public void back() {
    System.out.println(queueBack);
  }
}
