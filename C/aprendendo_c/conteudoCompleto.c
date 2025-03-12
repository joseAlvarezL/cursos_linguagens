#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
struct Pessoa {
    char nome[20]; // Array de caracteres para o nome
    int idade;     // Inteiro para a idade
};
int somar(int a, int b) {
    return a + b;
}
int main(){
	setlocale(LC_ALL, "");
	
	
int resultado = somar(3, 4);
    printf("Soma de 3 + 4 = %d\n", resultado);


	return 0;

}


