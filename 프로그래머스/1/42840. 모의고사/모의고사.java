class Solution {
    public int[] solution(int[] answers) {
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2,1,2,3,2,4,2,5};
        int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
        int count1=0,count2=0,count3 = 0;
        for(int i = 0; answers.length>i;i++){
            if(answers[i]==answer1[i%5])
                count1++;
            if(answers[i]==answer2[i%8])
                count2++;
            if(answers[i]==answer3[i%10])
                count3++;
        }
        if(count1==count2&&count2==count3&&count1==0){
            int[] answer ={};
            return answer;
        }
        else if(count1==count2&&count2==count3){
            int[] answer ={1,2,3};
            return answer;
        }else if((count1>count2&&count2>=count3)||(count1>count2&&count1>count3)){
            int[] answer ={1};
            return answer;
        }else if((count2>count1&&count1>=count3)||(count2>count1&&count2>count3)){
            int[] answer ={2};
            return answer;
        }else if(count3>count1&&count3>count2){
            int[] answer ={3};
            return answer;
        }else if(count3<count1&&count1==count2){
            int[] answer ={1,2};
            return answer;
        }else if(count3>count1&&count3==count2){
            int[] answer ={2,3};
            return answer;
        }else if(count3>count2&&count1==count3){
            int[] answer ={1,3};
            return answer;
        }
        int[] answer ={};
        return answer;
        
    }    
}