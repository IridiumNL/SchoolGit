/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	    *********
********************************/

/* This program tests the way pointers work. Assigns original variables, then changes them using the dereference operator, * */

#include <stdio.h>
 
int main(int argc, char **argv) {
	int a = 5;
	char b = 'g';
	int *iptr;
	char *cptr;
	iptr = &a;
 	cptr = &b;
	printf("%i %c\n", a, b);
	*iptr = 2;
	printf("%i %c\n", a, b);
	cptr = &b;
	*cptr = 'j';
	printf("%i %c\n", a, b);
	return 0;
}
