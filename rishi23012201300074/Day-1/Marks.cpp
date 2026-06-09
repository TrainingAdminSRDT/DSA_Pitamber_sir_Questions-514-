/*
Below 50 Fail
90 - 100 A
80 - 90 B
70 - 80 C
60 - 70 D
50 - 60 D--
Below 50 Fail
*/

#include <iostream>
using namespace std;
int main() {
    int marks;
    cout << "Enter your marks: ";
    cin >> marks;

    if (marks >= 90 && marks <= 100) {
        cout << "Grade: A" ;
    }  if (marks >= 80 && marks < 90) {
        cout << "Grade: B" ;
    }  if (marks >= 70 && marks < 80) {
        cout << "Grade: C" ;
    }  if (marks >= 60 && marks < 70) {
        cout << "Grade: D" ;
    }  if (marks >= 50 && marks < 60) {
        cout << "Grade: D--" ;
    } if (marks < 50) {
        cout << "Grade: Fail" ;
    }

    return 0;
}