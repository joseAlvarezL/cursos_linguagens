#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	
	// ----- DECLARAÇÃO DE VARIÁVEIS ----- 
	int n1 = 12; //atribuindo valor para variavel | d
	float n2 = 6.43; //calculo de nota aluno | utiliza 4 bytes | f
	char letra = 'a'; // só 1 caracter | c
	char frase[10] = "Galinha!"; // | s
	double n3 = 1.233234; //float melhorado | utiliza 8 bytes e tem o doblo de precisão e cs decimais [15] | f
	
	int valor1,valor2,soma,sub,mult,di,numero,resto,dia,cont=100,resp;
	float nota1, nota2, media, freq;
	
	/*
	// ----- USO DO COMANDO prinf COM DIVERSAS VARIÁVEIS ----- 
	printf("Exibindo num inteiro: %d\n",n1);
	printf("Exibindo num real fracionado: %f\n", n2);
	printf("Exibindo 1 caracter %c\n",letra);
	printf("Exibindo 1 frase: %s\n",frase);
	printf("Exibindo num real +fracionado: %f\n",n3);
	printf("Exibindo todas palavras chaves: %d %f %c %s %f\n",n1,n2,letra,frase,n3);
	
	// ----- UTILIZAÇÃO DE scanf ----- 
	printf("Digite um numero inteiro: ");
	scanf("%d",&valor1);
	
	printf("Digite outro numero inteiro: ");
	scanf("%d",&valor2);
	
	// ----- OPERADORES ARITMÉTICOS ----- 
	soma = valor1+valor2;
	sub = valor1-valor2;
	mult = valor1*valor2;
	di = valor1/valor2;
	
	printf("Valor da soma de %d + %d = %d\n",valor1,valor2,soma);
	printf("Valor da subtracao de %d - %d = %d\n", valor1,valor2,sub);
	printf("Valor da multiplicacao de %d * %d = %d\n",valor1,valor2,mult);
	printf("Valor da divisaoo de %d / %d = %d\n",valor1,valor2,di);
	
	
	// ----- OPERADOR % RESTO DA DIVISÃO ----- 
	printf("Digite um numero inteiro: ");
	scanf("%d",&numero);
	resto = numero%2; //divisivel por 2 = par | caso não = impar
	printf("Resto da divisao: %d\n",resto);
	
	// ----- ESTRUTURA DE DECISÃO ----- 
	if(resto == 0) // if(condição)
	{
		printf("Numero par!\n");
	}
	else
	{
		printf("Numero impar\n");
	}
	
	
	// ----- USANDO float FORMATANDO CASAS DECIMAIS ----- 
	printf("Digite 1 numero: ");
    scanf("%f",&valor1);
    printf("Valor com casas decimais: %.2f\n",valor1);
	

	
	// ----- switch...case: ESCOLHE UMA ENTRE VÁRIAS OPÇÕES ----- 
	//if...else AVALIA CONDIÇÕES, switch COMPARA UM VALOR FIXO COM VÁRIOS CASOS
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
	
	
	// ----- OPERADOR TERNÁRIO: PODE SER MAIS CURTO QUE USAR if...else EM ALGUMAS OCASIÕES ----- 
	printf("Digite um numero inteiro: ");
	scanf("%d",&numero);
	
	//CODIÇÃO A TESTAR ? VERDADEIRO : FALSO
	
	numero > 0 ? printf("Positivo\n") : printf("Negativo\n");

	
	printf("Digite a frequencia do aluno: ");
	scanf("%f",&freq);
	printf("Digite a primeira nota: ");
	scanf("%f",&nota1);
	printf("Digite a segunda nota: ");
	scanf("%f",&nota2);
	media = (nota1+nota2)/2;
	printf("Media = %.2f\n",media);	// casas decimais - %.2f
	

	// ----- OPERADOR LÓGICO &&: RETORNA true SE TODAS AS CONDIÇÕES FOREM VERDADEIRAS ----- 
	if(media>=6 && freq >= 75)
	{
		printf("Aluno aprovado!\n");
	}
	else
	// ----- OPERADOR LÓGICO ||: RETORNA true SE PELO MENOS UMA CONDIÇÃO FOR VERDADEIRA ----- 
		if(media<3 || freq<75)
		{
			printf("Aluno reprovado!\n");
		}
			else
			{
				printf("Aluno em recuperacao\n");
		
			}
		
		

	// ----- for: ESTRUTURA DE REPETIÇÃO COM INICIALIZAÇÃO, CONDIÇÃO(LIMITE) E INCREMENTO ----- 
	for(cont=1; cont <=10; cont = cont++)//incremento use o ++ ou +1
	{
		printf("%d - Boa tarde\n",cont);
	}
	
	
	// ----- ESTRUTURA DE REPETIÇÃO while ----- 
	cont =1; //INICIALIZANDO A VARIÁVEL DE CONTROLE
	
	// while(condição) REPETE ENQUANTO A CONDIÇÃO FOR VERDADEIRA
	while (cont<=5)
	{
		printf("%d - Linguagem C\n",cont);
		cont++; //INCREMENTO DA VARIÁVEL DE CONTROLE
	}
	
	
	//  ----- ESTRUTURA DE REPETIÇÃO do ... while() ----- 
	
	//EXECUTA UM COMANDO PRIMEIRO E SOMENTE TESTA SE A CONDIÇÃO É VERDADEIRA NO FINAL
	//ISTO GARANTE QUE O COMANDO SERÁ EXECUTADO NO MÍNIMO UMA VEZ
	
	do 
	{
		printf("%d - looping do..while\n",cont);
		cont++; //INCREMENTO DA VARIÁVEL DE CONTROLE
	}
	while(cont <=10);
	*/
	do 
	{
		printf("Digite um valor positivo para repetir\n");
		scanf("%d",&resp);
	}
	while(resp > 0);
	
	system("pause");//somente para windows
	return 0;
}	
