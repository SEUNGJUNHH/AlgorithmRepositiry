import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int[] arr = new int[size+1];
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int answer = 0;
        int maxNum = 0;
        int max = 0;
        int maxs = 0;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            if (maxs < k - p) {
                maxNum = i;
                maxs = k - p;
            }

            for (int j = p; j <= k; j++) {
                if (arr[j] == 0) arr[j] = i;
            }
        }
            for (int j = 1; j <= n; j++) {
                int count = 0;
                for (int l = 0; l < arr.length; l++) {
                    if(arr[l]==j) count++;
                }
                if(max<count) {
                    max = count;
                    answer = j;
                }
            }

        System.out.println(maxNum);
        System.out.println(answer);
    }
}