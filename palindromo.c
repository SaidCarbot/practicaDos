#include <stdio.h>

int main() {
    int tam, target;

    printf("Ingrese el tamano del arreglo:");
    scanf("%d", &tam);

    int nums[tam];


    printf("Ingrese los elementos del arreglo:\n");
    for (int i=0;i<tam;i++){
        printf("Elemento %d:", i+1);
        scanf("%d", &nums[i]);
    }


    printf("Ingrese el valor de target:");
    scanf("%d", &target);


    printf("El arreglo es: ");
    for(int i=0;i<tam;i++){
        printf("%d", nums[i]);
    }
    printf("\n");


    for(int i=0;i<tam-1;i++){
        for(int j=i+1;j<tam;j++){
            if(nums[i]+nums[j]==target){
                printf("Los indices son: %d y %d\n", i, j);
                return 0;
            }
        }
    }

    printf("No se encontraron dos n�meros que sumen %d\n", target);
    return 0;
}
