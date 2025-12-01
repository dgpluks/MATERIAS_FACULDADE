#include<stdio.h>
#include<stdlib>
typedef struct{
	int *vet;
	int tam;
}Hash1;

typedef struct{
	int *vet;
	int tam;
	Hash1 *hash;
}Hash;
Hash* hash (int x){
	Hash *hash = malloc(sizeof(Hash));
	hash->vet = malloc(x * sizeof(int));
	for(int i = 0; i < x; i++){
		hash->vet[i] = -1;
	}
	hash->tam = x;
	hash->hash = hash1();
}
void hash_insert_2(int n , Hash1 **hash){
	
}
void conflit_1(int n, Hash **hash){
	if(n % 3 == 0){
		hash_insert_2(n , &(*hash)->hash);
	}else if(n % 3 == 1){
		//arvore
	}else{
		//lista
	}
}
void hash_insert_1(int ent, Hash **hash){
	if((*hash)->vet[ent % (*hash)->tam] == -1){
		(*hash)->vet[ent % (*hash)->tam] = ent;
	}else{
		conflit_1(ent, hash);
	}
}
int main(){
	
}
