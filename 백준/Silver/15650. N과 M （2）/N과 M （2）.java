import java.io.*;
import java.util.*;


public class Main {
    static int n;
    static int m;
    static boolean[] check;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    check =  new boolean[n];
    arr = new int[m];
    bfs(0);

    //index는 1부터
    br.close();
    }
    public static void bfs(int count){
        if(count==m) {
            for (int val : arr) {
                System.out.print(val+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if(!check[i]){
                if(count>0){
                    if(i+1<arr[count-1])
                        continue;
                }
                check[i] = true;
                arr[count] = i+1;
                bfs(count+1);
                check[i] = false;
            }
        }

    }
}
