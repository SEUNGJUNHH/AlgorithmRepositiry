import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int check =0;
        for(int i = 0; i<s.length();i++){
            if(i==0&&s.charAt(i)==')') return false;
            if(s.charAt(i)=='(') {
                check++;
                continue;
            }else check--;
            
            if(check<0) return false;
        }
        if(check!=0) return false;
        return answer;
    }
}