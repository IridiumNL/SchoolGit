/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

// This program takes a positive integer and decides if it is a perfect number

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv) {
	char buff[80];
	int n, sum;
	int i = 0;
	printf("Please input a positive integer: ");
	fgets(buff, sizeof(buff), stdin);
	n = atoi(buff);

	while(i<n) {
		i++;
		if((n%i) == 0) {
			sum += i;
			if(sum == (2*n)) {
				printf("%i is a perfect number!\n", n);
			} else {
				printf("%i is NOT a perfect number.\n", n);
			}
		}
	}
	return 0;
}
