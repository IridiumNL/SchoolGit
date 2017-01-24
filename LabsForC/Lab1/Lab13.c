/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

/* This code asks for two integers and finds the sum, difference, product, quotient and remainder, then prints them all in a neat list using the printf function */

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv) {
	int a, b, sum, difference, product, quotient, remainder;
	char buff[80];
	printf("Enter a: ");
	fgets(buff, sizeof(buff), stdin);
	a = atoi(buff);
	printf("Enter b: ");
	fgets(buff, sizeof(buff), stdin);
	b = atoi(buff);
	sum = a+b;
	difference = a-b;
	product = a*b;
	quotient = a/b;
	remainder = a%b;

	printf("Sum: %i\nDifference: %i\nProduct: %i\nQuotient: %i\nRemainder: %i\n", sum, difference, product, quotient, remainder);	
	return 0;
}
