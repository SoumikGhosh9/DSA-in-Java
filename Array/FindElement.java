// Find the element in an array

import java.util.Scanner;

public class FindElement {

    static int findElement(int arr[], int n, int x){
        for(int i =0; i< n; i++){
            if(arr[i] == x){
                x = i;
            }
        }
        return x;
    }
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the element to be searched");
    int k = sc.nextInt();
     System.out.println("Enter the element of the array");
    for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Element found at index: " + findElement(arr, n, k));
    sc.close();
}
}