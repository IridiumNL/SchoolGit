/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

// This program takes a positive integer and outputs whether or not it is even.

#include <stdio.h>
#include <stdlib.h>

int n;

int isEven(int n) {
	if((n%2) == 0) {
		return 1;
	} else {
		return 0;
	}
}

int main(int argc, char **argv) {
	char buff[80];
	printf("Please input a positive integer to determine if it is even: ");
	fgets(buff, sizeof(buff), stdin);
	n = atoi(buff);
	if(isEven(n) == 1) {
		printf("Your number is even.\n");
	} else {
		printf("Your number is odd.\n");
	}
	return 0;
}
