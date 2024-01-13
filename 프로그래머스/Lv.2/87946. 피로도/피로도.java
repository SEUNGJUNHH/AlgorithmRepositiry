import java.util.*;
class Solution {
    int count=0;
    public int solution(int k, int[][] dungeons) {
        boolean[] check = new boolean[dungeons.length];
        int endPoint = 0;
        rec(k,dungeons, check, count,endPoint);
        return count;
    }

    public void rec(int k,int[][] dungeons, boolean[] check,int count1,int endPoint) {
        for(int i = 0; i<dungeons.length;i++){
            if(k<0||endPoint==dungeons.length) count = Math.max(count,count1);
            if(!check[i]){
                if(k-dungeons[i][0]>=0){
                    boolean[] recent = check.clone();
                    recent[i] = true;
                    rec(k-dungeons[i][1],dungeons,recent,count1+1,endPoint+1);
                }
            }
        }
        count = Math.max(count,count1);
    }

}