package LEVEL1;

/**
 * 추억점수
 */
public class 추억점수 {
    public static void main(String[] args) {

        String[] name = {"may", "kein", "kain", "radi"};
        String[][] photo = {
            {"may", "kein", "kain", "radi"},
            {"may", "kein", "brin", "deny"},
            {"kon", "kain", "may", "coni"}
        };
        int[] yearning = {5, 10, 1, 3};

        Solution s =new  Solution();
        s.solution(name, yearning, photo);
    }

    static class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
         for (int i = 0; i < photo.length; i++) {
                int result = 0;
                for (int j = 0; j < photo[i].length; j++) {
                    for (int k = 0; k < name.length; k++) {
                        if (name[k].equals(photo[i][j])){
                            result += yearning[k];
                        }
                    }
                }
                System.out.println(result);
                answer[i] = result;
            }
        return answer;
    }
}
    
}
