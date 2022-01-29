import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Solution2 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i=0 ; i< nums.length ;i++ ){
             int middle = target - nums[i];
             if(map.containsKey(middle) && map.get(middle)!= i)
                return new int[] {i,map.get(middle)};
        }
        return null;
    }

    public static void main(String[] args){
        int [] result = Solution2.twoSum(new int[]{2,7,11,15}, 13);
        List<Integer> list =Arrays.asList(1,2,3,4);
        list.stream().filter(number-> number % 2==0);
        System.out.println(Arrays.toString(result));
    }
}
