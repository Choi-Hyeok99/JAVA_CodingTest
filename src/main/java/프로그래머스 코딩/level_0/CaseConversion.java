import java.util.Scanner;

public class CaseConversion {
    public String solution(String str){
        String answer="";

        for(char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);

            }else
                answer+= Character.toLowerCase(x);

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

