#include<iostream>
using namespace std;
int maiusculas(char *linha, int qnt){
	int qn = 0;
	for(int i = 0; i< qnt; i++){
		if(linha[i] >= 'A' && linha[i]<='Z'){
			qn++;
		}
	}
	return qn;
}
int main(){
	int qn=0, i=0, aux=0;
	char linha[100], letra;
	while(linha[0]!='F' || linha[1]!='I' || linha[2]!='M' || linha[3]!='\0'){
		cin.get(letra);
		while(letra!='\n'){
			linha[i] = letra;
			i++;
			cin.get(letra);
		}
		linha[i] = '\0';
		if(linha[0]!='F' || linha[1]!='I' || linha[2]!='M' || linha[3]!='\0'){
			cout<<maiusculas(linha, i)<<"\n";
			i=0;
		}
	}
}
