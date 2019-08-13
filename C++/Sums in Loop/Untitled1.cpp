#include <iostream>
using namespace std;

int main(){
	int m;
	int num;
	cin>>m;
	int resultArray[m];
	for (int i=0;i<m;i++){
		resultArray[i] =0;
		while (cin>>num){
			resultArray[i]+=num;
		}
	}
	for (int j=0;j<m;j++){
		cout<<resultArray[j]<<" ";
	}
}
