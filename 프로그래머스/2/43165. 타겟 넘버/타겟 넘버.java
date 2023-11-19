import java.util.Arrays;

class Solution {
    int[] numbers;
    int target;
    int answer;
    public void bfs(int depth, int sum){
        //조건
        if(numbers.length==depth){
            if(sum==target)
                answer++;
            return;
        }

        //수행
        depth+=1;
        bfs(depth,sum+numbers[depth-1]);
        bfs(depth,sum-numbers[depth-1]);
    }
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        bfs(0,0);
        return answer;
    }


}
