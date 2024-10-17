class Solution {
    public int solution(int num) {
        long check = num;
        if(check == 1) return 0;
        int count = 0;
        while(count<500){
            count++;
            if(check%2==0){
                check = check/2;
            }else{
                check = (check*3)+1;
            }
            if(check==1) break;
            
        }
        System.out.print(check);
        if(check != 1) return -1;
        return count;
    }
}