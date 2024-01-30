import java.io.*;
import java.util.*;


public class Main {
    static int n;
    static int m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    arr = new int[m];
    bfs(0);
        System.out.print(sb);

    //index는 1부터
    br.close();
    }
    public static void bfs(int count){
        if(count==m) {
            for (int val : arr) {
                sb.append(val+" ");
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < n; i++) {
            if(count>0){
                if(i+1<arr[count-1])
                    continue;
                }
                arr[count] = i+1;
                bfs(count+1);
        }

    }
}
