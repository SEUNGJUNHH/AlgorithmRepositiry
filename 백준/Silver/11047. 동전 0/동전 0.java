import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int answer = 0;
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }
        while (!queue.isEmpty()){
            if(k==0) break;
            int num = queue.poll();
            if(num<=k){
                answer += k/num;
                k = k%num;
            }
        }
    System.out.print(answer);
    br.close();
    }


}
