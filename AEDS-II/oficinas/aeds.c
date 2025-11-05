#include<stdio.h>
int main(){
	int t;
	scanf("%d", &t);
	int mat[t][t];
	for(int i = 0; i < t; i++){
		for(int j = 0 ; j < t; j++){
			scanf("%d", &mat[i][j]);	
		}
	}
	int c = 0, l = 0;
	scanf("%d %d", &c, &l);
	int s = 0;
	printf("%d", mat[l][c]);
	int cont = 0;
	for(int i = 1; cont < l*c; i++){
		if(s == 0){
			for(int j = 0; j < i; j++){
				l--;
				if(c < t && c >= 0 && l <t && l >= 0 ){
					printf("%d", mat[c][j]);
					cont++;
				}
			}
			for(int j = 0; j < i; j++){
				c++;
				if(c < t && c >= 0 && l <t && l >= 0 ){
					printf("%d", mat[c][l]);
					cont++;
				}
			}
			s = 1;
		}else{
			for(int j = 0; j < i; j++){
				l++;
				if(c < t && c >= 0 && l <t && l >= 0 ){
					printf("%d", mat[c][j]);
					cont++;
				}
			}
			for(int j = 0; j < i; j++){
				c--;
				if(c < t && c >= 0 && l <t && l >= 0 ){
					printf("%d", mat[c][j]);
					cont++;
				}
			}
			s = 0;
		}
	}
}
