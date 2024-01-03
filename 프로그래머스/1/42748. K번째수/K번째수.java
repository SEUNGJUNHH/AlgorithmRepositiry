import java.util.*;
class Solution {
    int first, end, point;
    
    
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int row = commands.length;
        int[] answer = new int[row];
        for(int i = 0 ; i<row;i++){
            list.clear();
            first = commands[i][0]-1;
            end = commands[i][1]-1;
            point = commands[i][2]-1;
            for(int j =first;j<=end;j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(point);
            
        }
        return answer;
    }
}