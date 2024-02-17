import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        //가로
        int n = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if(b.equals("enter")) map.put(a,0);
            if(b.equals("leave")) map.remove(a);
        }
        ArrayList<String> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr,Collections.reverseOrder());
        for (String s : arr) {
            System.out.println(s);
        }
        br.close();
    }



}
