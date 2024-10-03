#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    numbers.push_back(10);
    for(int i = 0; i<10; i++){
        auto a = find(numbers.begin(), numbers.end(),i);
        if(a == numbers.end()) answer += i;
    }
    
    return answer;
}