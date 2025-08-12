#include<iostream>
using namespace std;
int maiusculas(char *linha, int i){
	if(linha[i] == '\0'){
		return 0;
	}else if(linha[i] >='A' && linha [i] <= 'Z'){
		return 1 + maiusculas(linha, i+1);
	}else{
		return maiusculas(linha, i+1);
	}
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
			cout<<maiusculas(linha, 0)<<"\n";
			i=0;
		}
	}
}
