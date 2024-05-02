import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < st.length(); i++) {
            hashMap.put(Character.toUpperCase(st.charAt(i)), hashMap.getOrDefault(Character.toUpperCase(st.charAt(i)),0)+1);
        }
        int valueMax = Collections.max(hashMap.values());
        boolean check = false;
        Character answer = null;
        for(char ch : hashMap.keySet()){
            if(hashMap.get(ch) == valueMax){
                if(check==true){
                    System.out.println("?");
                    check = false;
                    break;
                }
                answer = ch;
                check = true;
            }
        }
        if(check==true)  System.out.println(answer);
    }
}
