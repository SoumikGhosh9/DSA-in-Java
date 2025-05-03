// Take a look at the following code. It takes an array of integers as input and prints a bar chart using asterisks. The height of each bar corresponds to the value of the integer in the array.

// The code uses a nested loop to print the bars. The outer loop iterates from the maximum value down to 1, and the inner loop checks each element in the array to see if it is greater than or equal to the current height of the bar. If it is, an asterisk is printed; otherwise, a tab character is printed.




import java.util.Scanner;
public class BarChart {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int bar = max; bar >=1; bar--){
            for(int i=0; i<n; i++){
                if(arr[i] >= bar){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            sc.close();
        }
      
    }
    
} 

