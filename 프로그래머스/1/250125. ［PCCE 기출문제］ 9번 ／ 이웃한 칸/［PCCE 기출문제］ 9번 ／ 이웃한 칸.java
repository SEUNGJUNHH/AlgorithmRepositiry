import java.util.*;
class Solution {
    int[][] arr = {{1,0},{-1,0},{0,1},{0,-1}};
    public int solution(String[][] board, int h, int w) {
        int result = 0;
        String answer = board[h][w];
        for(int i = 0; i<arr.length;i++){
            if(arr[i][0]+h>=0&&arr[i][0]+h<board.length&&arr[i][1]+w>=0&&arr[i][1]+w<board.length){
                if(answer.equals(board[h+arr[i][0]][w+arr[i][1]])){
                    result++;
                }
            }
        }
        return result;
    }
}