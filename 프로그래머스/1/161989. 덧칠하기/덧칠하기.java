import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<section.length;i++){
            queue.add(section[i]);
        }
        int start = queue.poll();
        answer++;
        while(!queue.isEmpty()){
            if(queue.peek()<start+m){
                queue.poll();
            }else{
                if(queue.size()==1) {
                    answer++;
                    break;
                }else{
                    start = queue.poll();
                    answer++;
                }
            }
            
        }
        return answer;
    }
}