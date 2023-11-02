class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length;
        int[] saves = new int[count];
        boolean flag = false;
        for(int i = 0 ; i<nums.length;i++){
            for (int save : saves) {
                if(save == nums[i]){          
                    flag = true;
                }
            }
            if(flag!=true){
                saves[i]=nums[i];   
                if(answer<nums.length/2)
                    answer++; 
            }
          flag = false;
        }
        return answer;
    }
}