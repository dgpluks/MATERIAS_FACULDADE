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
	int s = 1;
	if(l < t && c < t && l >= 0 && c >= 0)
		printf("%d ", mat[l][c]);
	int cont = 0;
	for(int i = 0; cont < t*t-1; i++){
		for(int j = 0; j < i+1; j++){
			l -= s;
			if(c < t && c >= 0 && l <t && l >= 0 ){
				printf("%d ", mat[l][c]);
				cont++;
			}
		}
		for(int j = 0; j < i+1; j++){
			c+=s;
			if(c < t && c >= 0 && l <t && l >= 0 ){
				printf("%d ", mat[l][c]);
				cont++;
			}
		}
		s *= -1;
	}
}
