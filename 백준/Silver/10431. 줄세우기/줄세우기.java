import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> queue = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        for(int i = 0; i< n ; i++){
            int answer = 0;
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 20; j++) {
                int a = Integer.parseInt(st.nextToken());
                list.add(a);
                queue.add(a);
                Collections.sort(queue);
                int z = list.indexOf(a);
                int x = queue.indexOf(a);
                if(z!=x){
                    answer+= queue.size()-1-x;
                }
            }

            arr[i][1] = answer;
            list.clear();
            queue.clear();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }

    }
}