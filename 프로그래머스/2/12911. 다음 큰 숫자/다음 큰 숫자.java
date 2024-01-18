import java.util.*;
class Solution {
    public int solution(int n) {
        int answer, count = 0;
        String binary = Integer.toBinaryString(n);
        for(int i = 0 ; i<binary.length();i++){
            if(binary.charAt(i)=='1') count++;
        }
        for(int i = n+1 ; ;i++){
           String binarys = Integer.toBinaryString(i);
            int check =0;
            for(int j = 0 ; j<binarys.length();j++){
                if(binarys.charAt(j)=='1') check++;
            }  
            if(check==count) {answer= i;break;}
        }
        
        return answer;
    }
}