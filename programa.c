#include <stdio.h>
int main()
{
	float a, b;
	float division;
	printf("Introduce el primer valor: ");
	scanf("%f",&a);
	printf("Introduce el segundo valor: ");
	scanf("%f",&b);
	division = (a / b);
	printf("La division es: %f", division);
	return 0;
}