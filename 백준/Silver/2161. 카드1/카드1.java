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
    Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < n+1; i++) {
            queue.add(i);
        }

        while (queue.size()!=1){
            sb.append(queue.poll()).append(" ");
            queue.add(queue.poll());
        }
    System.out.print(sb+""+queue.peek());

    br.close();
    }


}
