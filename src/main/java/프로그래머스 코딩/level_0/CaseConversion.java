package com.example.start;

import java.util.Scanner;

public class CaseConversion {
    public String solution(String str){
        String answer="";

        // 1) 답안지
//        for(char x : str.toCharArray()) {
//            if (Character.isLowerCase(x)) { // 만약 문자열이 소문자이면
//                answer += Character.toUpperCase(x); // 대문자로 변환
//
//            }else // 그 외 대문자들은
//                answer+= Character.toLowerCase(x); // 소문자로 변환
//
//        }

        // 2) 답안지 아스키코드(대소문자 변호)  이용
        for (char x : str.toCharArray()){
            if (x>=65 && x<=90){
                answer+=(char)(x+32);
            } else
                answer+=(char)(x-32);
        }
        return answer;
    }

    public static void main(String[] args){
        CaseConversion T = new CaseConversion();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}

