package org.example;
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        float sum = 0 ;
        float avg = 0 ;

        for(int i=0; i< numbers.length; i++){
            sum+=numbers[i];


        }
        avg = sum/numbers.length;
        answer = (float)avg;
        return answer;
    }
}