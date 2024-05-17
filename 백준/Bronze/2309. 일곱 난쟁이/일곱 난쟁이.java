import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int totalSum =0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            totalSum += arr[i];
        }
        Arrays.sort(arr);
        int a = 0,b=0;
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 9; j++) {
                if(totalSum-arr[i]-arr[j]==100){
                    a=i;
                    b=j;
                    break;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if(i==a||i==b) continue;
            System.out.println(arr[i]);
        }

    }
}