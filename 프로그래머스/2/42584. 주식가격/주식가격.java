class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i= 0 ; i<prices.length;i++){
            int check =prices[i];
            for(int j = i+1 ; j<prices.length;j++){
                if(check>prices[j]){
                 answer[i]=j-i;
                    break;
                }
            }
            if(answer[i]==0){
               answer[i] =prices.length-(i+1);
            }
        }
        return answer;
    }
}