package LEVEL1;

import java.util.ArrayList;

public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        
        String  t = "3141592";
        String  p = "271";
        Solution s = new Solution();
        // int answer =  s.solution(t, p);
        long a = 0;
        
    }
    /* 
     * p의 길이 ≤ t의 길이 ≤ 10,000
     * 문자열길이 때문에 자료형 int -> long으로
     * 
     */

    static class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLeng = t.length();
        int pLeng = p.length();

        for (int i = 0; i <= tLeng - pLeng  ; i++) {
            String temp = t.substring(i, i + pLeng);
            // int tInt = Integer.parseInt(temp);       // 런타임 에러;;; 발생
            // int pInt = Integer.parseInt(p);

            long tLong = Long.parseLong(temp);
            long pLong = Long.parseLong(p);

            if (tLong <= pLong) {
                answer++;
            }
        }

        System.out.println(answer);

        return answer;
    }
}

    
}
