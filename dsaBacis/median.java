import java.util.Arrays;

public class median {
    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        int n = nums1.length + nums2.length;
        int[] arr = new int[n];

        // Copy nums1
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }

        // Copy nums2
        for (int i = 0; i < nums2.length; i++) {
            arr[nums1.length + i] = nums2[i];
        }

        // Sort array
        Arrays.sort(arr);

        // Find median
        double median;
        if (n % 2 == 0) {
            median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
        } else {
            median = arr[n/2];
        }

        System.out.println("Median: " + median);
    }
}
