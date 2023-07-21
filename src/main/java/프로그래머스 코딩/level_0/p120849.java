class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
/*
이 문제는 모음제거 문제이다.
영어에서(a,e,i,o,u) 모음을 제거하면된다 어떻게할까 고민하다
replaceAll이라는 함수를 사용해봤다.
my_string.replaceAll("[aeiou]",""); 해당 알파벳이 나오면 제거하여 출력하게 하였다.
 */