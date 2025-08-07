#include<stdio.h>
int maiuscula (char *linha, int qnt){
	int qn = 0;
	for(int i = 0; i<qnt; i++){	
		if(linha[i] >='A' && linha[i] <= 'Z'){
			qn++;
        	}
	}
	return qn;
}
void lerString(){

}
int main (){
	int i = 0;
        char linha[50], letra;
        while(linha[0] != 'F' ||linha[1] != 'I'||linha[2] != 'M' || linha[3] != '\0'){
                scanf("%c", &letra);
                while(letra!='\n'){
                        linha[i]=letra;
                        i++;
        		scanf("%c", &letra);
                }       
                linha[i]='\0';
                if(linha[0] != 'F' ||linha[1] != 'I'||linha[2] != 'M' || linha[3] != '\0'){
                	printf("%d\n", maiuscula(linha, i));       
                }
                i=0;
        }
        return 0;
}

