package Arrays;

public class peakElement {
    public static void main(String[] args) {
        int[] arr = {4,6,2,8,9,17};
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println("The peak element : " + arr[i]);
            }
        }
    }
}
