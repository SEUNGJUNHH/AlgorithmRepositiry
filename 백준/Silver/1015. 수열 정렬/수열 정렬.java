import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i][0]= Integer.parseInt(st.nextToken());
            arr[i][1]= i;
        }
        Arrays.sort(arr,(o1,o2)->{
            if(o1[0]==o2[0]) return o1[1]-o2[1];
            return o1[0]-o2[0];
        });
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            int index = arr[i][1];
            b[index] = i;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
    }
}