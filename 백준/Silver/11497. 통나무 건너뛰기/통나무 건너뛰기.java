import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            arr = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[j] = Integer.valueOf(st.nextToken());
            }
            Arrays.sort(arr);
            int[] arr1 = new int[m];
            int first = 0;
            int end = m-1;

            for(int j=0; j<m; j++) {
                if(j%2!=0) {
                    arr1[first] = arr[j];
                    first+=1;
                }
                else {
                    arr1[end] = arr[j];
                    end-=1;
                }
            }
            for (int j = 0; j < arr1.length-1; j++) {
                answer =Math.max(answer, Math.abs(arr1[j]- arr1[j+1]));
            }
            System.out.println(answer);
            answer = 0;
        }

        br.close();
    }
}