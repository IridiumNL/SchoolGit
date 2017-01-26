/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

/* This program takes a positive integer and then prints that many prime numbers, starting from 2. */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int n;

int isPrime(int n) {
	for(int i = 2; i <= sqrt(n); i++) {
		if((n % i) == 0) {
			return 0;
		}
	}
	return 1;
}

void generatePrimes(int n) {
	int currentCheck = 2;
	do {
		if(isPrime(currentCheck) == 1) {
			printf("%i ", currentCheck);
			n--;
		}
		currentCheck++;
	} while (n > 0);
	printf("\n");
}

int main(int argc, char **argv) {
	char buff[80];
	printf("Please input a positive integer, then I will print out that many prime numbers: ");
	fgets(buff, sizeof(buff), stdin);
	n = atoi(buff);
	generatePrimes(n);
}
