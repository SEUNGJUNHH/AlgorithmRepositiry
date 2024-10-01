import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int answer = 0;
        int sum = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            sum = arr[i];
            answer=Math.max(answer,sum*(arr.length-i) );
        }
        System.out.print(answer);
    }
}