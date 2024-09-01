import java.util.*;
class Solution {    
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<>();
        //commands 길이 구하는 반복문
        for(int i =0; i<commands.length;i++){
            //각 구간별 값 저장하는 list
            ArrayList<Integer> save = new ArrayList<>();
            // 3번 반복해서 각 point 선정
            for(int j = commands[i][0]-1 ; j<=commands[i][1]-1; j++){
                save.add(array[j]);
            }
            Collections.sort(save);
            list.add(save.get(commands[i][2]-1));
        }
        
        int[] arr = new int[list.size()];
        for(int i =0; i< list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}