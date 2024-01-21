import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(true){
            if(n==0) break;
            if(n%2!=0){
                ans+=1;
                n -= 1;
            }
            else n=n/2;
        }

        return ans;
    }
}