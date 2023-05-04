import java.util.Scanner;

public class Main {
    static class object {
        int weight;
        int cost;
        object(int w, int cost){
            this.weight = w;
            this.cost = cost;
        }
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt(); //물건 갯수
    int k = scanner.nextInt(); // 가방 용량
        object[] hi = new object[n+1];
        for(int i =1;i<=n;i++){
            hi[i] = new object(scanner.nextInt() , scanner.nextInt());
        }
        int dp [][] = new int[n+1][k+1];
        for(int i= 1;i<=n;i++){
            for (int j = 1; j <=k; j++) {
                if(j<hi[i].weight) dp[i][j]=dp[i-1][j];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - hi[i].weight] + hi[i].cost);
            }
        }
        System.out.println(dp[n][k]);
    }
}