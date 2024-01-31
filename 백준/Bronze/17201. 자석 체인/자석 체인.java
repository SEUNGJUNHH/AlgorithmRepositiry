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
    st =  new StringTokenizer(br.readLine());
    char a = '5';
        String b =st.nextToken();
        for (int i = 0; i < b.length(); i++) {
            if(a==b.charAt(i)){
                System.out.print("No");
                return;
            }
          a= b.charAt(i);
        }


    System.out.print("Yes");

    br.close();
    }


}
