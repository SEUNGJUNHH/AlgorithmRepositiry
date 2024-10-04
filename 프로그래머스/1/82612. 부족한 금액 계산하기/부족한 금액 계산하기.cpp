using namespace std;

long long solution(int price, int money, int count)
{   long long a =money;
    
    for(int i =1; i<=count ; i++){
        a -= price*i;
    }
    if(a<0) return -a;
    else return 0;
}