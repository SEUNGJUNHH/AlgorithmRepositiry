import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    static ArrayList<Integer> check;
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int count = 0;
        check = new ArrayList<>();
        for (int i : score) {
            check.add(i);
        }
        check.sort(Comparator.reverseOrder());
        for(int i = 0;i<check.size();i++){
            count++;
            if(count==m){
            answer+=check.get(i)*m;
            count = 0;
            }

        }
        return answer;
    }
}