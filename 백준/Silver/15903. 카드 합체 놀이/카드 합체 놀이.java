import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PriorityQueue<Long> queue = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.add(Long.parseLong(st.nextToken()));
        }

        for (int i = 0; i < num; i++) {
            Long card = queue.poll();
            card+= queue.poll();
            queue.add(card);
            queue.add(card);
        }
        Long result = 0L;
        for (Long longs : queue) {
            result += longs;
        }
        System.out.println(result);
        br.close();
    }
}