#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	float nota1,nota2,media;
	
	printf("Digite a primeira nota: ");
	scanf("%f",&nota1);
	
	printf("Digite a segunda nota: ");
	scanf("%f",&nota2);
	
	media = (nota1+nota2)/2;
	
	printf("A media e %.1f\n",media);
	
	if(media>=6)
	{
		printf("Passou de semestre\n");
	}
	else
		if(media<3)
		{
		printf("Reprovou de ano\n");
		}
			else
				printf("Em recuperacao\n");
	system("pause");
	return 0;
}
	
