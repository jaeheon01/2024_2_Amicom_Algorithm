import java.io.*;

class Node {
    char data;
    Node prev;
    Node next;

    Node(char data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;
    Node cursor; // 커서의 위치를 나타내는 노드

    DoublyLinkedList() {
        head = new Node('.'); 
        tail = new Node('.'); 
        head.next = tail;
        tail.prev = head;
        cursor = tail; // 처음에는 커서가 끝에 위치
    }

    // 커서 왼쪽에 문자 삽입
    void P(char c) {
        Node newNode = new Node(c);
        Node left = cursor.prev;
        
        left.next = newNode;
        newNode.prev = left;
        newNode.next = cursor;
        cursor.prev = newNode;
    }

    // 커서 왼쪽에 있는 문자 삭제
    void B() {
        if (cursor.prev == head) return; // 커서가 맨 앞이면 무시
        Node toDelete = cursor.prev;
        Node left = toDelete.prev;

        left.next = cursor;
        cursor.prev = left;
    }

    // 커서를 왼쪽으로 이동
    void L() {
        if (cursor.prev != head) {
            cursor = cursor.prev;
        }
    }

    // 커서를 오른쪽으로 이동
    void R() {
        if (cursor != tail) {
            cursor = cursor.next;
        }
    }

    // 리스트 출력
    void printList() {
        Node current = head.next;
        StringBuilder sb = new StringBuilder();
        while (current != tail) {
            sb.append(current.data);
            current = current.next;
        }
        System.out.println(sb.toString());
    }
}

public class BaeKjoon2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Scanner 쓰니까 시간 초과남

        
        String initialString = br.readLine();
        
       
        int M = Integer.parseInt(br.readLine());
        
        // 이중 연결 리스트 객체 생성
        DoublyLinkedList editor = new DoublyLinkedList();

        // 초기 문자열을 리스트에 삽입
        for (char c : initialString.toCharArray()) {
            editor.P(c);
        }

        // 명령어 처리
        for (int i = 0; i < M; i++) {
            String command = br.readLine();

            if(command.charAt(0) == 'L'){
                editor.L();
            } else if (command.charAt(0) == 'D') {
                editor.R();
            } else if (command.charAt(0) == 'B') {
                editor.B();
            } else if (command.charAt(0) == 'P') {
                editor.P(command.charAt(2));
            }
        }

        // 최종 리스트 출력
        editor.printList();
    }
}
