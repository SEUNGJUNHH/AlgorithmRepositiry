import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    long answer = 0;
    for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(arr);
    for (int i = 1; i < n+1; i++) {
        answer+=Math.abs(arr[i-1]-i);
    }
    System.out.print(answer);
    br.close();
    }


}
