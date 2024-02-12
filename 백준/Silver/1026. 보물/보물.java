import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        st =new StringTokenizer(br.readLine());
        for (int j = 0; j <n; j++) {
            arr[j] = Integer.parseInt(st.nextToken());
        }
        st =new StringTokenizer(br.readLine());
        for (int j = 0; j <n; j++) {
            arr1[j] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int answer = 0;
        for (int i = 0; i < arr1.length; i++) {
            answer += arr[i]*arr1[arr1.length-1-i];
        }
        System.out.print(answer);
        br.close();
    }



}
