//TP 2 - Q 2
#include<stdio.h>
char* flo(char *string){
	int i = 0;
	int x = 1;
	while(string[i] != '\0' && string[i] >= '0' && string[i] <= '9' || (string[i] == ','|| string[i] == '.') && x == 1|| string[i] == '-'|| string[i] == '+'){
		if(string[i] == ','|| string[i] == '.'){
			x = 2;
		}
		i++;
	}
	if(string[i] =='\0'){
		return "SIM";
	}
	return "NAO";
}
char* cons(char *string){
	int i = 0;
	while(string[i] != '\0' && string[i] >= 'b' && string[i] <= 'z' && string[i] != 'e'&& string[i] != 'i'&& string[i] != 'o'&& string[i] != 'u' ||string[i] >= 'B' && string[i] <= 'Z'&& string[i] != 'E'&& string[i] != 'I'&& string[i] != 'O'&& string[i] != 'U'){
		i++;
	}
        if(string[i] =='\0'){
        	return "SIM";
        }
	return "NAO";
}
char* in(char *string){
	int i = 0;
	while(string[i] != '\0' && string[i] >= '0' && string[i] <= '9'|| string[i] == '-'|| string[i] == '+'){
		i++;
	}
	if(string[i] =='\0'){
		return "SIM";
	}
	return "NAO";
}
char* vog(char *string){
	int i = 0;
        while( string[i] != '\0' && string[i] == 'a' || string[i] == 'e'|| string[i] == 'i'|| string[i] == 'o'|| string[i] == 'u' ||string[i] == 'A' || string[i] == 'E'|| string[i] == 'I'|| string[i] == 'O'|| string[i] == 'U'){
		i++;
	}
        if(string[i] =='\0'){
		return "SIM";
        }
	return "NAO";
}
int main(){
	char string[1000];	
	scanf(" %[^\n]", string);
	//scanf("%s", string);
	while(string[0] != 'F' || string[1] != 'I' ||  string[2] != 'M'|| string[3] != '\0'){
		printf("%s %s %s %s\n", vog(string), cons(string), in(string), flo(string) );
	scanf(" %[^\n]", string);	
	//scanf("%s", string);
	}
	return 0;
}
