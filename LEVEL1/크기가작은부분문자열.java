package LEVEL1;

import java.util.ArrayList;

public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        
        String  t = "3141592";
        String  p = "271";
        Solution s = new Solution();
        int answer =  s.solution(t, p);
    }

    // 런타임 에러;;; 발생
    static class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLeng = t.length();
        int pLeng = p.length();
        // ArrayList<Long> pList = new ArrayList<>();

        if (tLeng > pLeng){
            for (int i = 0; i <= tLeng - pLeng ; i++) {
                String temp = t.substring(i, i + pLeng);
                // int tInt = Integer.parseInt(temp);
                // int pInt = Integer.parseInt(p);
                long tLong = Long.parseLong(temp);
                long pLong = Long.parseLong(p);

                if (tLong <= pLong) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
        // answer = pList.size();

        return answer;
    }
}

    
}
