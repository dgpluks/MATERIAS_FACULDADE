#include<iostream>
using namespace std;
int main(){
	int qn=0, i=0, aux=0;
	char linha[100], letra;
	while(aux==0){
		cin.get(letra);
		while(letra!='\n'){
			if(letra>='A' && letra<='Z'){
				qn++;
			}
			linha[i] = letra;
			i++;
			cin.get(letra);
		}
		linha[i] = '\0';
		if(linha[0]=='F' && linha[1]=='I' && linha[2]=='M' && linha[3]=='\0'){
			aux=1;
		}else{
			cout<<qn<<"\n";
			qn=0;
			i=0;
		}
	}
}
