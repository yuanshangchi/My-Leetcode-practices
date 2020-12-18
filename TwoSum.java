import java.util.HashMap;
import java.util.Arrays;

class TwoSum{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            
            if (mp.containsKey(nums[i]))
            {
                ans[0] = mp.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            mp.put(target - nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] testInput = {4,3,154,6,5};
        int testTarget = 10;
        TwoSum test = new TwoSum();
        int[] result = test.twoSum(testInput, testTarget);
        System.out.println(Arrays.toString(result));
    }
}