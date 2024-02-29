import java.io.*;
import java.util.*;


public class Main {
    static class XY{
        int size;
        String st;

        XY(int size,String st){
            this.size = size;
            this.st = st;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n  = Integer.parseInt(br.readLine());
        XY[] xy = new XY[n];
        for (int i = 0; i < n; i++) {
            xy[i]= new XY(0,br.readLine());
            xy[i].size = xy[i].st.length();
        }
        Arrays.sort(xy,(a,b)->{
            if(a.size==b.size){
                 return a.st.compareTo(b.st);
            }else{
                return a.size-b.size;
            }
        });
        String check="";
        for(XY a : xy){
            if(!check.equals(a.st)) System.out.println(a.st);
            check = a.st;
        }
        //index는 1부터
        br.close();
    }


}
