/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

/* This program will take 3 integers from the user and shifts them all to the next variable address. */

#include <stdio.h>
#include <stdlib.h>

int a, b, c;
int *iptr;

/* void shift() {
	int tempA = a;
	int tempB = b;
	a = c;
	b = tempA;
	c = tempB;
}

The code I originally used to swap the values, before implementing pointers.

*/


void shift(int a, int b, int c) {
	int tempA = a;
	iptr = &a;
	*iptr = c;
	iptr = &c;
	*iptr = b;
	iptr = &b;
	*iptr = tempA;
	printf("After being shifted, your values are:  a = %i, b = %i, c = %i\n", 	a, b, c);
}

int main(int argc, char **argv) {
	char buff[80];
	printf("Please input your values for a, b and c one after the other: ");
	fgets(buff, sizeof(buff), stdin);
	a = atoi(buff);
	fgets(buff, sizeof(buff), stdin);
	b = atoi(buff);
	fgets(buff, sizeof(buff), stdin);
	c = atoi(buff);
	printf("Just to verify, your values are: a = %i, b = %i, c = %i\n", a, b, 	c);
	shift(a, b, c);
	return 0;
}
