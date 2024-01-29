import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(br.readLine());
        }
        int result = seq[n-1]+1;
        int answer = 0;
        for (int i = seq.length-1; i >= 0; i--) {
                while(true){
                   if(result>seq[i]) break;

                   seq[i] -= 1;
                   answer ++;
                }
            result  = seq[i];
        }

        System.out.println(answer);
        br.close();
    }
}