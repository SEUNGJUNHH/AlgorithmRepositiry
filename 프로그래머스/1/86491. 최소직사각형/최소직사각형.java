class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1=0;
        int max2=0;
        for(int i=0;sizes.length>i;i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp = 0;
                temp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1] = temp;
            }
            if(max1<sizes[i][0]) max1=sizes[i][0];
            if(max2<sizes[i][1]) max2=sizes[i][1];
        }
        System.out.println(max1+" "+max2);
        return max1*max2;
    }
}