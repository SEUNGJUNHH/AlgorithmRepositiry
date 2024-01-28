import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n];
        int[] Num = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            Num[i] = in.nextInt();
        }
        dp[0] = Num[0];
        max = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1]+Num[i],Num[i]);
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}