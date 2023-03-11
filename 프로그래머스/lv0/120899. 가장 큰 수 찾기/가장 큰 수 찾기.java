class Solution {
     public int[] solution(int[] array) {
        int[] answer = {1,2};
        int Maxnum=0;
        int index=0;
        for (int i = 0; i < array.length; i++) {
        if(array[i]>Maxnum){
            Maxnum = array[i];
            index = i;
        }
            answer[0]=Maxnum;
        answer[1]=index;
        }
        return answer;
    }
}