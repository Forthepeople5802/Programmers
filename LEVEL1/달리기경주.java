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
    /* 
     * 해쉬맵은 Bucket이라는 구조를 가지고 키를 찾는다.
     * Bucket에는 key로 생성한 Object와 해쉬코드를 쌍으로 들어있다.
     * 해쉬코드에는 순서가 있고 그 순서를 기반으로 값을 검색하기 때문에 키를 빠르게 찾을 수 있다.
     * 
     * 단점
     * 키, 값을 모두 저장해야하며 추가로 Bucket까지 생성해야하니 공간복잡도가 커지는 단점이 있다. 
     * 해쉬코드를 생성하는 과정 자체도 문제가 있을 수 있고 찾는 값이
     * 배열의 첫 원소라면 상황에 따라 배열의 검색속도가 더 빠른 경우도 있을 것이다.
     */

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
