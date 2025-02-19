#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	
	//DECLARAÇÃO DE VARIÁVEIS
	int n1 = 12; //atribuindo valor para variavel | d
	float n2 = 6.43; //calculo de nota aluno | utiliza 4 bytes | f
	char letra = 'a'; // só 1 caracter | c
	char frase[10] = "Galinha!"; // | s
	double n3 = 1.233234; //float melhorado | utiliza 8 bytes e tem o doblo de precisão e cs decimais [15] | f
	
	int valor1,valor2,soma,sub,mult,di,numero,resto,dia;
	float nota1, nota2, media;
	
	/*
	//USO DO COMANDO prinf COM DIVERSAS VARIÁVEIS
	printf("Exibindo num inteiro: %d\n",n1);
	printf("Exibindo num real fracionado: %f\n", n2);
	printf("Exibindo 1 caracter %c\n",letra);
	printf("Exibindo 1 frase: %s\n",frase);
	printf("Exibindo num real +fracionado: %f\n",n3);
	printf("Exibindo todas palavras chaves: %d %f %c %s %f\n",n1,n2,letra,frase,n3);
	
	//UTILIZAÇÃO DE scanf
	printf("Digite um numero inteiro: ");
	scanf("%d",&valor1);
	
	printf("Digite outro numero inteiro: ");
	scanf("%d",&valor2);
	
	//OPERADORES ARITMÉTICOS
	soma = valor1+valor2;
	sub = valor1-valor2;
	mult = valor1*valor2;
	di = valor1/valor2;
	
	printf("Valor da soma de %d + %d = %d\n",valor1,valor2,soma);
	printf("Valor da subtracao de %d - %d = %d\n", valor1,valor2,sub);
	printf("Valor da multiplicacao de %d * %d = %d\n",valor1,valor2,mult);
	printf("Valor da divisaoo de %d / %d = %d\n",valor1,valor2,di);
	
	
	//OPERADOR % RESTO DA DIVISÃO
	printf("Digite um numero inteiro: ");
	scanf("%d",&numero);
	resto = numero%2; //divisivel por 2 = par | caso não = impar
	printf("Resto da divisao: %d\n",resto);
	
	//ESTRUTURA DE DECISÃO
	if(resto == 0) // if(condição)
	{
		printf("Numero par!\n");
	}
	else
	{
		printf("Numero impar\n");
	}
	
	
	//USANDO float FORMATANDO CASAS DECIMAIS
	printf("Digite a primeira nota: ");
	scanf("%f",&nota1);
	printf("Digite a segunda nota: ");
	scanf("%f",&nota2);
	media = (nota1+nota2)/2;
	printf("Media = %.2f\n",media);	// casas decimais - %.2f
	
	//if ANINHADO
	if(media>=6)
	{
		printf("Aluno aprovado!\n");
	}
	else
		if(media<3)
		{
			printf("Aluno reprovado!\n");
		}
			else
			{
				printf("Aluno em recuperacao\n");
		
			}
	*/
	
	printf("Digite um numero de 1 a 7: ");
	scanf("%d",&dia);
	
	switch(dia)
	{
		case 1:
			printf("Domingo\n");
		break;
		case 2:
			printf("Segunda\n");
		break;
		case 3:
			printf("Terca\n");
		break;
		case 4:
			printf("Quarta\n");
		break;
		case 5:
			printf("Quinta\n");
		break;
		case 6:
			printf("Sexta\n");
		break;
		case 7:
			printf("Sabado\n");
		break;
		
		default:
			printf("Valor invalido!\n");
	}
	
	
	system("pause");//somente para windows
	return 0;
}
