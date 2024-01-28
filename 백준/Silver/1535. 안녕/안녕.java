import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] dp = new int[n+1][100];
        int[] health = new int[n];
        int[] happy = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            health[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            happy[i] = in.nextInt();
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < 100; j++) {
                if(j>=health[i-1]){
                    dp[i][j] = Math.max(dp[i-1][j-health[i-1]]+happy[i-1],dp[i-1][j]);
                }else  dp[i][j] =dp[i-1][j];
                max = Math.max(dp[i][j],max);
            }
        }
        System.out.println(max);
    }
}