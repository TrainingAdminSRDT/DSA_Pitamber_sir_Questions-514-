#include <iostream>
using namespace std;
int linearsearch(int arr[],int size,int target){
    for(int i=0;i<size;i++){
        if (arr[i]==target){
        return i;
    }}
    return -1;
}
int main(){
    int size;
    int target;
    cout<<"enter a target - ";
    cin>>target;
    cout<<"enter a sixe of the array - ";
    cin>>size;
    int number[size];
    cout <<"enter "<<size<<" array ";
    for( int i=0;i<size;i++)
    {
        cin>>number[i];
    }
    int result = linearsearch(number,size,target);
    if(result!=-1){
        cout<<"element found at index"<<result;
    }
    else{
        cout<<"element not found";}
}