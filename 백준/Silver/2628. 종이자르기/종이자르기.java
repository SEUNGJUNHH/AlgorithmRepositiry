import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arrX = new int[n];
        int[] arrY = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int check = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if(check==0){
                arrY[i] = num;
            }else arrX[i] = num;
        }
        Arrays.sort(arrX);
        Arrays.sort(arrY);
        int maxX = arrX[0];
        int maxY = arrY[0];
        for (int i = 1; i < n; i++) {
            maxX=Math.max(maxX,arrX[i]-arrX[i-1]);
            maxY=Math.max(maxY,arrY[i]-arrY[i-1]);
        }
        maxX=Math.max(maxX,x-arrX[n-1]);
        maxY=Math.max(maxY,y-arrY[n-1]);
        System.out.println(maxX*maxY);

    }
}