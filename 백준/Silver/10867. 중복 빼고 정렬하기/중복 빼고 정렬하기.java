import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n  = Integer.parseInt(br.readLine());
        HashSet<Integer> hash = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            hash.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer> list = new ArrayList<>(hash);
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        //index는 1부터
        br.close();
    }


}
