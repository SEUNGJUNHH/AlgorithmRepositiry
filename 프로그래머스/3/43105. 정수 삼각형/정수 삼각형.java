class Solution {
    

    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle.length];
        int answer = 0;
        for (int i = 0; i < triangle.length; i++) {
            dp[triangle.length - 1][i] = triangle[triangle.length - 1][i];
        }
        for(int i =triangle.length-2 ; i>=0;i--){
           for(int j = 0; j<triangle[i].length;j++){
                dp[i][j] = Math.max(triangle[i][j]+dp[i+1][j],triangle[i][j]+dp[i+1][j+1]);
            } 
        }
        
        return dp[0][0];
    }

    
}
