public class SumOfArray {
    public static void main(String[] args){
        int[] arr  = {10, 20, 30, 20, 40, 10, 30, 50, 20, 10};
        int i, len, sum = 0;
        int avg;
        //getting length of array
        len = arr.length;

        //default sum value
        sum = 0;

        //sum of all values in the array using for loop
        for(i = 0; i < len; i++){
            sum += arr[i];
        }
        avg = sum / len;
        System.out.println("Average of array : " + avg);
    }
}
