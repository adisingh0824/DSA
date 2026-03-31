import java.util.*;
public class linear {
    public static void main(String[] args) {
        int[] nums={23,45,1,2,8,19,-3,16,-11,28};
        int target =-50;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index =0;index<arr.length;index++){
            // check for element at every index if it is = target
            int element =arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
