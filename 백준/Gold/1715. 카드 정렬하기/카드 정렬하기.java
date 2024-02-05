import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(Long.parseLong(br.readLine()));
        }

        long check = 0;
        long answer = 0;
        while (queue.size()>1){
            check = queue.poll() + queue.poll();
            queue.add(check);
            answer += check;
        }
         System.out.print(answer);

        br.close();
    }


}
