import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n  = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> hash = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());
            hash.put(key,hash.getOrDefault(key,0)+1);
        }
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int check = Integer.parseInt(st.nextToken());
            if(hash.containsKey(check)){
                sb.append(hash.get(check)).append(" ");
            }else sb.append(0).append(" ");
        }
        //index는 1부터
        System.out.print(sb);
        br.close();
    }


}
