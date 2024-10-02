import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i< players.length; i++){
            map.put(players[i],i);
        }
        for(int i = 0; i< callings.length; i++){
            String a = callings[i];
            int b = map.get(a);//역전한 친구
            String c = players[b-1];//역전 당한 친구
            
            players[b-1] = players[b];
            players[b] = c;
            
            map.put(c,map.get(c)+1);
            map.put(a,b-1);
            
        }
        return players;
    }
}