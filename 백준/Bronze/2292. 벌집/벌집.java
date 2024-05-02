import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int answer = 1;
        for(int i = 0; num>0;i++){
            if(answer+1>num){
                answer=i;
                break;
            }
            answer += 6*i;
        }
        if(num==1) answer =1;
        System.out.println(answer);
    }


}
