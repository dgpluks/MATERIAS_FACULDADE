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
	if(l < t && c < t && l >= 0 && c >= 0)
		printf("%d ", mat[l][c]);
	int cont = 0;
	for(int i = 0; cont < t*t-1; i++){
		if(s == 0){
			for(int j = 0; j < i+1; j++){
				l--;
				if(c < t && c >= 0 && l <t && l >= 0 ){
					printf("%d ", mat[l][c]);
					cont++;
				}
				//printf("CONTINUE 1");
				//scanf("%d", &x);
			}
			for(int j = 0; j < i+1; j++){
				c++;
				if(c < t && c >= 0 && l <t && l >= 0 ){
					printf("%d ", mat[l][c]);
					cont++;
				}
				//printf("CONTINUE 2");
				//scanf("%d", &x);
			
			}
			s = 1;
		}else{
			for(int j = 0; j < i+1; j++){
				l++;
				if(c < t && c >= 0 && l <t && l >= 0 ){
					printf("%d ", mat[l][c]);
					cont++;
				}
				//printf("CONTINUE 3");
				//scanf("%d", &x);
			}
			for(int j = 0; j < i+1; j++){
				c--;
				if(c < t && c >= 0 && l <t && l >= 0 ){
					printf("%d ", mat[l][c]);
					cont++;
				}
				//printf("CONTINUE 4");
				//scanf("%d", &x);
			}
			s = 0;
		}//printf("a");
		//printf("-%d\n", cont);
		//scanf("%d", &x);
	}
}
