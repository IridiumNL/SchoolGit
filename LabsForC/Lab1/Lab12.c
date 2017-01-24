/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

/* This code asks for an int, float and character using the fgets function and prints them in a neat list using the printf function */

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv) {
	char buff[80];
	int n;
	printf("Enter an integer: ");
	fgets(buff, sizeof(buff), stdin);
	n = atoi(buff);
	float f;
	printf("Enter a float: ");
	fgets(buff, sizeof(buff), stdin);
	f = atof(buff);
	char c;
	printf("Enter a character: ");
	c = getchar();

	printf("Your number is: %i\nYour character is: %c\nYour float is: %2.4f\n", n, c, f);
	return 0;
}
