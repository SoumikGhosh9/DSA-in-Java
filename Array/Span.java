
// Find the difference between the maximum and minimum element in an array

public class Span {
    static int difference(int arr[], int max, int min){
        max  = arr[0];
        min = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return max - min;
    }
    

    public static void main(String[] args) {
        int arr[] = {10, 2, 3, 4, 15};
        int max = arr[0];
        int min = arr[0];
        System.out.println("Difference: " + difference(arr, max, min));
    }

}
