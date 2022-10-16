class EvenOdd {
    public String EvenOdd(int num) {
        String answer = "";
        if (num%2 == 0){
            answer = "Even";
        }
        else {
            answer = "Odd";
        }
        return answer;
    }
}