import java.util.*;
class Solution {
    int[] answer = {0,0};
    public int[] solution(int n, String[] words) {
        
        Map<Integer,String> hash = new HashMap<Integer,String>();
        hash.put(0,words[0]);
        for(int i = 1; i<words.length;i++){
            if(words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)){
                result(n,i+1);
                break;
            }
            if(hash.containsValue(words[i])){
                 result(n,i+1);
                 break;
            }else hash.put(i,words[i]);
        }

        return answer;
    }
    public void result(int n , int count){
        if(count%n!=0){
            answer[0] = count%n;
            answer[1] = (count/n)+1;
        }else {
            answer[0] = n;
            answer[1] = (count/n);
        }
    }
}