import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0,0};
        for(int i = 0; i< park.length; i++){
            for(int j = 0; j< park[0].length(); j++){
                if(park[i].charAt(j)=='S') {
                    answer[0] = i;
                    answer[1] = j;
                    System.out.print(i+"  "+j);
                    break;
                }
            }
        }
        for(int i = 0; i< routes.length; i++){
            char path = routes[i].charAt(0);
            int num = routes[i].charAt(2)-48;
            boolean flag = false;
            if(path=='E'){
               if(answer[1]+num<park[0].length()){
                  for(int j =1; j<=num;j++){
                      if(park[answer[0]].charAt(answer[1]+j)=='X'){
                          flag = true;
                          break;
                      }
                  }
                   if(flag!=true) answer[1] = answer[1]+num;
               }
                
            }else if(path =='W'){
               if(answer[1]-num>=0){
                  for(int j =1; j<=num;j++){
                      if(park[answer[0]].charAt(answer[1]-j)=='X'){
                          flag = true;
                          break;
                      }
                  }
                   if(flag!=true) answer[1] = answer[1]-num;
               }
                
            }
            else if(path=='N'){
               if(answer[0]-num>=0){
                  for(int j =1; j<=num;j++){
                      if(park[answer[0]-j].charAt(answer[1])=='X'){
                          flag = true;
                          break;
                      }
                  }
                   if(flag!=true) answer[0] = answer[0]-num;
               }
            
            }else if(path=='S'){
               if(answer[0]+num<park.length){
                  for(int j =1; j<=num;j++){
                      if(park[answer[0]+j].charAt(answer[1])=='X'){
                          flag = true;
                          break;
                      }
                  }
                   if(flag!=true) answer[0] = answer[0]+num;
               }
                
            }
        
        }
        return answer;
    }
}