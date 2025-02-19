#include <stdio.h>// Inclui a biblioteca para operações de entrada e saída (como printf e scanf).
#include <stdlib.h>// Inclui a biblioteca que contém funções utilitárias, como system().

int main(void)// Define a função principal, que é o ponto de entrada do programa.
{
	int nota1,nota2,media;
	printf("Digite nota 1/3: ");
	scanf("%d",&nota1);
	printf("Digite nota 2/3: ");
	scanf("%d",&nota2);
	media = (nota1+nota2)/2;
	printf("Media: %d\n",media);
	
	
	system("pause");// Executa o comando do sistema para pausar a execução e esperar a interação do usuário.
	return 0;// Retorna 0 para indicar que o programa terminou com sucesso.
}
