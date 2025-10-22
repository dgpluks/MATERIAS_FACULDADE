#include <stdlib.h>
#include<stdio.h>
typedef struct No{
	int valor;
	struct No *esq;
	struct No *dir;
}No;
typedef struct Arvore{
	struct No *raiz;
}Arvore;
No* new_node(int x){
	No *novo = malloc(sizeof (No));
	novo->valor = x;
	novo->dir = NULL;
	novo->esq = NULL;
	return novo;
}
Arvore* new_arvore(int y){
	Arvore *novo = malloc(sizeof(Arvore));
	novo->raiz = new_node(y);
	return novo;
}
void add(No *aqui, int value){
	if(aqui->valor == value){
		return;
	}else if(aqui->valor > value){
		aqui = aqui->dir;
		add(aqui, value);
	}else if(aqui->valor < value){
		aqui = aqui->esq;
	}

} 

int main (){
	Arvore *teste = new_arvore(10);
	printf("%d", teste->raiz->valor);
}
