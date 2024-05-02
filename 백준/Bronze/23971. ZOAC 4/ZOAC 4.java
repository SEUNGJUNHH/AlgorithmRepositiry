import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count1 = 0, count2 = 0;
        for (int i = 0; i <h;) {
            count1++;
            i+=n+1;
        }
        for (int i = 0; i <w;) {
            count2++;
            i+=m+1;
        }
        System.out.println(count1*count2);
        br.close();
    }


}
