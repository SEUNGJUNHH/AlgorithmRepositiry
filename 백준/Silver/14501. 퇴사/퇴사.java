import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] T = new int[n+15];
        int[] P = new int[n+15];
        int[] dp = new int[n+15];
        int max = 0;
        for (int i = 0; i < n; i++) {
            T[i] = in.nextInt();
            P[i] = in.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            dp[i] = Math.max(dp[i],max);
            if(T[i]+i<n+1){
                dp[i+T[i]] = Math.max(dp[i]+P[i], dp[i+T[i]]);
            }
            max = Math.max(dp[i],max);
        }
        System.out.println(max);
    }
}