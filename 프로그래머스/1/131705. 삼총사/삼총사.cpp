#include <string>
#include <vector>
#include <iostream>

using namespace std;
void dfs(int depth,vector<int> number, int sum,int k);
int count = 0;
int solution(vector<int> number) {
    int answer = 0;
    dfs(0,number,0,0);
    return count;
}
void dfs(int depth,vector<int> number, int sum,int k){
    if(depth==3) {
        if(sum==0) count++;
        return;
    }
    for(int i = k; i < number.size(); i++){
        dfs(depth+1, number, sum+number[i], i+1);
    }
}