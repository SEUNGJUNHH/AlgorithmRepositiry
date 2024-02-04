import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int fiveNum = n/5;
    int answer = -1;
    while(fiveNum>=0){
        int checkNum = n - fiveNum*5;
        if(checkNum%3==0){
            answer = fiveNum+ checkNum/3;
            break;
        }
        fiveNum--;
    }
    System.out.print(answer);
    br.close();
    }


}
