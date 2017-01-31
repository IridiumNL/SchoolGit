/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

/* This program takes an input of five numbers into an array and computes the sum of them, and presents the smallest and largest values. */

#include <stdlib.h>
#include <stdio.h>

int num[5];
char buff[5];

int sum(int num[]) {
	int sum = 0;
	for(int i=0; i<5; i++) {
		sum += num[i];
	}
	printf("Your sum is: %i\n", sum);
}

int findSmallest(int num[]) {
	int min = num[0];
	for(int i=1; i<5; i++) {
		if(num[i] < min) {
			min = num[i];
		}
	}
	printf("Your minimum value is: %i\n", min);
}

int findLargest(int num[]) {
	int max = num[0];
	for(int i=1; i<5; i++) {
		if(num[i] > max) {
			max = num[i];
		}
	}
	printf("Your maximum value is: %i\n", max);
}


int main(int argc, char **argv) {
	printf("Enter 5 numbers: ");
	for(int i=0; i<5; i++) {
		fgets(buff, sizeof(buff), stdin);
		num[i] = atoi(buff);
	}
	sum(num);
	findLargest(num);
	findSmallest(num);
	return 0;
}
