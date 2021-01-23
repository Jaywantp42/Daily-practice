/*WAP to Display Uppercased A to Z*/


// C++ program to print alphabets 
#include <iostream> 
using namespace std; 
 
// Function to print the alphabet 
// in upper case 
void uppercaseAlphabets() 
{ 

	// uppercase 
	for (char c = 'A'; c <= 'Z'; ++c) 
		cout << c << " "; 

	cout << endl; 
} 

// Driver code 
int main() 
{   
    //char ch;
	cout << "Uppercase Alphabets" << endl; 
	uppercaseAlphabets(); 

	return 0; 
} 
