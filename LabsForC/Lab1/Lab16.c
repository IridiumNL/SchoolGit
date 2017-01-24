/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

// This program takes an integer and gives you its sum of alternating series

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, char **argv) {
	char buff[80];
	int n;
	double ans, sum;
	double b = 1;
	printf("Please enter a positive integer: ");
	fgets(buff, sizeof(buff), stdin);
	n = atoi(buff);
	
	for(double i = 0; i <= n; i++) {
		ans = pow(-b, i-b);
		ans *= i;
		sum += ans;
	}
	
	printf("Your sum is: %2.0lf\n", sum);
	return 0;
}
