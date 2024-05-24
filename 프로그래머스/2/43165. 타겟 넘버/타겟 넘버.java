import java.util.Arrays;

class Solution {
    int[] number;
    int targets;
    int answer;
    public void rec(int depth, int sum){
        if(depth == number.length){
            if(sum==targets)
                answer++;
            return;
        }
        depth++;
        rec(depth,sum+number[depth-1]);
        rec(depth,sum-number[depth-1]);
        
    }
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        number = numbers;
        targets = target;
        rec(0,0);
        return answer;
    }


}
