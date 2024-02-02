import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st =  new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < n+1; i++) {
            queue.add(i);
        }
        int check = 0;
        System.out.print("<");
    while(queue.size()!=1){
        check +=1;
        int ques = queue.poll();
        if(check==k){
            System.out.print(ques+", ");
            check = 0;
            continue;
        }
        queue.add(ques);
    }
        System.out.print(queue.peek()+">");
    br.close();
    }


}
