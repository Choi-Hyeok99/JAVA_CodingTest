class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        sb.reverse();
        answer = sb.toString();
        return answer;
    }
}

/*
문자열 뒤집기 해결방법은 for문을 이용한 방법이랑 reverse를 이용해 문제를 해결할 수 있다.
이번에는 reverse를 이용한 방법을 이용하였다.
StringBuilder sb = new StringBuilder(my_string) 객체를 생성해
sb.reverse(); 사용하였고
toString을 사용하여 뒤집힌 문자열을 다시 문자열로 형태 변환하고 answer에 넣는다
그리고 return answer하여 마무리했다.

 */