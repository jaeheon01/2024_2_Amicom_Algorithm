import java.util.Scanner;

public class Baekjoon1 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        int [] countArray = new int[26];

        //소문자 알파벳 문자열
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        //입력된 문자열의 길이만큼 순회
        for (int i = 0; i < S.length(); i++) {
            //i 위치에서의 문자, contains 메서드를 위해 string으로 변환
            String target = String.valueOf(S.charAt(i));  
            
            //알파벳 문자열에 타깃이 포함되어 있는 경우 배열에 타깃의 위치인 인덱스로 접근하여 개수 카운트 
            if(alphabet.contains(target)){
                int index = alphabet.indexOf(target);
                countArray[index] += 1;
            }
        }

        for (int j = 0; j < countArray.length; j++) {
            //배열 길이만큼 순회 하며 각 알파벳 개수 출력
            System.out.print(countArray[j]+" ");
        }
        sc.close();
    }
}
