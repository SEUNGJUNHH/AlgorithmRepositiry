import java.io.*;
import java.util.*;

class XY implements Comparable<XY>{
     int number;
    String Person;

    public XY(int number, String person) {
        this.number = number;
        this.Person = person;
    }

    @Override
    public int compareTo(XY o) {
        return o.number-this.number ;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue<XY> queue = new PriorityQueue<>();
    int n = Integer.parseInt(br.readLine());
    int Dnum = Integer.parseInt(br.readLine());
    int answer = 0;
    XY dasom =  new XY(Dnum,"dasom");
       for (int i = 0; i < n-1; i++) {
           queue.add(new XY(Integer.parseInt(br.readLine()),"other"));
        }
       while(!queue.isEmpty())   {
           XY xy = queue.poll();
           if(xy.number< dasom.number) break;
           answer++;
           dasom.number += 1;
           queue.add(new XY(xy.number-1,"other"));
       }
        System.out.println(answer);
    br.close();
    }


}
