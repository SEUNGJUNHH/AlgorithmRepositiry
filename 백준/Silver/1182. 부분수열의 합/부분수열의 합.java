import java.io.*;
import java.util.*;


public class Main {
    static int[] arr;
    static boolean[] check;
    static int m;
    static int answer;
    static boolean mNum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n  = Integer.parseInt(st.nextToken());
        m  = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        check = new boolean[n];
        for (int i = 0; i < n; i++) {
           arr[i] = Integer.parseInt(st.nextToken());
         }
        if(n==1){
            if(arr[0]==m) answer++;
        }else { backTrafic(0,0,0);}

        System.out.println(answer);
        br.close();
    }

    static void backTrafic(int depth,int sum,int a){
        if(depth>arr.length){
            return;
        }
        if(sum==m&&depth!=0){
            answer ++;
        }

        for (int i = a; i < arr.length; i++) {
            if(!check[i]){
                check[i] = true;
                backTrafic(depth+1,sum+arr[i],i);
                check[i] = false;
            }

        }
    }

}
