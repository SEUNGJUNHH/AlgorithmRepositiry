import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        for(int i = 1; i<order.length+1;i++){
            if(order[count]==i)
            {   answer++;
                count++;
                continue;
                            }    
            if(order[count]==stack.peek().intValue()){                      
                stack.pop();
                answer++;
                count++;
                i--;
                continue;
            }
            stack.push(i);
        }
        for(int j=0;j<order.length-answer;j++){
            if(stack.peek().intValue()!=order[count])
                break;
            stack.pop();
            count++;
        }
        return count;
    }
}