import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 测试类：L2023120242_4_Test
 *
 * 测试用例设计原则：
 * 1. 等价类划分：根据输入数据的不同情况（如有效数组、单一元素、空数组、极大差值等），进行等价类划分，确保每种情况都得到验证。
 * 2. 边界条件测试：测试数组元素数量为最小值的情况（如只有一个元素或为空）。
 * 3. 正常情况测试：验证常规情况下的最大差值计算。
 */
public class L2023120242_4_Test {

    /**
     * 测试目的：验证正常数组的最大差值
     * 用到的测试用例：数组 [3, 6, 9, 1]，期望排序后的最大差值为 3
     */
    @Test
    void testMaximumGapWithValidArray() {
        Solution4 solution = new Solution4();
        int[] nums = {3, 6, 9, 1};  // 输入的数组
        int result = solution.maximumGap(nums);  // 调用被测试的方法
        assertEquals(3, result, "排序后的最大差值应为 3");  // 断言结果
    }

    /**
     * 测试目的：验证只有一个元素的数组（无差值）
     * 用到的测试用例：数组 [10]，期望结果为 0
     */
    @Test
    void testMaximumGapWithSingleElement() {
        Solution4 solution = new Solution4();
        int[] nums = {10};  // 输入的数组
        int result = solution.maximumGap(nums);  // 调用被测试的方法
        assertEquals(0, result, "数组只有一个元素，差值应为 0");  // 断言结果
    }

    /**
     * 测试目的：验证空数组（无差值）
     * 用到的测试用例：空数组，期望结果为 0
     */
    @Test
    void testMaximumGapWithEmptyArray() {
        Solution4 solution = new Solution4();
        int[] nums = {};  // 输入的空数组
        int result = solution.maximumGap(nums);  // 调用被测试的方法
        assertEquals(0, result, "空数组，差值应为 0");  // 断言结果
    }

    /**
     * 测试目的：验证有极大数值差异的数组
     * 用到的测试用例：数组 [1000000000, 0]，期望结果为 1000000000
     */
    @Test
    void testMaximumGapWithLargeNumbers() {
        Solution4 solution = new Solution4();
        int[] nums = {1000000000, 0};  // 输入的数组
        int result = solution.maximumGap(nums);  // 调用被测试的方法
        assertEquals(1000000000, result, "最大差值应为 1000000000");  // 断言结果
    }
}