#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	printf("------------Animal favorito------------\n");

	int cor,altura,final;
	
	printf("Digite a cor do seu animal favorito: \n");
	printf("1 . Caramelo\n");
	printf("2 . Branco\n");
	scanf("%d",&cor);
	
	printf("Digite a altura do seu animal favorito: \n");
	printf("1 . Baixo\n");
	printf("2 . Alto\n");
	scanf("%d",&altura);
	
	if(cor == 1 && altura==1)
	{
		printf("Seu animal favorito e um caramelo\n");
	}
	
	system("pause");
	return 0;
}
