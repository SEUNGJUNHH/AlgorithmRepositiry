import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[N+1];
        dp[1] = 0;
        for (int i = 2; i <= N; i++) {
            long sum = 1000000;
            if(i%3==0) sum = Math.min(sum,dp[i/3]+1);
            if(i%2==0) sum = Math.min(sum,dp[i/2]+1);
            sum= Math.min(sum,dp[i-1]+1);
            dp[i] = sum;
        }
        System.out.println(dp[N]);
    }
}