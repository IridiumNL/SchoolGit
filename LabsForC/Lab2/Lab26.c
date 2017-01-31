/********************************
********* RANDY PARSONS *********
*********   20133932    *********
*********    CT2530	*********
********************************/

/* This program takes a string of characters as input into a buffer and counts the number of vowels in it. */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>	// this include is to use the strlen function in for loop

char word[15];

int countVowels(char word[]) {
	int count = 0;
	for(int i = 0; i < strlen(word); i++) {
		switch(word[i]) {
			case 'a': count++; break;
			case 'e': count++; break;
			case 'i': count++; break;
			case 'o': count++; break;
			case 'u': count++; break;
			default : break;
		}
	}
	printf("Your word has %i vowels!\n", count);
}

int main(int argc, char **argv) {
	printf("Enter a word: ");
	fgets(word, sizeof(word), stdin);
	countVowels(word);
	return 0;
}
	
