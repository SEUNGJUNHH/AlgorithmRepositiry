import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] text = st.nextToken().split("-");
        int[] arr = new int[text.length];
        for (int i = 0; i < arr.length; i++) {
            String[] texts = text[i].split("\\+");
            for (int j = 0; j < texts.length; j++) {
                arr[i] += Integer.parseInt(texts[j]);
            }
        }
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer -= arr[i];
        }
        System.out.print(answer);
    }
}