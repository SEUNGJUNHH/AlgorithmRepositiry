import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] dp = new int[n+1];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
        dp[1]=arr[0];
        dp[2]=dp[1]+arr[1];
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(arr[i-1]+arr[i-2]+dp[i-3],arr[i-1]+dp[i-2]);
        }
        System.out.println(dp[n]);
    }


}