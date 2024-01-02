import java.util.*;
class Solution {
    ArrayList<String> list= new ArrayList<String>();
    
    String[] example={"A", "E", "I", "O", "U"};

    public int solution(String word) {
        int answer = 0;
        recur("",0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(word)) {
                answer = i;
                break;
            }
            System.out.println(list.get(i));
        }
        return answer;
    }
    
    public void recur(String a, int depth){
        list.add(a);
        
        if(depth==5) return;
        for(int i=0;i<example.length;i++){
            recur(a+example[i],depth+1);
        }
        
    }
}