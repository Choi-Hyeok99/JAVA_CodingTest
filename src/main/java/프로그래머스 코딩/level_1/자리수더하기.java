import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = String.valueOf(n);

        for(int i =0; i < a.length(); i ++){
            answer += Integer.parseInt(a.substring(i,i+1));
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("hoho");

        return answer;
    }
}