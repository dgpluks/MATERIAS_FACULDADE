#include<stdio.h>
#include<string.h>
#include <wchar.h>
int main(){
	wchar_t string[100];
	do{
		wscanf(L"%ls", string);
		int i = 0, j = wcslen(string)-1;
		while(i < j && string[i] == string[j]){			
			i++; j--;
		}		
		if(i >= j){
			printf("SIM\n");
		}else{
			printf("NAO\n");
		}
	}while(wcscmp(string, L"FIM"));
}
