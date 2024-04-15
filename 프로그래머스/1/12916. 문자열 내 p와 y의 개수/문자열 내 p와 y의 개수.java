class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int check =0;
        s=s.toLowerCase();
        for(int i =0; s.length()>i;i++){
            if(s.charAt(i)=='y') check--;
            else if(s.charAt(i)=='p') check++;
        }
        if(check!=0) return false;
        return answer;
    }
}