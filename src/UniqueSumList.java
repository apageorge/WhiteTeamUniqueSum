import java.util.ArrayList;
import java.util.List;

public class UniqueSumList {
    public static int uniqueSum(int[] nums) {
        List<Integer> addedNums = new ArrayList<Integer>();
        List<Integer> deletedNums = new ArrayList<Integer>();
        for (int i:
            nums ) {
            if(!(addedNums.contains(i)) && !(deletedNums.contains(i))) {
                addedNums.add(i);
            } else if (addedNums.contains(i) && !(deletedNums.contains(i))) {
                addedNums.remove(Integer.valueOf(i));
                deletedNums.add(i);
            }

        }
        int result = 0;
        for (int i :
             addedNums) {
            result+=i;
        }
        return result;

    }
}
