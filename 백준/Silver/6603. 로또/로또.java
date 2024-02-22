import java.io.*;
import java.util.*;


public class Main {
    static int[] arr;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n==0) break;
            arr = new int[n];
            check = new boolean[n];
            for (int i = 0; i <n; i++) {
                arr[i]=Integer.parseInt(st.nextToken());
            }

                back(0,new int[6],0);
            System.out.println();
        }



        br.close();
    }

    public static void back(int depth, int[] arr1,int start){
        if(depth==6){
            for (int i : arr1) {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if(!check[i]){
                check[i] = true;
                arr1[depth] = arr[i];
                back(depth+1,arr1,i+1);
                check[i] = false;
            }

        }
    }

}
