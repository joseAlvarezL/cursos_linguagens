#include <stdio.h> // Inclui a biblioteca padrão para entrada/saída

// Struct: Agrupa dados relacionados
struct Pessoa {
    char nome[20];
    int idade;
};

// Função: Bloco de código reutilizável
int somar(int a, int b) {
    return a + b;
}

int main() { // Corpo do programa: onde tudo acontece
    // Declarando variáveis: "caixinhas" para guardar valores
    int numero = 10;
    float decimal = 5.5;
    char letra = 'X';

    // Printf: Mostra texto ou valores na tela
    printf("Bem-vindo ao programa!\n");
    printf("Numero: %d, Decimal: %.1f, Letra: %c\n", numero, decimal, letra);

    // Scanf: Pega entrada do usuário
    int entrada;
    printf("Digite um numero inteiro: ");
    scanf("%d", &entrada);

    // If e Else: Condições para tomar decisões
    if (entrada > 0) {
        printf("O numero %d eh positivo!\n", entrada);
    } else if (entrada == 0) {
        printf("O numero eh zero.\n");
    } else {
        printf("O numero %d eh negativo!\n", entrada);
    }

    // Switch case: Escolha entre várias opções
    switch (entrada % 2) {
        case 0:
            printf("O numero eh par.\n");
            break;
        case 1:
        case -1:
            printf("O numero eh impar.\n");
            break;
        default:
            printf("Algo estranho aconteceu.\n");
    }

    // Operador && (E) e || (OU): Combina condições
    if (entrada > 0 && entrada < 10) {
        printf("O numero esta entre 0 e 10.\n");
    } else if (entrada == 5 || entrada == 10) {
        printf("O numero eh 5 ou 10.\n");
    }

    // For: Laço para repetir algo um número fixo de vezes
    printf("Contagem de 0 a 4: ");
    for (int i = 0; i < 5; i++) {
        printf("%d ", i);
    }
    printf("\n");

    // While: Laço que repete enquanto uma condição é verdadeira
    int contador = entrada;
    printf("Contagem regressiva a partir de %d: ", entrada);
    while (contador > 0) {
        printf("%d ", contador);
        contador--;
    }
    printf("\n");

    // Do while: Laço que executa pelo menos uma vez
    int x = 0;
    do {
        printf("Executando do-while pelo menos uma vez: %d\n", x);
        x++;
    } while (x < 0); // Só repete se x < 0, mas já executou uma vez

    // Vetor (array): Lista de valores do mesmo tipo
    int vetor[3] = {1, 2, 3};
    printf("Vetor: ");
    for (int i = 0; i < 3; i++) {
        printf("%d ", vetor[i]);
    }
    printf("\n");

    // Matriz: Tabela de valores (array 2D)
    int matriz[2][2] = {{4, 5}, {6, 7}};
    printf("Matriz:\n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            printf("%d ", matriz[i][j]);
        }
        printf("\n");
    }

    // Struct: Usando a struct Pessoa definida acima
    struct Pessoa p1 = {"Ana", 25};
    printf("Pessoa: Nome = %s, Idade = %d\n", p1.nome, p1.idade);

    // Função: Chamando a função somar
    int resultado = somar(3, 4);
    printf("Soma de 3 + 4 = %d\n", resultado);

    return 0; // Fim do programa
}
