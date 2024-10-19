import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int lim = Integer.parseInt(st.nextToken());
        int answer = 0;
        while(kim!=lim){
            answer++;
            if(kim%2==0){
                kim /=2;
            }else kim = (kim/2)+1;
            if(lim%2==0){
                lim /=2;
            }else lim = (lim/2)+1;
        }
        System.out.println(answer);
    }
}