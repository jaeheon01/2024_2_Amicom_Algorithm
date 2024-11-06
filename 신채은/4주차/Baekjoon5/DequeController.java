package Baekjoon5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeController  {
    static Deque<String> arrayDeque = new ArrayDeque<>();

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeatCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeatCount; i++) {

            String input = br.readLine();

            if(input.contains("push_front")){
                arrayDeque.addFirst(input.split(" ")[1]);
            }else if(input.contains("push_back")){
                arrayDeque.addLast(input.split(" ")[1]);
            }else if(input.contains("pop_front")){
                try{
                    System.out.println(arrayDeque.pop());
                } catch (Exception e){
                   System.out.println(-1);
                }
            }else if(input.contains("pop_back")){
                try{
                    System.out.println(arrayDeque.removeLast());
                }catch (Exception e){
                    System.out.println(-1);
                }
            }else if(input.contains("size")){
                System.out.println(arrayDeque.size());
            }else if(input.contains("empty")){
                printEmpty(arrayDeque.isEmpty());
            }else if(input.contains("front")){
                printFront();
            }else if(input.contains("back")){
                printBack();
            }else{
                System.out.println("정상적인 입력이 아닙니다.");
                System.exit(-1);
            }

        }
    }

    private static void printEmpty(boolean isEmpty){
        if(isEmpty){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    private static  void printFront() {
        if (arrayDeque.peekFirst() == null) {
            System.out.println(-1);
        } else {
            System.out.println(arrayDeque.peekFirst());
        }
    }

    private static  void printBack() {
        if (arrayDeque.peekLast() == null) {
            System.out.println(-1);
        } else {
            System.out.println(arrayDeque.peekLast());
        }
    }
}
