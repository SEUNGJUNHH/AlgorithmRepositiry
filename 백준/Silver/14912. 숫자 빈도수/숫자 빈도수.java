import java.io.*;
import java.util.*;

class XY{
    int X;
    int Y;

    public XY(int x, int y) {
        X = x;
        Y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st =  new StringTokenizer(br.readLine());
    int n  = Integer.parseInt(st.nextToken());
    char num  = st.nextToken().charAt(0);
    int answer = 0;
        for (int i = 1; i < n+1; i++) {
            String ste = String.valueOf(i);
            for (int j = 0; j < ste.length(); j++) {
                char a = ste.charAt(j);
                if(a==num){
                    answer++;
                }
            }
        }

    System.out.print(answer);

    br.close();
    }


}
