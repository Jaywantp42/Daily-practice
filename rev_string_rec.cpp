/*WAP to Reverse a Sentence Using Recursion*/

#include <iostream>
using namespace std;
void reverse(char *str) {
   if(*str == '\0')
   return;
   else {
      reverse(str+1);
      cout<<*str;
   }
}
int main() {
   char str[] = "Amul doodh pita hai india";
   cout<<"Original String: "<<str<<endl;
   cout<<"Reversed String: ";
   reverse(str);
   return 0;
}