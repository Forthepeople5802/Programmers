package LEVEL1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;


public class 달리기경주 {
    
    public static void main(String[] args) {
        
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        
        String[] callings = {"kai", "kai", "mine", "mine"};
        Solution s = new Solution();
        String[] answer =  s.solution(players, callings);
        System.out.println(Arrays.toString(answer));
    }

    // Array 탐색.. 시간 초과
    // map으로 변경
    static class Solution {
        public String[] solution(String[] players, String[] callings) {
            String[] answer = {};
            Map<String, Integer> pMap = new HashMap<>();
            for (int i = 0; i < players.length; i++) {
                pMap.put(players[i], i);
            }

            for (int i = 0; i < callings.length; i++) {
                int idx = pMap.get(callings[i]);
                String temp = players[idx-1];
                players[idx-1] = players[idx];
                players[idx] = temp;

                pMap.put(callings[i], idx-1);
                pMap.put(temp, pMap.get(temp)+1);

            }

            // ArrayList<String> pList = new ArrayList<>(Arrays.asList(players));
            // for (int i = 0; i < callings.length; i++) {
                            
            //     String  name = callings[i];
            //     int idx = IntStream.range(0, pList.size())
            //             .filter(j -> Objects.equals(pList.get(j), name))
            //             .findFirst()
            //             .orElse(-1);
            
            //     if (idx > 0){
            //         String temp = players[idx -1];
            //         pList.set(idx - 1, callings[i]);
            //         pList.set(idx, temp);
            //         // pList.add(idx, callings[i]);
            //         // pList.remove(idx);
            //     }
                    
            // }
                
                
            return players;
        }
    }

}
