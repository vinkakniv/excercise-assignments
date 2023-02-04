package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolverTest {
    @Test
    public void testTwoSumOnEmptyArray() {
        assertFalse(new Solver().isExistTwoSum(new int[]{}, 0), "Two sum doesn't crash/giving wrong result on empty array");
    }

    @Test
    public void testTwoSumNotFound() {
        assertFalse(new Solver().isExistTwoSum(new int[] {1, 2, 7}, 10), "Two sum should not found any match");
    }

    @Test
    public void testTwoSumFoundDifferentValue() {
        assertTrue(new Solver().isExistTwoSum(new int[]{1, 2, 3}, 4), "Two sum should consider different number with different value");
    }

    @Test
    public void testTwoSumFoundSameValue() {
        assertTrue(new Solver().isExistTwoSum(new int[]{1, 2, 2}, 4), "Two sum should consider different number with the same value");
    }

    @Test
    public void testTwoSumNotConsiderSameNumber() {
        assertFalse(new Solver().isExistTwoSum(new int[] {2}, 4), "Two sum should not consider the same number twice");
    }
}
