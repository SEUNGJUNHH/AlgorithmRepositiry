import java.io.*;
import java.util.*;


public class Main {
    static class XY{
        int x;
        int y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n  = Integer.parseInt(br.readLine());
        XY[] xy = new XY[n];
        for (int i = 0; i < n; i++) {
            XY a = new XY(0,0);
            st = new StringTokenizer(br.readLine());
            a.x= Integer.parseInt(st.nextToken());
            a.y= Integer.parseInt(st.nextToken());
            xy[i] = a;
        }
        Arrays.sort(xy,(a,b)->{
            if(a.y==b.y){
                return a.x-b.x;
            }else{
                return a.y-b.y;
            }
        });
        for (XY xy1 : xy) {
            System.out.print(xy1.x+" "+xy1.y);
            System.out.println();
        }
        //index는 1부터
        br.close();
    }


}
