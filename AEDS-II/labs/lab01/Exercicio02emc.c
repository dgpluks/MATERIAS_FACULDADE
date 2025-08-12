#include<stdio.h>
int maiuscula (char *linha, int i,  int qnt){
	if(linha[i] == '\0'){
		return 0;
	}else if(linha[i] >= 'A' && linha[i] <= 'Z'){
		return 1 + maiuscula(linha, i+1, qnt);
	}else{
		return maiuscula(linha, i+1, qnt);	
	}
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
                        printf("%d\n", maiuscula(linha, 0, 0));
                }
                i=0;
        }
        return 0;
}

