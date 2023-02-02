import java.util.Arrays;

/**
 * FileName: Test
 * author: gxs
 * Date: 2021/9/1  22:21
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,3,2,2};
        Arrays.sort(nums);
        for (int n : nums)
        System.out.print(n+" ");
    }
}
