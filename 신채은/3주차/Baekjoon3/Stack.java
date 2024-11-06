package Baekjoon3;

import java.util.List;
import java.util.ArrayList;

class Stack {

  List<String> stack = new ArrayList<>();
  String stackTop = "-1";

  public void push(String item) {
    stack.add(item);
    stackTop = item;
  }

  public int pop() {

    System.out.println(stackTop);

    if(stackTop.equals("-1")) { //스텍에 들어있는게 없으므로 아래 과정 진행 X 리턴
      return -1;
    }
    stack.remove(stack.size() - 1);
    if (stack.size() == 0) {
      stackTop = "-1"; //스텍 길이가 0이니까 top 초기화
    } else {
      stackTop = stack.get(stack.size() - 1);
    }
    return 0;
  }

  public void size() {
    System.out.println(stack.size());
  }

  public void empty() {
    if (stack.size() == 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

  public void top() {
    System.out.println(stackTop);
  }

}
