import java.util.HashMap;

/**
 * Sums only distinct numbers using a HashMap to check for multiple occurrences
 */

public class UniqueSum {
    public static int findUniqueSum(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int i : nums) {
            if (numMap.containsKey(i))
                numMap.put(i, numMap.get(i) + 1);
            else
                numMap.put(i, 1);
        }

        for (Integer key : numMap.keySet()) {

            if (numMap.get(key) == 1)
                sum += key;
        }
        return sum;

    }
}
