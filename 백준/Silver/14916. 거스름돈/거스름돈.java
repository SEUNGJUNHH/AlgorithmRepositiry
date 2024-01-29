import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int fiveNum = n/5;
    int answer = 0;
    boolean flag = true;
    while(fiveNum>=0){
        answer = n - (fiveNum*5);
        if(answer%2==0) {
            flag = false;
            break;}
        fiveNum-=1;
    }
    if(flag==true){
        System.out.println(-1);
    }else System.out.println(answer/2+fiveNum);

    br.close();
    }
}