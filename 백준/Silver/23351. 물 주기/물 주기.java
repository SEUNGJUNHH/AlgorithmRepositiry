import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Queue<Integer> queue = new LinkedList<>();
    StringTokenizer st =  new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    for (int i = 0; i < n; i++) {
        queue.add(k);
    }
    int answer = 0;
    boolean flag = false;
    while (true){
        answer++;
        for (int i = 0; i < a; i++) {
            int num = queue.poll();
            queue.add(num+b);
        }
        for (int i = 0; i < queue.size(); i++) {
            int num1 = queue.poll();
            if(num1-1==0) flag=true;
            queue.add(num1-1);
        }
        if(flag == true) break;
    }
    System.out.print(answer);
    br.close();
    }
}
