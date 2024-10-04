#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
#include <set>


using namespace std;

vector<int> solution(vector<int> numbers) {
    set<int> sumSet;
    for(int i = 0; i< numbers.size(); i++){
        for(int j = i+1; j< numbers.size(); j++){
            int sum =  numbers[i]+numbers[j];
            sumSet.insert(sum);
        }
    }
    vector<int> answer (sumSet.begin(),sumSet.end());
    return answer;
}