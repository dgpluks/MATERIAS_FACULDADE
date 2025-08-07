#include<stdio.h>
int main (){
        int qn=0, i=0, fim = 0;
        char linha[50], letra;
        while(fim == 0){
                scanf("%c", &letra);
                while(letra!='\n'){
                        linha[i]=letra;
                        if(letra >='A' && letra <= 'Z'){
                                qn++;
                        }
                        scanf("%c", &letra);
                        i++;
                }       
                linha[i]='\0';
                if(linha[0]=='F' && linha[1]=='I'&& linha[2]=='M' && linha[3]=='\0'){
                        fim = 1;
                }else{
                        printf("%d\n", qn);
                }
                i=0;
                qn=0;
        }
        return 0;
}

