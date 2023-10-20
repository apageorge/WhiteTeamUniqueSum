/**
 * Run the example sets of numbers to test our solution
 */
public class TestUniqueSum {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3};
        System.out.println("test array 1: expected output 6 ");
        System.out.println("actual output: " + UniqueSum.findUniqueSum(integerArray));

        int[] integerArray2 = {3, 3, 3};
        System.out.println("test array 2: expected output 0 ");
        System.out.println("actual output: " + UniqueSum.findUniqueSum(integerArray2));

        int[] integerArray3 = {1, 1, 2};
        System.out.println("test array 1: expected output 2 ");
        System.out.println("actual output: " + UniqueSum.findUniqueSum(integerArray3));
    }
}