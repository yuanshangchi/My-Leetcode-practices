import java.util.Arrays;
public class ProductOfArrayExceptSelf {
    public int[] productOfArrayExceptSelf(int[] nums){
        int[] result = new int[nums.length];
        for(int i = 0, temp = 1; i < nums.length; i++){
            result[i] = temp;
            temp *= nums[i];
        }
        //loop above stores each num's left-side product then get temporary result

        for(int j = nums.length-1, temp = 1; j >= 0; j--){
            result[j] *= temp;
            temp *= nums[j];
        }
        //multiplies result with each num's right-side product then get actual result

        return result;
    }

    public static void main(String[] args) {
        int[] testInput = {1,2,3,4};
        ProductOfArrayExceptSelf test = new ProductOfArrayExceptSelf();
        int[] output = test.productOfArrayExceptSelf(testInput);
        System.out.println(Arrays.toString(output));
    }
}
