import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] dp = new int[n][n];
        int [][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[i][j]= in.nextInt();
            }
        }
        dp[0][0] = answer[0][0];
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i+1][j]= Math.max(dp[i][j]+answer[i+1][j],dp[i+1][j]);
                dp[i+1][j+1]= Math.max(dp[i][j]+answer[i+1][j+1],dp[i+1][j+1]);
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
           if(result<dp[n-1][i]){
               result = dp[n-1][i];
           }
        }
        System.out.println(result);

    }
}