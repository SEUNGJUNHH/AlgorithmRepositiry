
import java.util.*; 

class Solution {
       
       
    public int[] solution(int[] progresses, int[] speeds) {
        int check = 0;
        int count = 0;
        Queue<Integer> queue1 = new LinkedList<>();
        List<Integer> list = new ArrayList();
        for(int i=0; progresses.length>i;i++){
            check = (int) Math.ceil((100-progresses[i])/(double)speeds[i]);
            queue1.add(check);
        }
        
        while(!queue1.isEmpty()){
            check = queue1.poll();
            list.add(1);
            while(!queue1.isEmpty()&&check>=queue1.peek()){
                queue1.poll();
                list.set(count,list.get(count)+1);
        }
            count++;
        }
         int[] answer = new int[list.size()];  
        for(int i=0;answer.length>i;i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}