/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

// This code asks for an integer grade (between 0-100 inclusive) and converts it to a letter grade

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv) {
	char buff[80];
	int grade;
	printf("Please input your numbered grade: ");
	fgets(buff, sizeof(buff), stdin);
	grade = atoi(buff);
	if(grade < 0 || grade > 100) {
		printf("Out of acceptable range. Please input an integer between 0 and 100, please try again!");
	} else if(grade > 84) {
		printf("Your letter grade is A\n");
	} else if(grade > 64) {
		printf("Your letter grade is B\n");
	} else if(grade > 54) {
		printf("Your letter grade is C\n");
	} else if(grade > 49) {
		printf("Your letter grade is D\n");
	} else if(grade < 50) {
		printf("Your letter grade is F :(\n");
	}
	
	return 0;
}

		
		
