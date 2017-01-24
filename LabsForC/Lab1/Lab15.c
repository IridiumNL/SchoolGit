/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

// This code takes in a character and tells you if it's a vowel or not

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv) {
	printf("Please input your character: ");
	char vowel = getchar();

	switch(vowel) {
		case 'a': printf("You've got yourself a vowel!\n"); break;
		case 'e': printf("You've got yourself a vowel!\n"); break;
		case 'i': printf("You've got yourself a vowel!\n"); break;
		case 'o': printf("You've got yourself a vowel!\n"); break;
		case 'u': printf("You've got yourself a vowel!\n"); break;
		case 'y': printf("Do you take me for a natual language processor?!\n"); break;
		default : printf("Not a vowel!\n"); break;
	}
	return 0;
}
