/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

/* This program will take a positive integer as input and tell you if it is prime or not. */

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

int main(int argc, char **argv) {
	char buff[80];
	printf("Please input a positive integer to determine if it's prime: ");
	fgets(buff, sizeof(buff),stdin);
	n = atoi(buff);
	if(isPrime(n) == 1) {
		printf("Your number is prime.\n");
	} else {
		printf("Your number is not prime.\n");
	}
	return 0;
}
	
	
