class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int x;
        int y = 3;
        while(true){
            x =(brown/2)-(y-2);
            if(x*y-brown==yellow){
                answer[0]=x;
                answer[1]=y;
                break;
            } 
            y++;
        }
        
        return answer;
    }
}