import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
        long num = 0;
        long count = 0;
        for(int i=1;;i++){
            if(num > n) break;
            num += i;
            count++;
        }
        System.out.println(count-1);
    br.close();
    }


}
