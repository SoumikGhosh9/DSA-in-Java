// Given an array of integers, reverse the array in-place without using any extra space.


import java.util.Arrays;
public class ReverseArray{
        static void reverse(int arr[]){
            int left=0, right = arr.length-1;
            while(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        public static void main(String[] args){
            int arr[] = {5,4,3,2,1};
            reverse(arr);
            System.out.print(Arrays.toString(arr));
        }
}