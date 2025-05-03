// Sum of two arrays
// Given two arrays of digits representing two numbers, write a program to find their sum.

import java.util.Scanner;
public class SumofArrays {

    public static void main(String[] args){
        int  n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array");
        n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the elements of the first array");
        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in the second array");
        n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the elements of the second array");
        for(int j = 0; j<n2; j++){
            arr2[j] = sc.nextInt();
        }

        int [] sum = new int[n1>n2? n1 : n2];
        int c = 0;

        int i = n1-1;
        int j = n2-1;
        int k = sum.length-1;

        while(k >=0){
            int d =c;
            if(i >= 0){
                d += arr1[i];
            }
            if(j >= 0){
                d += arr2[j];
            }

            c = d/10;
            d = d%10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if(c != 0){
            System.out.println(c);
        }
        System.out.print("Sum of the two arrays is: ");
        for(int val:sum){
            System.out.print(val);
        }
        sc.close();
    }
    
}
