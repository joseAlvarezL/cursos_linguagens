#include <stdio.h>
#include <stdlib.h>

int main(void){
	
	char email[30],nome[10],nomeCompleto[30],cod[3],codRastreio[70];
	
	printf("Digite o Email: ");
	scanf("%s",&email);
	
	printf("Digite seu o primeiro nome: ");
	scanf("%s",&nome);
	
	printf("Digite o nome completo: ");
	scanf("%s",&nomeCompleto);
	
	printf("Digite o código do pedido: ");
	scanf("%s",&cod);
	
	printf("Digite o link do rastreio: ");
	scanf("%s",&codRastreio);
	
	printf("Obrigado pela sua compra, %s!\n\n",nome);
	
	printf("Ola, %s!\n"),nomeCompleto;
	printf("Queremos agradecer por sua recente compra em nossa loja. Seu pedido #%s está a caminho e estamos\n",cod);
	printf("animados para que você receba seus novos produtos.\n\n");
	printf("Quando seu pedido for entregue, gostaríamos de pedir que você deixe uma avaliação na descrição do\n");
	printf("produto. Sua opinião é muito importante para nós e para outros clientes.\n\n\n");
	printf("Cód Rastreio: %s\n",codRastreio);
	printf("Agradecemos mais uma vez pela confiança em nossa loja. Esperamos que você adore suas novas peças!\n");
	printf("Atenciosamente,\n\n");
	printf("Jaina Modas");
	
	system("pause");
	return 0;
}
