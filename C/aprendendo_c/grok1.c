#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

void trocar(int *a,int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
}

int main(){
setlocale(LC_ALL,"");

int x = 5, y = 10;
    printf("Antes: %d, %d\n", x, y);
	trocar(&x,&y);
    printf("Depois: %d, %d\n", x, y);


    
	
	
    return 0;
}
	
    
