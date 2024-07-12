import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        boolean check = false;
        for(int i = 0; i<targets.length; i++){
            int ans = 0;
            for(int k =0; k< targets[i].length(); k++){
                char ch = targets[i].charAt(k);
                int sum = 20000000;
                for(int j = 0; j<keymap.length;j++){
                     int a = keymap[j].indexOf(ch)+1;
                 if(a!=0){
                        sum=Math.min(a,sum);
                    }
                }
                ans += sum;
            }
            if(ans<20000000) answer[i] = ans;
            else answer[i] = -1;
        }
        return answer;
    }
}