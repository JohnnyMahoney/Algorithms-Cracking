package randomAlgs;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElementFirst(int[] nums) {
        Map<Integer,Integer> map  = new HashMap<>();
        int majorityCount = nums.length /2;

        for(int num: nums) {
            map.put(num, map.getOrDefault(num,0) +1);

            if(map.get(num) > majorityCount) {
                return num;
            }
        }
        return -1;
    }

    public static int majorityElementSecond(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int num : nums) {
            if(count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 :-1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,2,2};
        int result1 = majorityElementFirst(arr);
        int result2 = majorityElementSecond(arr);
        System.out.println(result1);
        System.out.println(result2);
    }
}
