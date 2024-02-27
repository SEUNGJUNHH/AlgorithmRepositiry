import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int[] arr = new int[10];
        for (int i = 0; i < n.length(); i++) {
            char a =n.charAt(i);
            if(a=='6'||a=='9'){
                if(arr[6]>arr[9]){
                    arr[9]++;
                }else arr[6]++;
            }else arr[Integer.parseInt(String.valueOf(a))]++;
        }
        Arrays.sort(arr);
        System.out.println(arr[9]);

        br.close();
    }
}
