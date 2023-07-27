import java.util.Scanner;

public class FindText {
    public int solution(String str , char t) {
        int answer = 0;

        str=str.toUpperCase(); // String이 다 대문자로 변경
        t=Character.toUpperCase(t);


        // 1) 1번 답안지
        /*for(int i = 0 ; i< str.length(); i ++ ){
            if(str.charAt(i)==t)
                answer++;
        }*/

        // 2) 답안지 String을

        for(char x : str.toCharArray()) // String을 문자배열로 생성
            if(x==t)
                answer++;

        return answer;
    }

    public static void main(String[] args){
        FindText T = new FindText();

        Scanner kb = new Scanner(System.in);
        String str= kb.next();
        char c=kb.next().charAt(0);

        System.out.print(T.solution(str, c));
    }
}
