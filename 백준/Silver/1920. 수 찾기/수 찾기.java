import java.io.*;
import java.util.*;


public class Main {
    static int[] arr1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        st = new StringTokenizer(br.readLine());
        int q = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[q];
        for (int i = 0; i < q; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < q; i++) {
            System.out.println(binary(n,arr2[i]));

        }
        
        br.close();
    }

    public static int binary(int n, int target){
        int start = 0;
        int max =  n-1;
        int mid = (start+max)/2;
        while(start<=max){
            if(arr1[mid]==target){
                return 1;
            }
            else if(arr1[mid]>target){
                max = mid-1;
                mid = (start+max)/2;
            }else if(arr1[mid]<target){
                start = mid+1;
                mid = (start+max)/2;
            }
        }
        return 0;
    }


}
