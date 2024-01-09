import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int size = people.length-1;
        for(int i =0; i<=size;i++){
            if(people[size]+people[i]<=limit){
                answer ++;
                size --;
                continue;
            }else {
                answer++;
                i--;
                size--;
            }
            
        }
        return answer;
    }
}