import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack();
        for(int i= 0;arr.length>i;i++){
            if(i==0){
                stack.push(arr[i]);
                continue;
            }
            if(stack.peek()!=arr[i]){
                stack.push(arr[i]);
            }
        }
         int[] answer = new int[stack.size()];
        for(int j=stack.size()-1; 0<=j;j--){
            answer[j]=stack.pop();
        }

        return answer;
    }
}