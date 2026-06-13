import java.util.*;
public class linearsearch{
    public static void main(String args[]){
        try ( Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter target element");
        int t=sc.nextInt();
        System.out.println("Enter the elements of array");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==t){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
}