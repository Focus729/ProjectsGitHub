#include <iostream>
using namespace std;

int main(){
	int LangArray;
	int Array;
	int res = 0,i=0;
	cin>>LangArray;
	while (cin>>Array and i<LangArray){
		res = res+Array;
		i++;
	}
	cout<<res;
}
