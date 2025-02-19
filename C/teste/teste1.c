#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    float valor1;
    
    printf("Digite 1 numero: ");
    scanf("%f",&valor1);
    
    printf("Valor com casas decimais: %.2f",valor1);
    
    system("pause");
    return 0;
}
