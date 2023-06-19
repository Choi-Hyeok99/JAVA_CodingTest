class Solution {
    public int solution(String message) {
        int answer = message.length() * 2;

        return answer;
    }
}


    /*코드 설명 :
        1. 글자 한 자가 가로 2cm 크기이기 떄문에 편지지의 최소 가로길이는 message
        전체길이 * 2 를 곱하면 된다
        2. message.length() * 2 = answer 대입 */