import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    int n = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    StringTokenizer st =  new StringTokenizer(br.readLine());
    int answer = 0;
    for (int i = 0; i < n; i++) {
       queue.add(Integer.parseInt(st.nextToken()));
    }
    while (queue.size()>1){
        int a = queue.poll();
        int b = queue.poll();
        answer++;
        if(a-1!=0) queue.add(a-1);
        if(b-1!=0) queue.add(b-1);
    }
        for (int i = 0; i < queue.size(); i++) {
            answer+= queue.poll();

        }
        if(answer>1440) System.out.print(-1);
    else System.out.print(answer);
    br.close();
    }


}
