class Solution {


    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int[]arr1 = new int[cards1.length];
        int[]arr2 = new int[cards2.length];
        int ca1 = -1,ca2 = -1,a;
        if(cards1.length>cards2.length) a= cards1.length;
        else a= cards2.length;
        boolean flag = false;
        for(int i =0;i< goal.length;i++){
            for (int j = 0; j < a; j++) {
                if(cards1.length>j){
                if(goal[i].equals(cards1[j])){
                    if(ca1-j!=-1)return "No";
                    ca1 = j;
                    flag =true;
                    break;
                }}
                if(cards2.length>j){
                if(goal[i].equals(cards2[j])){
                    if(ca2-j!=-1)return "No";
                    ca2 = j;
                    flag =true;
                    break;
                }}

            }
            if(flag!=true)return "No";
            flag = false;
        }
        return answer;
    }
}