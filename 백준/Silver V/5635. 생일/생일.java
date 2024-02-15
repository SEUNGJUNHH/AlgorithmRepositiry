import java.io.*;
import java.util.*;


public class Main {
    static class People{
        String name;
        String birth;

        public People(String name, String birth) {
            this.name = name;
            this.birth = birth;
        }

        public String getBirth() {
            return birth;
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        People[] people = new People[n];
        for (int i = 0; i < n; i++) {
            st =  new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String day = st.nextToken();
            if(day.length()==1) day = 0+day;
            String month = st.nextToken();
            if(month.length()==1) month = 0+month;
            String year = st.nextToken();
            people[i] = new People(name,year+month+day);
        }
        Arrays.sort(people,(a,b)->Integer.parseInt(a.getBirth())-Integer.parseInt(b.getBirth()));
        System.out.println(people[n-1].name);
        System.out.print(people[0].name);
        br.close();
    }



}
