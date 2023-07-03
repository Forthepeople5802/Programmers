package LEVEL1;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

// 시간복잡도 고민해봐야함...
public class 달리기경주 {
    
    public static void main(String[] args) {
        
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        
        String[] callings = {"kai", "kai", "mine", "mine"};
        Solution s = new Solution();
        String[] answer =  s.solution(players, callings);
        System.out.println(Arrays.toString(answer));
    }

    static class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
          List<String> pList = Arrays.asList(players);
        // ArrayList<String> pList = new ArrayList<>(Arrays.asList(players));
            for (int i = 0; i < callings.length; i++) {
                           
                String  name = callings[i];
                int idx = IntStream.range(0, pList.size())
                        .filter(j -> Objects.equals(pList.get(j), name))
                        .findFirst()
                        .orElse(-1);
            
                    if (idx > 0){
                        String temp = players[idx -1];
                        pList.set(idx - 1, callings[i]);
                        pList.set(idx, temp);
                        // pList.add(idx, callings[i]);
                        // pList.remove(idx);
                    }
                    
                }
            
            
            answer = pList.toArray(new String[pList.size()]);
        return answer;
    }
}

}
